package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.ScoreVO;
import com.biz.jdbc.model.StuDestVO;
import com.biz.jdbc.service.ScoreSerbice;
import com.biz.jdbc.service.ScoreSerbiceImp_01;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.stdServiceImp_01;

public class StdExec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		while (true) {
			ScoreSerbice ss = new ScoreSerbiceImp_01();
			StdService st =new stdServiceImp_01();
			
			System.out.print("이름(종료 -END)>>");
			String strname =scan.nextLine();
			if(scan.equals("-END"))break;
			if(st.findByName(strname)==null) {
				System.out.println("학생정보가없습니다.");
			}
			else {
				System.out.println("학생정보가 있습니다");
				continue;
			}
			System.out.print("일련번호(종료(-END))>>");
			String strNum =scan.nextLine();
			long loNum =Long.valueOf(strNum);
			if(scan.equals("-END"))break;
			
			System.out.print("시험일자>>");
			String strdate =scan.nextLine();
			

			System.out.print("학번>>");
			String strStNo =scan.nextLine();
			System.out.print("주소>>");
			String straddr =scan.nextLine();
			System.out.print("학년>>");
			String strgrade =scan.nextLine();
			int intgrade =Integer.valueOf(strgrade);
			System.out.print("키>>");
			String strheight =scan.nextLine();
			int intheight = Integer.valueOf(strheight);
			System.out.print("몸무게>>");
			String strweight=scan.nextLine();
			int intweight=Integer.valueOf(strweight);
			System.out.print("별명>>");
			String strnick =scan.nextLine();
			System.out.print("별명이유>>");
			String strnick_rem =scan.nextLine();
			System.out.print("학과>>");
			String strdept_name =scan.nextLine();
			
			System.out.print("과목>>");
			String strSubject =scan.nextLine();
			
			System.out.print("점수>>");
			String strScore= scan.nextLine();
			int intScore = Integer.valueOf(strScore);
		
			ScoreVO vo= new ScoreVO() ;
			vo.setSC_SEQ(loNum);
			vo.setSC_DATE(strdate);
			vo.setSC_ST_NO(strStNo);
			vo.setSC_SUBJET(strSubject);
			vo.setSC_SCORE(intScore);
			System.out.println(vo);
			StuDestVO svo =new StuDestVO();
			svo.setSt_name(strname);
			svo.setSt_no(strStNo);
			svo.setSt_grade(intgrade);
			svo.setSt_height(intheight);
			svo.setSt_weight(intweight);
			svo.setSt_nick(strnick);
			svo.setSt_nick_rem(strnick_rem);
			svo.setSt_dept_name(strdept_name);
			ss.insert(vo);
			st.insert(svo);
			
			
			
		}
	}

}
