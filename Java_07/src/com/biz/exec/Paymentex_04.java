package com.biz.exec;

import java.util.List;

import com.biz.mode.poVO;
import com.biz.sereice.PayMentexSE;

public class Paymentex_04 {

	public static void main(String[] args) {

		String strFile = "src/com/biz/exec/txt/금여명세서.txt";
		PayMentexSE pse= new PayMentexSE();
		pse.menuy();
		pse.paytxt(strFile);
	}

}
