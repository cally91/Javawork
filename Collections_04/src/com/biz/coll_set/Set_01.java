package com.biz.coll_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {

		Random rnd =new Random();
		Set<Integer> intSetts=new HashSet<Integer>();
		
		//set은 값을 추가할때 동일한 값이 이미  있으면
		// 그 밧은 추가하지않는다.
		for (int i=0;i<100;i++) {
			int intR=rnd.nextInt(50);
			intSetts.add(intR);
		}
		int index=0;
		for(Integer i : intSetts) {
			System.out.print(i);
			if(++index%5==0) System.out.println();
			else System.out.print(",");	
			
		}
	}

}
