package com.biz.coll_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set2List {

	public static void main(String[] args) {

		// set 자료구조중에 TreeSet은 성능상으로는 상당히
		// 느린편에 속한다.
		// 하지만 TreeSet은 데이터를 저장(add)할때
		// 오름차순으로 정렬하는 성질이있다
		Set<String> strSetts = new TreeSet();
		strSetts.add("홍길동");
		strSetts.add("성춘향");
		strSetts.add("이몽룡");
		strSetts.add("임꺽정");
		strSetts.add("장녹수");
		for (String s : strSetts) {
			System.out.println(s);
		}
		//set자료를 list형으로 변경
		List<String> strList =new ArrayList<String>(strSetts);
		/*
		 * list형 제이터에서 중복된 데이터를 제거한
		 * List로 만들고 싶으면
		 * 먼저 List를 set으로 한번 변환하고
		 * 다시 set을 list로 변환해주면 된다.
		 */
		
	}

}
