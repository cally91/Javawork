package com.biz.word_serice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordSerice {

	Scanner scan;
	List<String> wordsList;
	String word;
	FileReader fileReader;
	BufferedReader buff;
	/*
	 * 
	 */
	public void randwordList() throws IOException {
		//리스트의 데이터만 지우는 메서드
		//reamove() 
		wordsList.clear();
		String reader="";
		while(true) {
			reader=buff.readLine();
			if(reader==null) break;
			wordsList.add(reader);
		}
	}

	public WordSerice(String words) throws FileNotFoundException {
		scan = new Scanner(System.in);
		wordsList = new ArrayList<String>();
		word = new String();
		fileReader=new FileReader(words);
		buff=new BufferedReader(fileReader);

	}

	public void inPutWordList() {
		wordsList.clear();
		wordsList.add("Korea");
		wordsList.add("America");
		wordsList.add("Emgland");
		wordsList.add("German");
		wordsList.add("Aprica");
		wordsList.add("France");

	}

	public void makeQuiz() {
		Collections.shuffle(wordsList);
		word = wordsList.get(0);
		String[] arrWord = word.split("");
		List<String> apList = new ArrayList<String>(Arrays.asList(arrWord));
		Collections.shuffle(apList);
		System.out.println("================================");
		System.out.println(apList);
		System.out.println("================================");
	}

	public boolean pickQuiz() {
		System.out.println("제시된 알파벳의 단어를 맞추시오!!");
		System.out.println("종료 :--END");
		String strKeyInput = scan.nextLine();
		if(strKeyInput.equals("--END")) return true;
		if (word.equalsIgnoreCase(strKeyInput)) {
			System.out.println("참잘했어요");
		} else {
			System.out.println("단어선택 잘못했네요");
		}
		System.out.println("GAME OVER");
		return false;

	}
}
