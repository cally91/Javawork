package com.biz.exec;

import com.biz.exec.servion.AddServion;

public class Exec_01 {

	public static void main(String[] args) {

		//AddSernion에 선언된
		//add(int num1,int num2)메서드를 사용하기 위한
		//준비 작업
		AddServion as=new AddServion();
		as.add(30, 40);
		as.add(100, 200);
		
		int sum=as.add(200, 300);
		System.out.println("sum : " + sum);
		
		System.out.println(as.add(1000, 2000));
		as.add();
		
		//add(num1 num2 num3)메서드는
		// type void 형이기때문에
		// 변수에 값을 대입하는 문장을 사용할수 없다.
		//sum = as.add(100,200,300);
		
		
		
	}

}
