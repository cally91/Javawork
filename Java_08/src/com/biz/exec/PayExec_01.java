package com.biz.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.exec.mode.PayMentVO;

public class PayExec_01 {

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
		while (intpay > 5) {
			PayMentVO payVO = new PayMentVO();
			int intpaper = (int) (intpay / intMoney);

			payVO.intMoney = intMoney;
			payVO.paper = intpaper;
			payList.add(payVO);

			intMoney -= (intMoney * intpaper);
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

		System.out.println("======================");
		System.out.println("총금여:" + intTotalPay);
		System.out.println("---------------------");
		System.out.println("액면가 \t\t매수");
		System.out.println("---------------------");
		for (PayMentVO vo : payList) {
			System.out.printf("%7d\t\t%3d\n", vo.intMoney, vo.paper);

		}
		System.out.println("========================");
	}

}
