package com.biz.scan;

public class String_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNum =" 30 ";
		
		//trim()
		//문자열의 앞뒤에 있는 whtespace 일부를 제거해주는
		//method
		// whitespace :sp(스페이스바),tad(\t),CR
		int intNum =Integer.valueOf(strNum.trim());
		 intNum =Integer.valueOf(strNum);
		//java 11 에서는 
		// strip() 메서드를 새롭게 사용할수 있는데
		// 이메서드는 유니코드, UTF-8에 지정되어 있는
		// 약 12가지의 whitespace를 모두 제거할수있다.
	}

}
