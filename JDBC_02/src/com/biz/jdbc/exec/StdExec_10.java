package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_10 {

	public static void main(String[] args) {

		StdSerice ss = new StdSericeImp_01();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("==========");
			// stdService 인터페이스에 미처 선언하지 못한
			// makeStno()메서드를
			//StdSericeImp_01 클래스에 생성하고
			// 사용할러고한다.
			
			//이럴때는 다소 복잡하지만 ss(StdSerice 형)의 객체를 
			//StdSericeImp_01로 Cascading (형변환)을 실행해서
			//메서드를 호출한다.
			String strNo=((StdSericeImp_01)ss).makeStno();
			System.out.println(strNo+" : 학생정보 등록");
			System.out.println("-------------------------");
			
			System.out.print("이름(종료:-E)>>");
			String strName =scan.nextLine();
			if(strName.equals("-E"));
			System.out.print("학년>>");
			String strGrade= scan.nextLine();
			int intGrade =Integer.valueOf(strGrade);
			
			System.out.print("학과>>");
			String strDept =scan.nextLine();
			
			StdentVO vo =new StdentVO();
			vo.setSt_no(strNo);
			vo.setSt_name(strName);
			vo.setSt_grade(intGrade);
			vo.setSt_dep_name(strDept);
			ss.insert(vo);
			}
	}

}
