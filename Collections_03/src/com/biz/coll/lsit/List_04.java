package com.biz.coll.lsit;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List_04 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		Random rnd =new Random();
		List<Integer> intList= new LinkedList<Integer>();
		
		for (int i = 0 ;i< 50 ; i++) {
			int intR =rnd.nextInt(50);
			intList.add(intR);
		}
		// 키보드에서 임의 숫자를 임력받고
		// 그 숫자가 inList에 몇번에 포함되어 있는지 찾아보기
		System.out.print("숫자입력 (0~49)>>");
		String strNum= scan.nextLine();
		int intNum = Integer.valueOf(strNum);
		int intLen=intList.size();
		for (int i = 0 ;i <intLen ; i++) {
			if (intList.get(i) == intNum) {
				System.out.println(i+"번쩨 찾았다");
			}
		}
		int index = 0;
		for (Integer in : intList) {
			index++;
			if(in == intNum) {
				System.out.println(index+"번째에 찾습");
				break;
			}
		}
		if(index>intLen) {
			System.out.println("찾지못함");
		}

		
	
	}

}
