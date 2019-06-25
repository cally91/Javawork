package com.biz.grade.se;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.biz.grade.mode.ScoreVO;

public class ScoreSE {
	List<ScoreVO> sclist;

	FileReader fileReader;
	BufferedReader buffer;

	/*
	 * 생성자에서는 선언된 맴버변수(필드)들을 초기화하는 코드를 작성
	 * 
	 * 생성자에서는 파일이름을 문자열 매개변수로 받는다
	 */
	public ScoreSE(String fileName) throws FileNotFoundException {
		sclist = new LinkedList<ScoreVO>();
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

	}

	public void viewLust() {
		for (ScoreVO vo:sclist) {
			System.out.println(vo);
		}
	}
	public void readFile() throws IOException {
		String reader = "";
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			String[] scores = reader.split(",");
			//scList에서 학생 이름을 검색하여
			// 값이 있는지 확인
			// 있으면 해당학생의 과목점수를 세팅
			int count=0;
			int scSize= sclist.size();
			//for(ScoreVO vo :sclist) {
			for(count =0; count <scSize;count++) {
				
			ScoreVO vo= sclist.get(count);
				String strName =vo.getName();
				//count++;
				
				if(strName.equals(scores[0])) {
					int intScore =Integer.valueOf(scores[2]);
					String subject =scores[1];
					if (subject.equals("국어"))vo.setKor(intScore);
					if (subject.equals("영어"))vo.setEng(intScore);
					if (subject.equals("수학"))vo.setMath(intScore);
					if (subject.equals("국사"))vo.setHjs(intScore);
					if (subject.equals("미술"))vo.setArt(intScore);
					if (subject.equals("과학"))vo.setSci(intScore);
					sclist.add(vo);
					
				}
				
			}
			if (count >=sclist.size()) {
				ScoreVO vo =new ScoreVO();
				
				int intScore =Integer.valueOf(scores[2]);
				String subject =scores[1];
				vo.setName(scores[0]);
				if (subject.equals("국어"))vo.setKor(intScore);
				if (subject.equals("영어"))vo.setEng(intScore);
				if (subject.equals("수학"))vo.setMath(intScore);
				if (subject.equals("국사"))vo.setHjs(intScore);
				if (subject.equals("미술"))vo.setArt(intScore);
				if (subject.equals("과학"))vo.setSci(intScore);
				sclist.add(vo);
				break;
			}
		}
	}
}
