package com.biz.BlackJack.contrTLer;

import com.biz.BlackJack.se.BlackJackService;

public class BlackJack_01 {

	public static void main(String[] args) {

		BlackJackService bs = new BlackJackService();
		bs.makedack();
		bs.viewCardList();
		
		
	}

}
