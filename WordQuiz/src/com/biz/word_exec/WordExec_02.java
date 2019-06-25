package com.biz.word_exec;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.word_serice.WordSerice;

public class WordExec_02 {

	public static void main(String[] args) throws FileNotFoundException  {

	String	file="src/com/biz/word_exec/WORD.txt";
		WordSerice wo;
		try {
			wo = new WordSerice(file);
			wo.inPutWordList();//직접 코드에서 리스트 생성
				while(true) {
					wo.makeQuiz();
					if(wo.pickQuiz())break;
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			} 
			
		

		
	}

}
