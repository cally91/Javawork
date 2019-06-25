package com.biz.exe.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {

		List<String> strList =new ArrayList<String>();
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라");
		for(String s:strList) {
			System.out.println(s);
		}
		view(strList);
	}
	
	public static void view(List<String> sList) {
		for (String s:sList) {
			System.out.println(s);
		}
	}

}
