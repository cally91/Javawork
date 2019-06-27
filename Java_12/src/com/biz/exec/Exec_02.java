package com.biz.exec;

import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListSerivce ls =new ListSerivce();
		ls.makeList();
		List<String> s =ls.makeList("대한민국");
		System.out.println(s);
		List<String> strList =ls.makeList("대한민국", "korea");
		for(String s1 : strList) {
			System.out.println(s1);
		}
		List<String> sList= ls.makeList("대한민국","광주광역시");
		System.out.println("===================");
		
		for (String s2: sList) {
			System.out.println(s2);
		}
		// strList변수에 reTUrn 값을 받았는데
		//그 후(return받은 후에) ListServixe 에 있는
		//strList 변수에 또다시 return값을 받지 않아도
		// 변경된 내용을 확인 할 수 있었다.
		// 그 이유는 strList 변수에 받는 내용이
		// 주소이기 때문이다.
		System.out.println("======="); 
		for (String s3 : strList) {
			System.out.println(s3);
		}
		

	}

}
