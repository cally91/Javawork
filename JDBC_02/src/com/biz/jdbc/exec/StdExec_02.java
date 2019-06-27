package com.biz.jdbc.exec;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdSerice ss=new StdSericeImp_01();
		StdentVO stdVO=ss.findByNum("001");
		if(stdVO== null) System.out.println("찾는 학생이 없습");
		else System.out.println(stdVO.toString());

	}

}
