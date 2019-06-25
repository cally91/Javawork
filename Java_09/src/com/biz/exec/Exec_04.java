package com.biz.exec;

public class Exec_04 {

	public static void main(String[] args) {

		int min = 0;
		int mex = 100;
		

		int index = 0;
		for (int i = min; i < mex; i++) {
			index += i;
		}

		System.out.println("덧셈결과: "+index);
	}

}
