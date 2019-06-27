package com.biz.jdbc.sevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.model.ScoroVO;

public class ScoreSeviceImp_01 implements ScoreSevice {

	List<ScoroVO> scList = null;
	Connection dbConn = null;
	private String jdbcDuver = "oracle.jdbc.driver.OracleDriver";

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String userNume = "user5";
	private String password = "1234";

	public void ScoreSeviceImp_01() {
		this.dbConnection();

	}

	private void dbConnection() {
		// 1. jdbcDuver on load
		try {
			Class.forName(jdbcDuver);
			// 2.
			dbConn = DriverManager.getConnection(url, userNume, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<ScoroVO> selectAll() {
		// TODO 여기는 전체 성적 데이터를 SELEC해서 list로 리턴하는 메서드
		String sql = " SELECT * FROM  TBL_SCORE";
		PreparedStatement pStr = null;
		try {
			pStr = this.dbConn.prepareStatement(sql);
			ResultSet rs = pStr.executeQuery();
			scList = new ArrayList<ScoroVO>();
			while (rs.next()) {
				ScoroVO vo = new ScoroVO();
//				SC_NO
//				SC_DAY
//				SC_ST_NO
//				SC_SUBJET
//				SC_SCORE

				vo.setSc_no(rs.getLong("sc_no"));
				vo.setSc_day(rs.getString("sc_day"));
				vo.setSc_st_no(rs.getString("sc_st_no"));
				vo.setSc_subjet(rs.getString("sc_subjet"));
				vo.setSc_score(rs.getInt("sc_score"));

				scList.add(vo);

			}
			return scList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ScoroVO findById(long sc_sep) {
		// TODO 여기는 일련번호 값을 매개 변수 받아 성적 데이터 1개의 레코드를
		String sql = " SELECT * FROM  TBL_SCORE";
		PreparedStatement pStr = null;

		try {
			scList = new ArrayList<ScoroVO>();
			pStr = this.dbConn.prepareStatement(sql);
			ResultSet rs = pStr.executeQuery();

			while (rs.next()) {

//				SC_NO
//				SC_DAY
//				SC_ST_NO
//				SC_SUBJET
//				SC_SCORE
				ScoroVO vo = new ScoroVO();
				vo.setSc_no(rs.getLong(1));
				vo.setSc_day(rs.getString(2));
				vo.setSc_st_no(rs.getString(3));
				vo.setSc_subjet(rs.getString(4));
				vo.setSc_score(rs.getInt(5));

				return vo;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insert(ScoroVO vo) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO tbl_score ( ";
		sql += " SC_NO, ";
		sql += "SC_DAY, ";
		sql += "SC_ST_NO,";
		sql += "SC_SUBJET, ";
		sql += "SC_SCORE )";
		sql += "VALUES(seq.nxetvar ?,?,?,?,? ) ";
		PreparedStatement ps = null;

		try {
			ps = this.dbConn.prepareStatement(sql);
			ps.setLong(1, vo.getSc_no());
			ps.setString(2, vo.getSc_day());
			ps.setString(3, vo.getSc_st_no());
			ps.setString(4, vo.getSc_subjet());
			ps.setInt(4, vo.getSc_score());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(ScoroVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long sc_sep) {
		// TODO Auto-generated method stub
		return 0;
	}

}
