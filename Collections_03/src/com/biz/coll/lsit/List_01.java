package com.biz.coll.lsit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_01 {

	public static void main(String[] args) {
		/*
		 * List
		 * 자바에서 사요되는 확장된 배열자료두조
		 * 자바에서데이터와 관련해서 가방 많이 사용되는구조
		 * Java.util, 패키지에 포함된 인터페이스
		 * 
		 *  Lisr와 관련된 클래스
		 *  ArratList LinkedList Vector
		 *  
		 *  List <클래스> 형식의 선언문
		 *  클래스는 ㅓㅇ떤한 종류도 포함될수있자
		 *  
		 */
		List<String> strList ;
		List<Integer> intList ;
		List<Float> flList;
		List<Boolean> blList ;
		List<Long> longList;
		List<Double> dbList;
		
		strList =new ArrayList<String>();
		intList=new ArrayList<Integer>();
		flList= new ArrayList<Float>();
		
		//자바 1.8이상에서는 ArratList에 클래스를 명시하지않아도
		//문법상 오류가 나지는 않지만
		//호환성을 위해서 클래스를 명시하는것이 좋다
		blList=new ArrayList<>();
		
		longList=new LinkedList<Long>();
		dbList=new Vector<Double>();
		
		/*
		 * ArrayList 는 List 자료구조중 가장 많이 사용되고
		 * 내부적으로 가장 단순한 구조이며
		 * 기본 배열구조와 매우 유사하게 작동된다.
		 * 
		 * LinkedList 는 List 자료구조중 가장 복잡한 구조이고
		 * 리스트 중간중간에 추가 삭제가 자주일어나는 경우
		 * 매우 효율적으로 작동되는 형식
		 * 
		 * Vector 는 쓰레드 프로젣트에서 향상
		 * 순차적으로 실행되서 안정선이 보장된다.
		 */

		
		
	}
	
}
