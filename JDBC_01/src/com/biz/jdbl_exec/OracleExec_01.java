package com.biz.jdbl_exec;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleExec_01 {

	/*
	 * ojbdc6 를 프로젝트에 설치
	 * 2. TBL_student 와 rbl_core 테이블 구조와 같은
	 * vo를 생성
	 * 3. 오하클 DBMS로부터 두테이블 에 담긴 값을 가져와서
	 *  콘솔에 보여주는 코드
	 */
	public static void main(String[] args) {

		// 오라클에서 제공해주는 
		//jdbcDruiver 이름을 변수에 설정
		String jdbcDriver ="oracle.jdbc.driver.OracleDriver";
		
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String userName ="user4";
		String password="1234";
		try {
			//Driver 를 사용할수있도록
			//자바에게 준비해달라고 요청을 해야한다
			Class.forName(jdbcDriver);
			//Java(jam)입장에서 외부장치(DBMS)와
			//연결하는 통로가 여러개 존재하면
			//어떤통로를 통해서 데이터를 주고 받아야할지
			//강당히 불편할것이다
			//그래서 DriverManager 한테
			//dbms 데이터를 주고받을 통로를 하나만 만들고
			// 그 정보를 달라 하고 요청
			// 그리고 그 정보를 con이라는 객체 변수에 담아놓는다.
			try {
				Connection con = DriverManager.getConnection(url,userName,password);
				System.out.println("오라클 연결 성공");
				//오라클에서 명령을 보내기
				//표준	JDBS 명령
				
				//JDBC통해서 SQL 을 전달할때 사용할 클래스
				PreparedStatement pStr =null;
				String sql="select * from tbl_student";
				//sql 문자열을 오라클 고유의 명령으로 변환 시키놔라
				pStr =con.prepareStatement(sql);
				
				// 오라클에게 명령을 보내고
				// 그 결과를 나에게 달라
				ResultSet rs=pStr.executeQuery();
						
				while (rs.next()) {
				String strNum=	rs.getString(1);
				String strName = rs.getString(2);
				System.out.println(strNum+":"+strName);
					
				}
			} catch (SQLException e) {
				//DriverManager 가 ojdmc를 통해서
				//오라클에서 연결신호을 보냈는데
				//어떤 이유인지 연결이 불가능할때
 
				System.out.println("오라클에 연결할수없습");
			//	e.printStackTrace();

			}
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("jDBC driver 실행오류");
		}
		
	}

}
