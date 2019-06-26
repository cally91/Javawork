package com.biz.jdbl_exec;

import java.util.List;

import com.biz.jdbl.sevice.StdSevice;
import com.biz.jdbl_model.StudentVO;

public class OracieExec_06 {

	public static void main(String[] args) {

		StdSevice ss =new StdSevice();
		List<StudentVO> stdList =ss.selectAll();
		if(stdList != null) {
			for (StudentVO vo : stdList) {
				System.out.println(vo);
			}
		}else {
			System.out.println("학생정보 입력중 오류"); 
		}
	}

}
