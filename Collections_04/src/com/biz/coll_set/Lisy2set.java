package com.biz.coll_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lisy2set {

	public static void main(String[] args) {

		
		List<String> strList= new ArrayList<String>();
		
		strList.add("Korea");
		strList.add("KOREA");
		strList.add("대한민국");

		strList.add("Korea");
		strList.add("KOREA");
		strList.add("대한민국");
		System.out.println("list 갑들");
		for(String s: strList) {
			System.out.println(s);
		}
		
		//List를 set의 생성자 매개변수로 전잘을 해주면
		//List를 set 자료 형으로 변환할수있다.
		Set<String> strSetts= new HashSet<String>();
		
		System.out.println("set 값들");
		for(String s: strSetts) {
			System.out.println(s);
		}
	}

}
