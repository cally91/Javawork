package com.biz.word_exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordExec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> wordsList = new ArrayList<String>();

		// 단어목록을 list로 작성하고

		wordsList.add("Korea");
		wordsList.add("America");
		wordsList.add("Emgland");
		wordsList.add("German");
		wordsList.add("Aprica");
		wordsList.add("France");
		// 단어목록을 뒤섞어
		Collections.shuffle(wordsList);
		// 뒤섞인 목룍에서 0번째 단어를 읽어
		// 알파벳으로 분해해하여 문자열 배열로 생성
		String[] alpha = wordsList.get(0).split("");
		// 문자열 배열을 string형으로 list로 변환하고
		// 알파벳 조각들이 List로 생성된다
		List<String> apList = new ArrayList<String>(Arrays.asList(alpha));
		// 알파벳조각들을 뒤섞어주고
		Collections.shuffle(apList);
		// 섞인 알파뱃조각을 화면에 보여주고
		System.out.println("다음예시의 단어를 맞게 입력하시오");
		System.out.println(apList);
		// 맞는 단어를 키보드로 임력하도록하고
		String KeyinPut = scan.nextLine();
		// 맞았는지 틀렸는지 여부검사
		if (wordsList.get(0).equalsIgnoreCase(KeyinPut)) {

			System.out.println("참잘했어요");
		} else {
			System.out.println("잘못입력했어요");
		}

//		for(String word :wordsList) {
//			System.out.println(word);
//		}

	}

}
