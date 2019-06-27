package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_08 {

	
	public static void main(String[] args) {
		
 StdSerice ss =new StdSericeImp_01();
 Scanner scan = new Scanner(System.in);
 
 
 while (true) {
	 System.out.print("학번(종료:-E>> ");
	 String strNo =scan.nextLine();
	 if(strNo.equals("-E")) break;
	 
	 StdentVO vo =ss.findByNum(strNo);
	 if (vo==null) {
		 System.out.println("학생정보 없습");
		 continue;
	 }
	 else {
		System.out.println(vo);
		System.out.println("===========");
		
		System.out.print("주소 >");
		String straddr =scan.nextLine();
		//주소를 입력하지않으면 update하지말고 처음으로 점프
		if(straddr.isEmpty()) continue;
		vo.setSt_addr(straddr);
		ss.update(vo);
	}
	 
	
}
	}

}
