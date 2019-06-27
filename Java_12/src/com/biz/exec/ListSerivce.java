package com.biz.exec;

import java.util.ArrayList;
import java.util.List;

public class ListSerivce {

	List<String> strList =null;
	public ListSerivce () {
		strList =new ArrayList<String>();
		
	}
	public  void makeList() {
		
	}
	// 리턴 타입이 class형인경우
	// 오류가 나지 않으려면 최소한 null값이라도
	// 리턴해주어야한다.
	public List<String> makeList(String str) {
		return null;
		
		
	}
	// 리턴 타입이 class인 메서드 는
	// 리턴 하는 내용이 무엇이든지
	// 무조건 그들이 저장된 공간의
	// 주소를 return한다
	public List<String> makeList (String str1 , String str2){
		strList.add(str1);
		strList.add(str2);
		return strList;
	}
}
