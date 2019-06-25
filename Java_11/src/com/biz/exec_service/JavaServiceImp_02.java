package com.biz.exec_service;

public class JavaServiceImp_02 implements JavaService {

	@Override
	public void call() {

		System.out.println("나는 업그래드된 call이다");
	}

	@Override
	public void call(int num) {
		System.out.println(num+"를 매개변수로 받았다");
	}

	@Override
	public void call(int num1, int num2) {
		System.out.printf("%d+%d=%d",num1,num2,num1+num2);

	}

}
