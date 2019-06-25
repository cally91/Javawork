package com.biz.bank.exec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.biz.bank.servire.BankService;
import com.biz.bank.servire.BankServiceImp_02;

public class BankExec_01 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		String fileName ="src/com/biz/bank/balance.txt";
		
	BankService bs= null;
		
		try {
			bs= new BankServiceImp_02(fileName);
			bs.readBalance();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
		while(true) {
			int intMenu =bs.selectMenu();
			
			if (intMenu==-9) break;
			
			System.out.print("계좌번호>>");
			String accNum=scan.nextLine();
			if (intMenu==1) {
				System.out.print("입금금액>>");
				String strInpuutMoney= scan.nextLine();
				int intInputMoney = Integer.valueOf(strInpuutMoney);
				
				bs.inputMoney(accNum, intInputMoney);
			};
			if (intMenu==2) {
				System.out.print("출금금액>>");
				String strOutputMoney =scan.nextLine();
				
				int intOutputMoney =Integer.valueOf(strOutputMoney);
				bs.ontputMoney(accNum, intOutputMoney);
			};
		}
	}

}
