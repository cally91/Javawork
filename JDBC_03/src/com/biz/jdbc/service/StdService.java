package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.model.StuDestVO;

public interface StdService {

	public List<StuDestVO> selecAll();
	// select 실행해서 데이터를 조회할때
	//분명히 1개의 데이터만 조회 될 것이다.
	// 라고하면 return type 으로 vo를 사용
	public StuDestVO findByNum(String stNo);
	
	// 확율적으로 대부분 1개의 데이터가 조회 될것이지만.
	// 어쩌다 한번이라도 1개 이상의 데이터가 조회 될것이다.
	//라고하면 return type은 무조선 List를 사용
	public List<StuDestVO> findByName(String stNume);

	public int insert(StuDestVO vo);
	public int updete(StuDestVO vo);
	public int delete(String stNo);
	
	public  String makeStNum() ;
		
	

}
