package com.biz.scan;

public class StringInt_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(30 + 40); // 70
		System.out.println("30+40"); // 30+40

		// "30"과 "40"은 문자열 형 숫자라고 하며
		// 숫자 30과 숫자 40으로 변환 시켜서
		// 4칙연산을 수행할 수도있다.
		System.out.println("30" + "40");// 3040

		// 문자열을 정수로 변환하여 젓셈을 숭행
		System.out.println(Integer.valueOf("30") + Integer.valueOf("40"));

		// 정수를 문자열로 변환하여 연결을 수행
		System.out.println(Integer.toString(30) + Integer.toString(40));
		
		System.out.println(Float.valueOf("30.0f"));
		//30문자열 뒤에 white space가 있어서
		//숫자(정수) 변환할수가 없다
		//NumberForma tException
		System.out.println(Integer.valueOf("30"));
	}

}
