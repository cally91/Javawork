package com.biz.serice;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordQuizSerice {

	Scanner scan;
	Map<Integer, String> intStrMap;

	public WordQuizSerice() {
		scan = new Scanner(System.in);
		intStrMap = new TreeMap<Integer, String>();
	}

	public void WordQuizOX() {
		int intNum = 1;
		while (intNum < 10) {
			System.out.println(intNum + "번 문제 대한민국 스페링은?");
			System.out.print("문제답>>");
			String strKor = scan.nextLine();
			if (strKor.equalsIgnoreCase("Korea")) {
				System.out.println("맞았습니다.");
			} else {
				System.out.println("틀렸습니다.");
				continue;
			}
			intNum++;
			System.out.println(intNum+"번문제");
		}

	}
}
