package com.biz.jdbc.sevice;

import java.util.List;

import com.biz.jdbc.model.ScoroVO;

public interface ScoreSevice {

	public List<ScoroVO> selectAll() ;
	public ScoroVO findById(long sc_sep);
	public int insert(ScoroVO vo);
	public int update(ScoroVO vo);
	public int delete(long sc_sep);
	
}
