package com.biz.jdbc.exec;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdSerice ss = new StdSericeImp_01();
		String stNo = "101"; 
		StdentVO vo = ss.findByNum(stNo);
		if (vo == null ) System.out.println("학생 데이터 없읍");
		else {
			System.out.println(vo.toString());
			vo.setSt_addr("대한민국 광주광역시");
			vo.setSt_nick("자바 코딩");
			vo.setSt_nick_rem("자바 코딩은 즐거워");
			ss.update(vo);
		}
	}

}
