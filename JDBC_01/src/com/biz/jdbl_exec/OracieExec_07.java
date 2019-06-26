package com.biz.jdbl_exec;

import com.biz.jdbl.sevice.StdSevice;
import com.biz.jdbl_model.StudentVO;

public class OracieExec_07 {

	public static void main(String[] args) {

		StdSevice ss = new StdSevice();
		StudentVO vo = ss.findByNum("015");
		if (vo == null)
			System.out.println("조회한 데이터가 없읍");
		else
			System.out.println(vo);
	}

}
