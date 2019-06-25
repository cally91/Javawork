package com.biz.exec;

import com.biz.exec.mode.StudentVO;

public class Exec_07 {

	public static void main(String[] args) {

		// null로 초기화를 하는것은 
		//문법오류를 잠시 보류하는것효과를 낸다
		StudentVO studentVO= null;
		
		studentVO= new StudentVO();
		studentVO.numder="001";
		studentVO.name="홍길동";
	}

}
