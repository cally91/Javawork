package com.biz.scta;


import java.util.Random;
import java.util.Scanner;

public class Scanner_07 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고 키보드로 부터 1부터 까지 숫자를 입력받아서 난수를 맞추는 게임
		 */
		Random rnd = new Random();
		int intrnd = rnd.nextInt(10) + 1;

		Scanner scan = new Scanner(System.in);

		int num = 0;
		// 몇번만에 숫자를 맞추었는지 알아보고
		// 숫자를 맞추면
		// *번만에 맞추었네요라고 메세지를 보여주기
		// 임의로 종료할때까지
		// 새로운 난수를 만들고 게임을 게속할수읶고록
		// 하시오

		// 2번코드

		while (true) {
			System.out.print("숫자(1~10) 입력 종료(--END)>>");
			String strKey = scan.nextLine();
			if (strKey.equalsIgnoreCase("--END"))
				break;
			int intkey = Integer.valueOf(strKey.trim());
			num++;
			
			if (intkey == intrnd) {
				System.out.println("┌───────────────────┐");
				System.out.println("│   잘맞추었네요    │");
				System.out.printf("│ %d번만에 맞추었네요│%n",num);
				System.out.println("└━━━━━━━━━━━━━━━━━━━┘");
				System.out.println("");
				
				
				intrnd = rnd.nextInt(10) + 1;
				num = 0;
			} else {

				if (intkey > intrnd) {
					System.out.println("큰수를 입력했군요");
				} else if (intkey < intrnd) {
					System.out.println("작은수을 입력했군요");

				}
			}
			if(num>=5) {
				
				System.out.println("기회종료");
				System.out.println("============");
				System.out.println("GAME OVER");
				System.out.println("==========-");
				num=0;
				continue;
				
			}
			
		}
		System.out.println("프로그램 종료");
	
		
		
		
		
	}

}
