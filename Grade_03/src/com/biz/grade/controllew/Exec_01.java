package com.biz.grade.controllew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Exec_01 {

	public static void main(String[] args) {

		List<Integer> intList =new ArrayList<Integer>();
		Random rnd =new Random();
		
		for(int i = 0 ; i< 100; i++) {
			int intR=rnd.nextInt(10)+1;
			
			int size = intList.size();
			int index=0;
			//1. intList의 개수만큼 반복하면서
			for (index =0 ; index<size;index++) {
				//2. intList중에 intR
				//3. 만약있으면 for반복문이 중단
				//4. ,for 반복문이 중단이되면
				// index값은 size보다 작다
				if (intList.get(index)==intR) {
					break;
				}
			}
			//for가 끝나거나 중단되면
			// indox와 size값을 비교되여
			//indox<= size 중각아 찾고자하는 값이없다
			//indox>= size 중간에 찾고자하는 값이 있다.
			// 중간에 찾고자하는 값이 없으면
			//List에값을 추가한다.
			if(index>=size) {
				intList.add(intR);
			}
		}
		
		System.out.println("리스트개수"+intList.size());
		//오름 차순 실행
		Collections.sort(intList);
			for(Integer i :intList) {
				System.out.print(i+"\t");
			}
			
			//내림차순 정렬
			System.out.println();
			Collections.sort(intList, new Comparator<Integer>() {
				public int compare(Integer o1 , Integer o2) {
					return o2-o1;
				}
			});
	}

}
