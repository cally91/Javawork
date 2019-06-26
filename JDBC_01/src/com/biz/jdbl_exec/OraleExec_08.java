package com.biz.jdbl_exec;

import java.util.Scanner;

import com.biz.jdbl.sevice.StdSevice;
import com.biz.jdbl_model.StudentVO;

public class OraleExec_08 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		StdSevice ss =new  StdSevice();
		while(true) {
			System.out.print("조회할 학생의 학번 입력 (종료 --END)>>");
			String strNum= scan.nextLine();
			if (strNum.equals("--END")) {
				System.out.println("종료되었습니다");break;
			}
			StudentVO vo = ss.findByNum(strNum);
			if (vo==null) System.out.println("찾는 학생없습");
			else System.out.println(vo);
				
		}
	}

}
