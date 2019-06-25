package com.biz.coll_exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto_01 {

	public static void main(String[] args) {

		// 정수형 List 에 1부터 45까지의 숫자를 추가
		List<Integer> lottos = new ArrayList<Integer>();
		for (int i = 0; i < 45; i++) {
			lottos.add(i + 1);

		}
		// list를 45번 섞기
		int lsize = lottos.size();
		for (int i = 0; i < lsize; i++) {
			Collections.shuffle(lottos);
		}

		Set<Integer> lottoSet = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			lottoSet.add(lottos.get(i));
		}
		System.out.println(lottoSet.toString());
	}

}
