package com.biz.jdbc.exec;

public class StringEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sNum="0001";
		int intLength =sNum.length();
		
		for(int i = 0 ; i<10;i++) {
			
		
		int intNum=Integer.valueOf(sNum)+1;//2
		sNum="00000"+intNum;// 000002
		sNum=sNum.substring(sNum.length()-intLength);
		System.out.println(sNum);
		}
		//010-9652-****
		String tel ="010-9652-9999";
		String telsec= tel.substring(0,tel.length()-4);
		telsec+="****";
		System.out.println(telsec); 

	}

}
