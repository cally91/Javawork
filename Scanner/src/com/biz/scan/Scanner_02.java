package com.biz.scan;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.print("이름 >");
		String strName =scan.nextLine();
		
		System.out.print("국어점수 >");
		int intkor =scan.nextInt();
		
		// nextint() 에서 키보드로 숫자 +엔터를 누르면
		// 숫자는 intkot 변수에 담고 엔터키를 키보드 저장공간에서
		//삭제를 해주어야 하는데
		//그렇지 않고 게속 남겨둔다
		
		//다음번에 nextLine() 에서는 사용자가 무엇인가 입력하고
		// 엔터를 눌렸다고 생각해 버린다
		// 그래서 입력을 기다리지 않고 다음으로 진행해 버린다.
		System.out.print("전화번호 >");
		String strTal =scan.nextLine();
		
		System.out.println("이름  :" +strName);
		System.out.println("국어 : "+intkor);
		System.out.println("전화번호: "+ strTal);
	}

}
