package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_09 {

	/*
	 * 키보드에서 학생 정보를 입력 받아서
	 * 학번,이름 , 학년, 학과
	 * 계속해서 insert를 수행하는 코드
	 */
	public static void main(String[] args) {

		StdentVO vo= new StdentVO();
		StdSerice ss= new StdSericeImp_01();
		Scanner scan =new Scanner(System.in);
		
		
		while (true) {
			System.out.print("학번입력(종료 -END)>");
			String strNo =scan.nextLine();
			if(strNo.equals("-END")) break;
			System.out.print("이름입력(종료 -END)>");
			String strName =scan.nextLine();
			System.out.print("학년입력(종료 -END)>");
			String strGade =scan.nextLine();
			int intGade =Integer.valueOf(strGade);
			System.out.print("학과입력(종료 -END)>");
			String strDep =scan.nextLine();
			
			vo.setSt_no(strNo);
			vo.setSt_name(strName);
			vo.setSt_grade(intGade);
			vo.setSt_dep_name(strDep);
			ss.insert(vo);
			
		}
	}

}
