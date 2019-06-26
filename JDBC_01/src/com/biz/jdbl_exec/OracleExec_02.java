package com.biz.jdbl_exec;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbl_model.StudentVO;

public class OracleExec_02 {

	public static void main(String[] args) {

		List<StudentVO> stdList =new ArrayList<StudentVO>();
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
					for(int i =0; i <=9;i++) {
						System.out.print(rs.getString(i)+"\t");
					}
				System.out.println();
				
				}
			} catch (SQLException e) {
				System.out.println("오라클에 연결할수없습");

			}
		} catch (ClassNotFoundException e) {
			System.out.println("jDBC driver 실행오류");
		}
		
	}

}
