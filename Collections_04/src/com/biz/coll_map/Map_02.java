package com.biz.coll_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_02 {


	public static void main(String[] args) {

		Map<String, String> addrMap =new HashMap<String, String>();
		
		addrMap.put( "홍길동","서울시");
		addrMap.put( "성춘향","남원시");
		addrMap.put( "이몽룡", "서울");
		addrMap.put( "장녹수","평양");
		addrMap.put( "임꺽정","한양");
		System.out.println(addrMap.get("홍길동"));
		
		Set<String> strKeys=addrMap.keySet();
		for (String key :strKeys) {
			System.out.println(key +":"+addrMap.get(key));
		}
		}

}
