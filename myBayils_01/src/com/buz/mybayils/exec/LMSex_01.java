package com.buz.mybayils.exec;

import com.buz.mybayils.Service.ScoreService;
import com.buz.mybayils.Service.StdService;

public class LMSex_01 {

	public static void main(String[] args) {
		StdService stdService=new StdService();
		ScoreService scoreService= new ScoreService();
		
		while(true) {
			System.out.println("===================");
			System.out.println("빛나리 고교 학사 관리");
			System.out.println("--------------------");
			if(stdService.isNotStd()) stdService.insertStd();
			String st_num =stdService.getSt_num();
			// 성적을 입력하기 위해서 학번을 SCoreService에 Setting
			scoreService.setSt_num(st_num);
			scoreService.viewScore(st_num);
			scoreService.insertScore(st_num);
			
			
		}
		
	}

}
