package com.biz.coll.lsit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		List<String> strList= new ArrayList<String>();
		
		for (int i = 0 ; i <50 ;i++) {
			// 영문자 소문자 ascll코드중 1개를 추출하라
			
			int intNum= rnd.nextInt(26)+97;
			char chsrNum=(char)intNum;
			
			String strAlpha = String.valueOf(chsrNum);
			
			strList.add(strAlpha);
			
		}	
		for (String s: strList) {
			System.out.println(s);
		}
	}

}
