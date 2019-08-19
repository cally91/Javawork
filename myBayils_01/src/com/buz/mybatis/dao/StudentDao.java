package com.buz.mybatis.dao;

import java.util.List;

import com.buz.mybayils.model.studentVO;

public interface StudentDao {

	public List<studentVO> selectAll();
	public studentVO fineByNum(String st_num);
	
	public int insert(studentVO vo);
	public int update(studentVO vo);
	public int delete(String st_num);
}
