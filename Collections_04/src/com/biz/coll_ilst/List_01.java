package com.biz.coll_ilst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {

		// 선언 초기화 동시
		List<Integer> intarrayList1 = new ArrayList<Integer>();

		// 선언 초기화 따로
		List<Integer> intLinkedList2;
		intLinkedList2 = new LinkedList<Integer>();
		// 컴퓨터의 현재시각 을 밀리세컨드 값을 알려주는
		// 시스탬 클래스 매서드
		// 1970년 1월 1일 00:00:00:000부터 현재까지 흐른
		// 시각을 알려준다
		// UNIX TIME
		for (int i = 0; i < 100; i++) {
			intarrayList1.add(i);
			intLinkedList2.add(i);
		}
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			intarrayList1.add(20, 1000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ArryaList add tmie:" + (endTime - startTime));

		for (int i = 0; i < 10000; i++) {
			intLinkedList2.add(20, 10000);
		}
		System.out.println();
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			intarrayList1.add(20, 1000);
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArryaList add tmie:" + (endTime - startTime));

		for (int i = 0; i < 10000; i++) {
			intLinkedList2.add(20, 10000);
		}

	}

}
