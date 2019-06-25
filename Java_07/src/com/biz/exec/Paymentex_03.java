package com.biz.exec;

public class Paymentex_03 {

	public static void main(String[] args) {
		// 총 금여액
		int intPay = 3892840;

		// 대한민국 액면가 최고가

		int intMoney = 50000;
		int sw = 1;
		while (intPay > 5) {
			// 매수계산
			int paper = (int) (intPay / intMoney);
			System.out.println(intMoney + "원권:" + paper);

			// 액면가 *매수만큼 제외
			intPay -= (paper * intMoney);

			if (sw > 0)
				intMoney = intMoney / 5;

			else
				intMoney = intMoney / 2;
			
			/*
			 * int형  conut변수에 값을 계속 추가하면서
			 * 해당 값의 짝수,홀수 여부를 판단하여
			 * 2가지중 한가지의 상태의 코드들을 수행할 수도 있다
			 * 
			 * 하지만 , 이방법에서 만약 반복문이 상당히 많이 수행될 경우
			 * conut 변수 값은 정수의 범위를 넘어가서
			 * overflow가 되고
			 * 코드가 오류를 내고 중간되어 버릴수 있다.
			 * 
			 * 이럴때 
			 * int sw 변수를 선언하고 초기값을 1이나 -1로 세팅해둔다.
			 * 이후sw변수에 -1을 곱하는 코드를 수행하도록 하면
			 * sw변수는 0보다 크거나 작은 2가지 상태값을 갖게 되어
			 * 위와 같은 코드를 길행하는 효과를 낼 수 있다.
			 */
			sw=sw*(-1);

		}
	}

}
