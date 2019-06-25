package com.biz.exec;

import com.biz.sereice.LeapYear;

public class Exec_04 {

	public static void main(String[] args) {

		LeapYear lyr=new LeapYear();
		String leapFile= "src/com/biz/exec/txt/IeapYearListFile.txt";
				lyr.writeLeapYearListFile(leapFile);
				lyr.makeLaepYearList(1500, 3000);
	}



}
