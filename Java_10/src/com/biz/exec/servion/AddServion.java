package com.biz.exec.servion;

public class AddServion {

	
	//num1과 num2는 호출하는 곳에서
	//전달한 2개의 정수값을 받는 바구니 역할
	public int add(int num1 ,int num2) {
		System.out.print("num1 :" +num1);
		System.out.println("\t num2 :" +num2);
		return num1+num2;
	}
	
	public void add() {
		System.out.println("나는 아무일도 하지 않는다네");
		
	}

	public void add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int sum =num1+num2+num3;
		System.out.println("sum : "+sum);
	}
}
