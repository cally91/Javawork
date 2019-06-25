package com.biz.exec;

public class Paymentex_01 {

	public static void main(String[] args) {
		//총 금여액
		int intPay=3892840;
		
		// 대한민국 액면가 최고가
		int intMoney=50000;
		
		int 오만원권 =(int)(intPay/intMoney);
		System.out.println("오만원권 : "+오만원권);
		
		//총금여액에서 5만원권을 제외한 나머지만 intPay만 남는다.
		intPay =intPay-(오만원권 *intMoney);
		intMoney=intMoney/5;//1만원권 액면가
		
		int 일만원권 =(int)(intPay/intMoney);
		System.out.println("일만원권 :" +일만원권);
		//총금여액에서 다시 1만원권 제외한 나머지만 intPay 남는다.
		intPay=intPay-(일만원권 *intMoney);
		intMoney=intMoney/2;
		
		
	}

}
