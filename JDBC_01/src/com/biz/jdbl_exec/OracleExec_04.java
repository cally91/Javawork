package com.biz.jdbl_exec;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbl_model.ScoreVO;
import com.biz.jdbl_model.StudentVO;

public class OracleExec_04 {

	public static void main(String[] args) {
		List<ScoreVO> stdList =new ArrayList<ScoreVO>();
		String jdbcDriver ="oracle.jdbc.driver.OracleDriver";
		
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String userName ="user4";
		String password="1234";
		try {
			Class.forName(jdbcDriver);
			try {
				Connection con = DriverManager.getConnection(url,userName,password);
				System.out.println("오라클 연결 성공");
				
				PreparedStatement pStr =null;
				String sql="select * from tbl_student";
				pStr =con.prepareStatement(sql);
				
				ResultSet rs=pStr.executeQuery();
				
				while (rs.next()) {
					
					
					/*
					 * SC_SEQ
						SC_DATE
						SC_ST_NO
					SC_SCORE
						SC_SB_NO
					 */
					ScoreVO vo =new ScoreVO();
					vo.setSc_seq(rs.getLong(1));
					vo.setSc_date(rs.getString(2));
					vo.setSc_st_no(rs.getString(3));
					vo.setSc_score(rs.getInt(4));
					vo.setSc_sb_no(rs.getString(5));
					stdList.add(vo);
				}
				
				for(ScoreVO vo: stdList) {
					System.out.println(vo);
				}
			} catch (SQLException e) {
				System.out.println("오라클에 연결할수없습");

			}
		} catch (ClassNotFoundException e) {
			System.out.println("jDBC driver 실행오류");
		}
		
	}

}
