package com.biz.bank.servire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.mode.BankBalanceVO;

public class BankServiceImp_02 implements BankService {

	String accIolistPath = null;
	String balanceFile = null;
	Map<String, BankBalanceVO> balanceList = null;
	FileReader fileReader = null;
	BufferedReader buffer = null;
	Scanner scan = null;

	public BankServiceImp_02(String balanceFile) throws FileNotFoundException {

		/*
		 * balanceFile 이름을 필드에 있는 this.balanceFile 에 저장하여 클래스내에서 자유롭게 접근할수 있도록 한다.
		 */
		this.balanceFile = balanceFile;

		// iolist를 저장할 폴더 선언
		accIolistPath = "src/com/biz/bank/iolist/";
		/*
		 * Map 자료구조는 HashMap LinkedHashMap TreeMap 가 있는데 키로 값을 검색하는 일이 많을때는 TreeMap 으로
		 * 초기화하는 것이 매우 효율적이다.
		 */
		balanceList = new TreeMap<String, BankBalanceVO>();
		fileReader = new FileReader(balanceFile);
		buffer = new BufferedReader(fileReader);
		scan = new Scanner(System.in);
	}

	/*
	 * balance.txt 파일을 읽어서 계좌정보를 balanceList에 추가하는 메서드를 작성
	 */

	@Override
	public void readBalance() throws IOException {
		String reader = "";
		while (true) {

			reader = buffer.readLine();
			if (reader == null)
				break;
			String[] banks = reader.split(":");

			BankBalanceVO vo = new BankBalanceVO(banks[0], Integer.valueOf(banks[1]), banks[2]);

			vo.setAcc(banks[0]);
			vo.setBalance(Integer.valueOf(banks[1]));
			vo.setDate(banks[2]);

			// Map의 구조를 계좌번호를 key하고
			// 값을 vo로 설정
			// Map에는 put() 메서드를 이용해서 List 추가
			balanceList.put(banks[0], vo);
		}

		// balance.txt 파일을 처음한번 읽어서
		// balanceList에 담고 나면
		// buffer와 fileReader는 하는일 끝나므로
		// 두 객체 모두 close() 실행하자
		// ※ 프로젝트가 종료될때
		// balance.txt 파일에 내용을 기록해야하는데
		// reader 상태로 열려 있으면
		// 기록이 잘 안되는 경우가 있기 때문이다.
		buffer.close();
		fileReader.close();

	} // readBalance end
		// String acc = "0001";

	/*
	 * 이 메서드는 프로젝트가 종료되기 직전에 실행되어서 balanceList에 담긴 내용을 balance.txt에 몽땅 기록한다.
	 */

	@Override
	public void writeBalance() throws IOException {

		FileWriter fileWriter;
		PrintWriter printWriter;

		fileWriter = new FileWriter(balanceFile);
		printWriter = new PrintWriter(fileWriter);

		/*
		 * Map 구조에 저장된 List를 vo로 추출해서 사용하기 위해서
		 * 먼저 Map 구조에 있는 key들을 set구조로 추출
		 * 
		 */
		Set<String> keyList =balanceList.keySet();
		/*
		 * 추출된 KeySet을 for문으로 반복하면서
		 * map.get(key)메서드를 호출해서
		 * vo를 하나씩 추출한다.
		 * 
		 * 그리고 알아서 요리한다.
		 */
		for (String key : keyList) {
			BankBalanceVO vo = balanceList.get(key);
			printWriter.printf("%s:%d:%s\n", vo.getAcc(), vo.getBalance(), vo.getDate());
		}

		printWriter.flush();
		printWriter.close();

	}

	@Override
	public BankBalanceVO pickAcc(String accNum) {

		/*
		 * Map구조에 저장된 어떤 값을 찾을때는 key 값만 알면 아주 단순한 코드로 값을 찾을수 있다
		 * 
		 * get(key)메서드는 map자료에 해당하는 key가 있으면 해당하는 값을 return할것이고
		 * 
		 * 그렇지않으면 null을 리턴할 것이다.
		 */
		return balanceList.get(accNum);
		// return null;
	}

	@Override
	public void inputMoney(String acc, int money) {
		/*
		 * for(BankBalanceVO vo : balanceList) { System.out.println(vo); }
		 */

		BankBalanceVO vo = pickAcc(acc);
		int bal = vo.getBalance();
		vo.setBalance(bal + money);

		// java 1.8(8) 이상에서 사용하는 새로운 날짜
		LocalDate localDate = LocalDate.now();
		vo.setDate(localDate.toString());

		// 입금이 잘 되었나를 콘솔에 확인 시켜주는 부분
		System.out.println("============================");
		System.out.println(vo);
		System.out.println("============================");

		FileWriter fileWriter;
		PrintWriter printWriter;

		// 계좌번호를 임시변수에 대입(저장)
		String accNum = vo.getAcc();

		/*
		 * 입출금 거래내역을 개인통장에 기록
		 */
		try {
			fileWriter = new FileWriter(accIolistPath + "KBANK_" + accNum, true);
			printWriter = new PrintWriter(fileWriter);

			// 파일에 내용을 기록하는 부분
			printWriter.printf("%s:%s:%d:%d:%d\n", vo.getDate(), "입금", money, 0, vo.getBalance());

			printWriter.flush();
			printWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void ontputMoney(String acc, int money) {

		BankBalanceVO vo = pickAcc(acc);
		int bal = vo.getBalance();

		// 출금일경우는 현잔액을 검사해서
		// 출금액보다 크면 출금 금지
		if (bal < money) {
			System.out.println("잔액부족!!!");
			return;
		}
		vo.setBalance(bal - money);

		// java 1.7 이하에서 지금도 사용하는 코드
		// 현재 컴퓨터날짜값을 가져오기
		Date date = new Date(System.currentTimeMillis());

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

		String curDate = sf.format(date);
		vo.setDate(curDate);

		// java 1.8(8) 이상에서 사용하는 새로운 날짜
		LocalDate localDate = LocalDate.now();
		vo.setDate(localDate.toString());

		System.out.println("============================");
		System.out.println(vo);
		System.out.println("============================");

		FileWriter fileWriter;
		PrintWriter printWriter;

		String accNum = vo.getAcc();

		/*
		 * 출금 거래내역을 개인통장에 기록
		 */
		try {
			fileWriter = new FileWriter(accIolistPath + "KBANK_" + accNum, true);
			printWriter = new PrintWriter(fileWriter);

			// 파일에 내용을 기록하는 부분
			printWriter.printf("%s:%s:%d:%d:%d\n", vo.getDate(), "출금", 0, money, vo.getBalance());

			printWriter.flush();
			printWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public int selectMenu() {
		System.out.println("==========================");
		System.out.println("1. 입금   2.출금   -9.종료");
		System.out.println("--------------------------");
		System.out.print("업무선택>>");
		String strMenu = scan.nextLine();

		int intMenu = 0;
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			// 오류 무시
		}
		return intMenu;
	}

}
