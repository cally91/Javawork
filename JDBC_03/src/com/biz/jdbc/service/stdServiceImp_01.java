package com.biz.jdbc.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.config.DBconnection;
import com.biz.jdbc.model.StuDestVO;

public class stdServiceImp_01 implements StdService {

	@Override
	public List<StuDestVO> selecAll() {
		String sql = " SELECT * FROM TBL_STUDENT";
		PreparedStatement pStr = null;

		try {
			pStr = DBconnection.dbconn.prepareStatement(sql);
			ResultSet rs = pStr.executeQuery();
			List<StuDestVO> stdList = new ArrayList<StuDestVO>();
			while (rs.next()) {
				StuDestVO vo = new StuDestVO(rs.getString("st_no"), 
						rs.getString("st_name"), 
						rs.getString("st_addr"),
						rs.getInt("st_grade"), 
						rs.getInt("st_height"),
						rs.getInt("st_weight"), 
						rs.getString("st_nick"),
						rs.getString("st_nick_rem"),
						rs.getString("st_dept_no"));
				stdList.add(vo);

//				vo.setSt_no(rs.getString("st_no"));
//				vo.setSt_name(rs.getString("st_name"));
//				vo.setSt_addr(rs.getString("st_addr"));
//				vo.setSt_grade(rs.getInt("st_grade"));
//				vo.setSt_height(rs.getInt("St_height"));
//				vo.setSt_weight(rs.getInt("St_weight"));
//				vo.setSt_nick(rs.getString("St_nick"));
//				vo.setSt_nick_rem(rs.getString("St_nick_rem"));
//				vo.setSt_dep_name(rs.getString("St_dep_name"));

			}
			return stdList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public StuDestVO findByNum(String stNo) {

		String sql = " select * from TBL_STUDENT";
		sql += "where st_no = ? ";// + stNo;
		 
		PreparedStatement ps = null;

		try {
			ps = DBconnection.dbconn.prepareStatement(sql);
			ps.setString(1, stNo);
			ResultSet rs = ps.executeQuery();
			
			//List<StuDestVO> stdList = new ArrayList<StuDestVO>();
			if (rs.next()) {
				StuDestVO vo = new StuDestVO(rs.getString("st_no"),
						rs.getString("st_name"), 
						rs.getString("st_addr"),
						rs.getInt("st_grade"), 
						rs.getInt("st_height"), 
						rs.getInt("st_weight"),
						rs.getString("st_nick"),
						rs.getString("st_nick_rem"),
						rs.getString("st_dept_no"));
				// stdList.add(vo);

				return vo;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<StuDestVO> findByName(String stNume) {
		String sql = " select * from TBL_STUDENT";
		sql += "where st_name=?";// + stNume;

		PreparedStatement ps = null;

		try {
			ResultSet rs = ps.executeQuery();
			ps = DBconnection.dbconn.prepareStatement(sql);
			List<StuDestVO> stdList = new ArrayList<StuDestVO>();
			if (rs.next()) {
				StuDestVO vo = new StuDestVO(rs.getString("st_no"), 
						rs.getString("st_name"), 
						rs.getString("st_addr"),
						rs.getInt("st_grade"),
						rs.getInt("st_height"), 
						rs.getInt("st_weight"), 
						rs.getString("st_nick"),
						rs.getString("st_nick_rem"), 
						rs.getString("st_dept_no"));
				stdList.add(vo);

			}
			return stdList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insert(StuDestVO vo) {
		String sql = "insert into tbl_student (";
		sql += " ST_NO, ";
		sql += " ST_NAME, ";
		sql += " ST_ADDR, ";
		sql += " ST_GRADE, ";
		sql += " ST_HEIGHT, ";
		sql += " ST_WEIGHT, ";
		sql += " ST_NICK, ";
		sql += " ST_NICK_REM, ";
		sql += " ST_DEPt_NAME) ";
		sql += " values (seq.nxetvar ?,?,?,?,?,?,?,?,?) ";
		PreparedStatement ps = null;
		try {
			/*
			 * DBMS와 연결되는 Connaction정보를 service 클래스에 변수로 등록하고 변수를 사용해서 query 를 사용하는 방법이 아닌
			 * 
			 * 필요할때마다 DBConnection 클래스의 dbconn 객채변수를 직접 사용하여 query 를 실행하는 방법을 사용한다 serice
			 * 클래스에 변수를 선언, 생성하는 절차가 필요없이 필요할때마다 dbconn 변수를 직접 사용하므로서 serivce 클래스에 불필요한 변수
			 * 생성 코드를 작성하지않아도 되고 혹시 모를 변수 생성이 되저않아 발생할수있는 runtime e
			 */
			ps = DBconnection.dbconn.prepareStatement(sql);
			ps.setString(1, vo.getSt_no());
			ps.setString(2, vo.getSt_name());
			ps.setString(3, vo.getSt_addr());
			ps.setInt(4, vo.getSt_grade());
			ps.setInt(5, vo.getSt_height());
			ps.setInt(6, vo.getSt_weight());
			ps.setString(7, vo.getSt_nick());
			ps.setString(8, vo.getSt_nick_rem());
			ps.setString(9, vo.getSt_dept_name());

			ps.executeUpdate();
			System.out.println("데이터 추가 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int updete(StuDestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String stNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String makeStNum() {
		// TODO Auto-generated method stub
		return null;
	}

}
