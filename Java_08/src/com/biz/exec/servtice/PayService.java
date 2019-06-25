package com.biz.exec.servtice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.exec.mode.PayMentVO;

public class PayService {

	List<PayMentVO> paprList ;
	int intPayTotal;
	Scanner scan;
	public PayService() {
		paprList =new ArrayList<PayMentVO>();
		intPayTotal =0;
		scan=new Scanner(System.in);
		
	}
	public void payCalce() {
		
		System.out.print("금여액>>");
		String strPay =scan.nextLine();
		int intPay= Integer.valueOf(strPay);
		intPayTotal =intPay;//Integer.valueOf(strPay);
		
		int intMoney =50000;
		int sw=1;
		while(intPay>0) {
			
			PayMentVO vo = new PayMentVO();
			
			int intPaper =(int)(intPay /intMoney);
			
			vo.intMoney=intMoney;
			vo.paper=intPaper;
			
			paprList.add(vo);
			
			intPay-=(intPaper*intMoney);
			if(sw>0)intMoney/= 5;
			else intMoney/=2;
			sw*=(-1);
		}
	}
	public void pintReport(String payReport) throws IOException {
		//String payReport = "/src/com/biz/exe/금여명세서.txt";
		
			
			FileWriter fileWriter = new FileWriter(payReport);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("======================");
			printWriter.println("총금여:" + this.intPayTotal);
			printWriter.println("---------------------");
			printWriter.println("액면가 \t\t매수");
			printWriter.println("---------------------");
			for (PayMentVO vo : paprList) {
				printWriter.printf("%7d\t\t%3d\n", vo.intMoney, vo.paper);

			}
			printWriter.println("========================");
			printWriter.flush();
			printWriter.close();


		
	}
}
