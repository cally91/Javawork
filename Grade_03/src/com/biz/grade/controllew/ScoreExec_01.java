package com.biz.grade.controllew;

import com.biz.grade.se.ScoreSE;

public class ScoreExec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String fileName ="/Grade_03/src/com/biz/grade/Score.txt";

		ScoreSE sService;
		try {
			sService =new ScoreSE(fileName);
			sService.readFile();
			sService.viewLust();
			System.out.println( sService.toString());
		} catch (Exception e) {
System.out.println("오류");
		}
		
		
	}

}
