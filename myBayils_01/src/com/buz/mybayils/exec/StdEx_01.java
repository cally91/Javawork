package com.buz.mybayils.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.buz.mybatis.dao.StudentDao;
import com.buz.mybayils.config.DBconnection;
import com.buz.mybayils.model.studentVO;

public class StdEx_01 {

	public static void main(String[] args) {
		/*
		 * SessionFactory 에데 DBMS에 연결할 Session을 요청
		 * Session: DBMS 에 연결할 Connection Poot
		 */
		SqlSession sqlSession =DBconnection.getSqlSessionFactory().openSession(true);
		
		/*
		 * Session에서 mapper를 요청
		 * StudentDao  interface 를 이용해서
		 */
		StudentDao stdDao
			=(StudentDao)sqlSession.getMapper(StudentDao.class);
		
		List<studentVO> stdList =null;
		stdList =stdDao.selectAll();
		for (studentVO vo: stdList) {
			System.out.println(vo);
		}
		

	}

}
