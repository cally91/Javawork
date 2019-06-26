package com.biz.jdbl.sevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.SliderUI;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.biz.jdbl_model.StudentVO;

public class StdSevice {

	List<StudentVO> stdList=null;
	Connection dbConn=null;
	
   public StdSevice() {
	   stdList =new ArrayList<StudentVO>();
	   this.dbConnection();
	   
	
}
   // DB연결을 성절하는 서비스 내부에서만 사용할 메서드
   
   private void dbConnection() {
	   String jdbcDriver ="oracle.jdbc.driver.OracleDriver";
		
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String userName ="user4";
		String password="1234";
		try {
			Class.forName(jdbcDriver);
				dbConn=DriverManager.getConnection(url, userName, password);
			} catch (SQLException e) {
				System.out.println("오라클 실행 오류");
//				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 연결오류");
			//e.printStackTrace();
		}
		
		
   }
			//전체 읽기
	public List<StudentVO> selectAll(){
		String sql="SELECT * FROM tbl_student";
		PreparedStatement pStr =null;
		try {
			pStr = dbConn.prepareStatement(sql);
			ResultSet rs =pStr.executeQuery();
			while(rs.next()) {
				StudentVO vo =new StudentVO();
				vo.setSt_no(rs.getString(1));
				vo.setSt_name(rs.getString(2));
				vo.setSt_add(rs.getString(3));
				vo.setSt_gtade(rs.getInt(4));
				vo.setSt_heignt(rs.getInt(5));
				vo.setSt_weight(rs.getInt(6));
				vo.setSt_nick(rs.getString(7));
				vo.setSt_nick_nem(rs.getString(8));
				vo.setSt_dept_no(rs.getString(9));
				stdList.add(vo);
			}
			return stdList;
		} catch (SQLException e) {
			
			//e.printStackTrace();
		}
		return null;
	}
	//pk로 조회하여 1개 씩 읽기
	public StudentVO findByNum(String num) {
		String sql=" SELECT * FROM tbl_student ";
		sql +=" WHERE st_no = " +num;
		PreparedStatement pStr =null;
		try {
			pStr=dbConn.prepareStatement(sql);
			//PK를 조건으로 검색을 했기 때문에
			// rs에는 한명 이하의 학생 정보가 들어 있을 것이다.
			ResultSet rs = pStr.executeQuery();
			// while문으로 반복하지 않고 한번만 next()를 실행한다
			rs.next();
			StudentVO vo =new StudentVO();
			vo.setSt_no(rs.getString(1));
			vo.setSt_name(rs.getString(2));
			vo.setSt_add(rs.getString(3));
			vo.setSt_gtade(rs.getInt(4));
			vo.setSt_heignt(rs.getInt(5));
			vo.setSt_weight(rs.getInt(6));
			vo.setSt_nick(rs.getString(7));
			vo.setSt_nick_nem(rs.getString(8));
			vo.setSt_dept_no(rs.getString(9));
			
			return vo;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		return null;
	}
	//Create,Insert 를 수행할 메서드
	public void insert(StudentVO vo) {
		
	}
	public void update(StudentVO vo) {
		
	}
	public void delete(String num) {
		
	}
}
