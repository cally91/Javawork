package com.biz.BlackJack.se;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.BlackJack.Mode.DeckVO;

// 카드 정보를 생성하고
// 게임을 진행하는데 필요한 클래스
public class BlackJackService {

	List<DeckVO> deckList;
	String suif = "다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)";
	String denomination = "A23456789JQJ";

	public BlackJackService() {
		deckList = new ArrayList();

	}

	public List<DeckVO> getDeck() {
		for (int i = 0 ; i <50 ; i++) {
			Collections.shuffle(deckList);
		}
		return deckList;
		
	}

	public void makedack() {

		String[] suilts =suif.split(":");
		String[] denoMinations =denomination.split("");
		
		for (String s : suilts) {
			for (String d : denoMinations) {
				DeckVO vo = new DeckVO();
				vo.setSuit(s);
				vo.setDenomination(d);
				int intValue = 0;
				try {
					intValue=Integer.valueOf(d);
					if (intValue==0) intValue=10;
				} catch (Exception e) {
					if (d.equals("A")) {
						intValue =1;
						
					}else {
						intValue=10;
					}
				}
				
				vo.setValue(intValue);
				deckList.add(vo);
			}
		}
	}
	
	public void viewCardList() {
		for (DeckVO vo : deckList) {
			System.out.println(vo.toString());
		}
		System.out.println("=================");
		System.out.println("카드매수: "+deckList.size());
	}
}
