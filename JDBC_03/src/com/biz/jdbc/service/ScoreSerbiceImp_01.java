package com.biz.jdbc.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.config.DBconnection;
import com.biz.jdbc.model.ScoreVO;
import com.biz.jdbc.model.StuDestVO;

public class ScoreSerbiceImp_01 implements ScoreSerbice {

	@Override
	public List<ScoreVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScoreVO finaBySep(long sep) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public List<ScoreVO> finaByNum(String stnum) {
		// TODO Auto-generated method stub
		String sql = " select * from tbl_score ";
		sql += " where st_num =? ";//
		PreparedStatement ps = null;

		try {
			ResultSet rs = ps.executeQuery();
			ps = DBconnection.dbconn.prepareStatement(sql);
			List<ScoreVO> scList = new ArrayList<ScoreVO>();

			while (rs.next()) {
				ScoreVO vo = new ScoreVO(
						rs.getLong("SC_SEQ"),
						rs.getString("SC_DATE"),
						rs.getString("SC_ST_NO"),
						rs.getString("SC_SUBJECT"), 
						rs.getInt("SC_SCORE"));
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
	public int insert(ScoreVO vo) {
		// TODO Auto-generated method stub

		String sql = " INSERT INTO TBL_SCORE ( ";
		sql += " SC_SEQ, ";
		sql += " SC_DATE,";
		sql += " SC_ST_NO, ";
		sql += " SC_SUBJECT, ";
		sql += " SC_SCORE ) ";
		sql += " values(seq.nxetvar ?,?,?,?,?)";
		PreparedStatement ps = null;

		try {
			ps = DBconnection.dbconn.prepareStatement(sql);
			ps.setLong(1, vo.getSC_SEQ());
			ps.setString(2, vo.getSC_DATE());
			ps.setString(3, vo.getSC_ST_NO());
			ps.setString(4, vo.getSC_SUBJET());
			ps.setInt(5, vo.getSC_SCORE());

			ps.executeUpdate();
			System.out.println("업데이트 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int updete(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long sep) {
		// TODO Auto-generated method stub
		return 0;
	}

}
