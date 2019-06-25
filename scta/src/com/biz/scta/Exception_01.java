package com.biz.scta;

import java.util.ArrayList;
import java.util.List;

public class Exception_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[3];
		String strkor = " 30 ";

		try {
			List<String> stList = new ArrayList<String>();
			String strName = null;
			nums[3] = 10;
			Integer.valueOf(strkor);
			String s = stList.get(1).toString();
		} catch (NumberFormatException e) {
System.out.println("넘버링 오류");
			e.printStackTrace();
		}

	}

}
