package com.biz.sereice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LeapYear {

	List< Integer> leapYearList;
	public LeapYear() {
		leapYearList=new ArrayList<Integer>();
	}
	public void makeLaepYearList(int startYear,int endYear) {
		for (int year =startYear ; year <= endYear;year++) {
			if (year %4==0&& year%100!=0||year %400==0) {
				leapYearList.add(year);
			}
			
		}
		System.out.println("윤년 개수 :" +leapYearList.size());
		System.out.println("윤년 리스트를 만들었습니다.");
			
		
	}
	public void writeLeapYearListFile(String leapFileNum) {
		FileWriter fileWriter=null;
		PrintWriter printWriter = null;
		
		try {
			fileWriter=new FileWriter(leapFileNum);
			printWriter=new PrintWriter(fileWriter);
		} catch (IOException e) {
		}
		for (int yean :leapYearList) {
			printWriter.println(yean+"년");
		}
		printWriter.flush();
		printWriter.close();
		System.out.println("파일에 저장완료");
	}
}
