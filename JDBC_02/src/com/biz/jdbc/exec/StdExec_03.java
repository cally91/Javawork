package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		StdSerice ss=new StdSericeImp_01();
		
		while(true) {
			System.out.print( " 조회할 학번을 입력하세요 (종료 --END)>>");
			String strSearch = scan.nextLine();
			if(strSearch.equals("--END")) break;
			
			StdentVO stdVO=ss.findByNum(strSearch);
			
			
			if(stdVO== null) {
				System.out.println("찾는 학생이 없습");
			}
			else {
				System.out.println("조회한 학번 : "+ strSearch);
				System.out.println("-------------------------");
				System.out.println(stdVO.toString());
			}

			
		}
		
	}

}
