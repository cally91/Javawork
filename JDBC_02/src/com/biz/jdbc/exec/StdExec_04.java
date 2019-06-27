package com.biz.jdbc.exec;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdSerice ss =new StdSericeImp_01();
		StdentVO stdVO=new StdentVO();
		stdVO.setSt_no("101");
		stdVO.setSt_name("이몽룡");
		stdVO.setSt_grade(3);
		stdVO.setSt_dep_name("컴공과");
		ss.insert(stdVO);
	}

}
