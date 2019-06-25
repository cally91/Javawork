package com.biz.exec;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("연도입력>>");
		String stryenu = scan.nextLine();
		int Num = Integer.valueOf(stryenu);

		if (Num % 4 == 0) {
			System.out.println(Num + "1차 후보");
			if (Num % 100 != 0 || Num % 400 == 0) {
				System.out.println(Num + "2차 후보");
			}
		}
		if (Num % 4 == 0) {
			if (Num % 4 == 0 && Num % 100 != 0) {

			} else if (Num % 4 == 0 && Num % 400 == 0) {
				System.out.println("윤년");
			}
		}
		if (Num % 4 == 0 && Num % 100 != 0 || Num % 400 == 0) {
			System.out.println("윤년");
		}
	}

}
