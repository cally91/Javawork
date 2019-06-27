package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_07 {

	/*
	 * 키보드로
	 * 학번,학생 이름, 학년, 학과를 입력받고
	 * 데이터를 추가
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StdSerice ss = new StdSericeImp_01();
		
		System.out.print("학번>>");
		String strNo = scan.nextLine();
		
		System.out.print("이름>>");
		String strName = scan.nextLine();
		
		System.out.print("학년>>");
		String strGrade = scan.nextLine();
		int intGrade =Integer.valueOf(strGrade);
		System.out.print("학과>>");
		String strDept = scan.nextLine();
		
		StdentVO vo =new StdentVO();
		vo.setSt_no(strNo);
		vo.setSt_grade(intGrade);
		vo.setSt_dep_name(strDept);
		vo.setSt_name(strName);
		ss.insert(vo);
	}

}
