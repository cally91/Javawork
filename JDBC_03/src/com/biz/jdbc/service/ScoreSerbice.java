package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.model.ScoreVO;
import com.biz.jdbc.model.StuDestVO;

public interface ScoreSerbice {

	public List<ScoreVO> selectAll() ;
	public  ScoreVO finaBySep(long sep) ;
	
	public List<ScoreVO> finaByNum(String stnum) ;
		
	
	public int insert(ScoreVO vo);
	public int updete(ScoreVO vo);
	public int delete(long sep);
	
	
}
