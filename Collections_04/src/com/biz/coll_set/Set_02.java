package com.biz.coll_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_02 {

	public static void main(String[] args) {

		/*
		 * 동일한 set자료구도로 선언된 strSetts객체를 
		 * 다른 생성자로 초기화를 하면
		 * 이전에 초기화된 객체는삭제되고 새로운
		 * 객체로 변경된다
		 * 
		 */
		Set<String> strSetts= new HashSet<String>();
		strSetts=new LinkedHashSet<String>();
		strSetts=new TreeSet<String>();
			/*
			 * List형에서는 값을 추출할때 get(index)를 사용해서
			 * 		값을 읽을수 있었지만
			 * set은 get(index)메서드가 없다
			 * set들 데이터중에 특정한 값이 있는지 확인할려면
			 * contains(값) 메서드를 사용한다 	
			 */
	}

}
