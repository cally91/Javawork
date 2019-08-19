package com.buz.mybayils.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.buz.mybatis.dao.ScoreDao;
import com.buz.mybayils.config.DBconnection;
import com.buz.mybayils.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SqlSession sqlSession =DBconnection.getSqlSessionFactory().openSession(true);

ScoreDao scDao=(ScoreDao) sqlSession.getMapper(ScoreDao.class);
List<ScoreVO> scList=scDao.selectAll();
for(ScoreVO vo:scList) {
System.out.println(vo);
	}

}
}
