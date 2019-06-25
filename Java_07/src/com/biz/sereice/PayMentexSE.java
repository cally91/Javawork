package com.biz.sereice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.mode.poVO;

public class PayMentexSE {

	List<Integer> intList;	
	Scanner scanner;
poVO vo =new poVO();
	public PayMentexSE() {
		
		intList=new ArrayList<Integer>();
		scanner = new Scanner(System.in);
	}

	public void menuy() {
		System.out.print("총금액>>");
		String strmonuy = scanner.nextLine();
		int intMonuy = Integer.valueOf(strmonuy);
		vo.setMouny(strmonuy);
		int mxaMenuy = 50000;
		
		int sw = 1;
		while (intMonuy > 5) {
			int pay = (int) (intMonuy / mxaMenuy);

			intMonuy -= (pay * mxaMenuy);
			if (sw < 0)
				mxaMenuy = mxaMenuy / 5;
			else
				mxaMenuy = mxaMenuy / 2;
			sw=sw*(-1);
			intList.add(mxaMenuy);
			vo.setGa(pay);
		
		}
	
	}

	public void paytxt(String strlist) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try {
			fileWriter = new FileWriter(strlist);
			printWriter = new PrintWriter(fileWriter);
		} catch (IOException e) {
		}
		for (int num : intList) {
			printWriter.println(num + "원권"+vo.getGa());
		}
		
		printWriter.flush();
		printWriter.close();

	}

}
