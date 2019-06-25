package com.biz.exec;

import java.util.Random;

public class Exec_03 {

	public static void main(String[] args) {

		Random rnd= new Random();
		
		
		int num = rnd.nextInt(40)+40;
		
			if (num %2==0) 
				System.out.println(num+"은 작수입니다.");
			else System.out.println( num+"은 홀수입니다.");;
		}
	}


