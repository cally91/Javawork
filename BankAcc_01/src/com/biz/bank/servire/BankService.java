package com.biz.bank.servire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.mode.BankBlalnecVO;

public class BankService {

	List<BankBlalnecVO> balanceList;
	FileReader fileReader;
	BufferedReader buffer;
	Scanner scan;

	public BankService(String fileNume) throws FileNotFoundException {
		balanceList = new ArrayList<BankBlalnecVO>();
		fileReader = new FileReader(fileNume);
		buffer = new BufferedReader(fileReader);
		scan = new Scanner(System.in);

	}

	public void readBalance() throws IOException{

		String reader ="";
		while(true) {
			reader=buffer.readLine();
			if(reader==null) break;
			String[] banks= reader.split(":");
			
			BankBlalnecVO vo= new BankBlalnecVO(banks[0],Integer.valueOf(banks[1]),banks[2]);
			
			vo.setAcc(banks[0]);
			vo.setBalance(Integer.valueOf(banks[1]));
			vo.setData(banks[2]);
			
			balanceList.add(vo);
					
		}
		
	}
	
	public BankBlalnecVO pickAcc(String accNum) {
		
		int bankSize =balanceList.size();
		int index=0;
		BankBlalnecVO vo = null;
		
		for(index = 0; index<bankSize ;index++) {
			vo =balanceList.get(index);
					if (vo.getAcc().equals(index)) {
						return vo;
						
					}
					
		}
		return null;
	}
	public void inputMoney(String acc, int money) {
		BankBlalnecVO vo=pickAcc(acc);
				int dal = vo.getBalance();
				Date date=new Date(System.currentTimeMillis());
				
				SimpleDateFormat sf =new SimpleDateFormat("yyyy-mm--d");
				String curDate = sf.format(date);
				vo.setData(curDate);
				
				LocalDate localDate =LocalDate.now();
				vo.setData(curDate);

				System.out.println("===================");
				System.out.println(vo);
				System.out.println("====================");
				 
				
				
		
	}

	public void ontputMoney(String acc, int money) {
		
		BankBlalnecVO vo=pickAcc(acc);
		int bal = vo.getBalance();
		
		if (bal <money) {
			System.out.println("잔액부족!!!");
			return;
		}
				vo.setBalance(bal -money);
				Date date =new Date(System.currentTimeMillis());
			SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd");
			
			String curDate =sf.format(date);
			vo.setData(curDate);
		
			LocalDate localDate =LocalDate.now();
			vo.setData(curDate);
			
			System.out.println("===============");
			System.out.println(vo);
			System.out.println("=================");
	}
	public int selectMenu() {
		System.out.println("===================");
		System.out.println("1. 입금  2. 출금 -9.종료");
		System.out.println("--------------");
		System.out.print("업무 선택>>");
		String strMeun =scan.nextLine();
		int intMenu =0;
		try {
			intMenu =Integer.valueOf(strMeun);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return intMenu;
	}
}
