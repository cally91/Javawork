package com.biz.jdbc.exec;

import java.util.List;

import com.biz.jdbc.model.StdentVO;
import com.biz.jdbc.sevice.StdSerice;
import com.biz.jdbc.sevice.StdSericeImp_01;

public class StdExec_01 {

	public static void main(String[] args) {

		StdSerice ss =new StdSericeImp_01() ;
			
			List<StdentVO> stdList=null;
			ss.selectAll();
			ss.selectAll();
			stdList =ss.selectAll();
			
			if (stdList ==null) System.out.println("데이터가 없습 !!");
			else {
			System.out.println("리스트 개수 :" +stdList.size());
			for(StdentVO vo: stdList) {
				System.out.println(vo.toString());
			}
		}
	}
			

}
