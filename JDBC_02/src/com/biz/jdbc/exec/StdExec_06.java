package com.biz.jdbc.exec;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_06 {

	public static void main(String[] args) {

		StdSerice ss =new StdSericeImp_01();
		
		String stNo="102";
		
		StdentVO vo =ss.findByNum(stNo);
		
		if (vo ==null) System.out.println("학생 데이터가없습");
		else {
			ss.delete(vo.getSt_no());
			ss.delete(stNo);
		}
	}

}
