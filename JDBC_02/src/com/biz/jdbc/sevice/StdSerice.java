package com.biz.jdbc.sevice;

import java.util.List;

import com.biz.jdbc.model.StdentVO;

/*
 * CRUD를 구현
 * 1. DB CONNECTION 을 설정
 *   실제 구현할 클래스에서 만들 부분
 * SELECTM 구현
 * INSERT 구현
 * UPDATE DELETE 구현
 */
public interface  StdSerice {
	
	//전체 리스트를 가져올 METHOD 
	//DBMSdprp SELE FORM 을 실행하여
	// 전체 리스트를 가져오는 일을 수행할 예정
	// 가져온 리스트를 자바의 리스트 자료 구조로 변환 시켜서
	//요청한 곳에 리턴
	public List<StdentVO> selectAll();
	
		
	// 학번을 기준으로 한 학생의 정보를 가져올 methed
	// 학번을 매개변수로 전달하고
	// 학번을 where로 하여 select를 수행한후
	// 한 학생의 정보를 가져와서 vo에 담아
	// 요청한 곳에 리턴
	public StdentVO findByNum(String st_num);
	
	// 학생정보를 DBinsert 할 메서드
	// 추가 (Create)하고자 하는 학생의 정보를
	// VO에 담아서 매개변수로 전달해 주고
	//INSERT를 수행하도록한다.
	public void insert(StdentVO vo) ;
		
	// 학생정보를 수정 (update)할 메서드
	// 수정 (UPDATE)를 수행할때는
	// 1, 학생 정보(한사람)를 조회하고
	// 2, 수정할 칼럼(항목)이 있으면 그 칼럼의 값 만 변경을 하고
	// 나머지 값은 그대로 유지하여
	// VO에 담겨 있는 값을 매개 변수로 전달하여
	 //update 수행한다
	public void update(StdentVO vo) ;
	
	// 삭제할때는 학번하나만 매개변수로 전달하고
	//delete를 수행한다.
	public void delete(String st_num) ;
		
		

	
	
}
