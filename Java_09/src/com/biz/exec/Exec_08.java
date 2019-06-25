package com.biz.exec;

import com.biz.exec.mode.StudentVO;

public class Exec_08 {

	public static void main(String[] args) {

		
		StudentVO[] stdList =new StudentVO[10];
		
		String string="";
		stdList[0]=new StudentVO();
		stdList[0].numder="001";
		stdList[0].name="홍길동";
		string=stdList[0].numder+"\n"+stdList[0].name;
		System.out.println(string);
		
		stdList[1]=new StudentVO();
		stdList[1].numder="002";
		stdList[1].name="성춘향";
		string=stdList[1].numder+"\n"+stdList[1].name;
		System.out.println(string);
		
		
	}
	

}
