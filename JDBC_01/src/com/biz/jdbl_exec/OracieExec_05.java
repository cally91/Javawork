package com.biz.jdbl_exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbl_model.loilstVO;

public class OracieExec_05 {

	/*
	 * USER4 SCHENAL에 있는 tbl_IOlIST 테이블을 읽어서
	 * 이스트를 콘솔에 보이시오
	 */
	public static void main(String[] args) {

		
		List<loilstVO> ioList = new ArrayList<loilstVO>();
		
		String jdbcDriver="oracle.jdbc.driver.OracleDriver";
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String userName="user4";
		String password= "1234";
		
		try {
			Class.forName(jdbcDriver);
			try {
				Connection con =DriverManager.getConnection(url, userName, password);
				System.out.println("오라클 연결 성공");
				
				PreparedStatement pSta= null;
				
				String srl = "SELECT * FROM TBL_INIIST";
				pSta =con.prepareStatement(srl);
				ResultSet rs= pSta.executeQuery();
				while (rs.next()) {
					/*
					 * IO_SEP 1
						IO_DATE 2
						IO_INOUT 3
						IO_ANT 4
						IO_PRTCE 5
						IO_TOTAL 6
						IO_PCOED 7
						IO_CCODE 8
					 */
					loilstVO vo=new loilstVO();
					vo.setIO_SEP(rs.getInt(1));
					vo.setIO_DATE(rs.getString(2));
					vo.setIO_INOUT(rs.getString(3));
					vo.setIO_ANT(rs.getInt(4));
					vo.setIO_PRTCE(rs.getInt(5));
					vo.setIO_TOTAL(rs.getInt(6));
					vo.setIO_PCOED(rs.getString(7));
					vo.setIO_CCODE(rs.getString(8));
					ioList.add(vo);
				}
				System.out.println();
				for(loilstVO vo: ioList) {
					System.out.println(vo);
				}
			} catch (SQLException e) {
				
				System.out.println("오라클 실행오류");
//				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 파일오류");
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		}
		
		
	}

}
