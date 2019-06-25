package com.biz.exec;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.exec.mode.PayMentVO;

public class PayExec_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("금여금액>>");

		String strPay = scan.nextLine();
		int intpay = Integer.valueOf(strPay);
		// 총금여액 다른 변수로 대입
		int intMyPay = intpay;

		List<PayMentVO> payList = new ArrayList<PayMentVO>();
		int intMoney = 50000;

		int sw = 1;
		while (intMoney > 0) {
			PayMentVO payVO = new PayMentVO();
			int intpaper = (int) (intpay / intMoney);

			payVO.intMoney = intMoney;
			payVO.paper = intpaper;
			payList.add(payVO);

			intpay-= (intMoney * intpaper);
			if (sw > 0)
				intMoney /= 5;
			else
				intMoney /= 2;
			sw *= (-1);
		}
		// 총 금여액 다시 계산 방법
		int intTotalPay = 0;
		for (PayMentVO vo : payList) {
			intTotalPay += (vo.intMoney * vo.paper);
		}

		String payReport = "src/com/biz/exec/금여명세서.txt";
		try {
			
			FileWriter fileWriter = new FileWriter(payReport);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("======================");
			printWriter.println("총금여:" + intTotalPay);
			printWriter.println("---------------------");
			printWriter.println("액면가 \t\t매수");
			printWriter.println("---------------------");
			for (PayMentVO vo : payList) {
				printWriter.printf("%7d\t\t%3d\n", vo.intMoney, vo.paper);

			}
			printWriter.println("========================");
			printWriter.flush();
			printWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
