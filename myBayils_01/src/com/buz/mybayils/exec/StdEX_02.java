package com.buz.mybayils.exec;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.buz.mybatis.dao.StudentDao;
import com.buz.mybayils.config.DBconnection;
import com.buz.mybayils.model.studentVO;

import oracle.jdbc.driver.DBConversion;

public class StdEX_02 {

	public static void main(String[] args) {

		SqlSessionFactory sf = DBconnection.getSqlSessionFactory();
		SqlSession sqlSession= sf.openSession(true);
		sqlSession =DBconnection.getSqlSessionFactory().openSession(true);
		
		StudentDao stdDao =(StudentDao) sqlSession.getMapper(StudentDao.class);
		
		studentVO vo = new studentVO();
		vo.setSt_num("001");
		vo.setSt_name("장영실");
		vo.setSt_tel("009");
		vo.setSt_grade(1);
		int ret =stdDao.insert(vo);
		if(ret>0)System.out.println("데이터추가성공");
		else System.out.println("데이터 추가 실패");
			
		
		
	}

}
