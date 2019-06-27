package com.biz.jdbc.sevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.model.StdentVO;

import oracle.net.aso.s;

/*
 * StdService interFace(설계도)에 기반한
 * 
 */
public class StdSericeImp_01 implements StdSerice {

	private List<StdentVO> stdList = null;
	private Connection dbConn = null;
	private String jdbcDuver = "oracle.jdbc.driver.OracleDriver";

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String userNume = "user5";
	private String password = "1234";

	public StdSericeImp_01() {
		this.dbConnection();

	}

	// dbConnection은 외부에서 실행하지 못하도록 private으로 선언한다.
	// dbConnection이 자주 실행되는 것은 Driver를 계속 on Load 시키고
	// 통로를 새로 설정하는 과정이 반복되어 문제를 일으 킬수 있기 때문이다.
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
	public List<StdentVO> selectAll() {
		// TODO 여기는 전체 리스트를 SELECT하는 매서드이다
		String spl = " SELECT * FROM tbl_stuent";

		// String으로 된 sql 문장을 DBMS방식의 코드로 변환하여
		// DBMS 에게 전달하는 역활을 수행한다
		PreparedStatement pStr = null;
		try {
			// spl 문을 dbms코드로 변환(컴파일)하여 잠시 보관
			pStr = this.dbConn.prepareStatement(spl);
			// query를 실행하고
			// dBMS보낸 결과를 resuliset 데이터 구조로 바꾸어
			// 리턴을 한다

			// ResultSet 구조의 객체를 선언하여 데이터를 수신한다
			ResultSet rs = pStr.executeQuery();
			/*
			 * ResultSet :DBMS가 보낸 데이터를 배열 형태로 보관을 하고 NExT() 메서드를 실행하면 한줄씩 데이터를 읽어 온다 단, 읽는
			 * 방법은 일방 통행이다. 처음부터 끝 방향으로
			 */
//			if(rs.next()) System.out.println("데이터가 잇다");
//		else System.out.println("데이터가 없다");
			stdList = new ArrayList<StdentVO>();
			while (rs.next()) {
				StdentVO vo = new StdentVO();
//				ST_NO 1
//				ST_NAME 2
//				ST_ADDR 3
//				ST_GRADE 4
//				ST_HEIGHT 5
//				ST_WEIGHT 6
//				ST_NICK 7
//				ST_NICK_REM 8
//				ST_DEP_NAME 9

				// old 코드
				vo.setSt_no(rs.getString(1));
				vo.setSt_name(rs.getString(2));
				vo.setSt_addr(rs.getString(3));
				vo.setSt_grade(rs.getInt(4));
				vo.setSt_height(rs.getInt(5));
				vo.setSt_weight(rs.getInt(6));
				vo.setSt_nick(rs.getString(7));
				vo.setSt_nick_rem(rs.getString(8));
				vo.setSt_dep_name(rs.getString(9));

				// new 코드
				vo.setSt_no(rs.getString("st_no"));
				vo.setSt_name(rs.getString("st_name"));
				vo.setSt_addr(rs.getString("st_addr"));
				vo.setSt_grade(rs.getInt("st_grade"));
				vo.setSt_height(rs.getInt("St_height"));
				vo.setSt_weight(rs.getInt("St_weight"));
				vo.setSt_nick(rs.getString("St_nick"));
				vo.setSt_nick_rem(rs.getString("St_nick_rem"));
				vo.setSt_dep_name(rs.getString("St_dep_name"));

				stdList.add(vo);
			}
			return stdList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return null;
	}

	@Override
	public StdentVO findByNum(String st_num) {
		// TODO 학번을 매개변수로 받아 한 학생의 정보를 리턴하는 메서드

		// sql문을 작성할때 따움표가 시작되는 곳과 끝나는 곳에 스페이스바 필수
		String sql = " SELECT * FROM  TBL_STUENT ";
		sql += " WHERE st_no =  " + st_num;
		PreparedStatement ps = null;
		try {
			ps = dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				StdentVO vo = new StdentVO();
				vo.setSt_no(rs.getString("st_no"));
				vo.setSt_name(rs.getString("st_name"));
				vo.setSt_addr(rs.getString("st_addr"));
				vo.setSt_grade(rs.getInt("st_grade"));
				vo.setSt_height(rs.getInt("St_height"));
				vo.setSt_weight(rs.getInt("St_weight"));
				vo.setSt_nick(rs.getString("St_nick"));
				vo.setSt_nick_rem(rs.getString("St_nick_rem"));
				vo.setSt_dep_name(rs.getString("St_dep_name"));

				return vo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		return null;
	}

	@Override
	public void insert(StdentVO vo) {
		// TODO Auto-generated method stub
		String sql = " INSERT INTO tbl_stuent ( ";
		sql += " ST_NO, ";
		sql += " ST_NAME, ";
		sql += " ST_ADDR, ";
		sql += " ST_GRADE, ";
		sql += " ST_HEIGHT, ";
		sql += " ST_WEIGHT, ";
		sql += " ST_NICK, ";
		sql += " ST_NICK_REM, ";
		sql += " ST_DEP_NAME ) ";
		sql += " VALUES(?,?,?,?,?,?,?,?,? )";

		PreparedStatement ps = null;
		try {
			ps = this.dbConn.prepareStatement(sql);
			ps.setString(1, vo.getSt_no());
			ps.setString(2, vo.getSt_name());
			ps.setString(3, vo.getSt_addr());
			ps.setInt(4, vo.getSt_grade());
			ps.setInt(5, vo.getSt_height());
			ps.setInt(6, vo.getSt_weight());
			ps.setString(7, vo.getSt_nick());
			ps.setString(8, vo.getSt_nick_rem());
			ps.setString(9, vo.getSt_dep_name());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(StdentVO vo) {
		// TODO Auto-generated method stub
		String sql = " UPDATE tbl_stuent  SET";

		sql += " ST_NAME = ?, ";
		sql += " ST_ADDR= ?, ";
		sql += " ST_GRADE= ?,";
		sql += " ST_HEIGHT= ?, ";
		sql += " ST_WEIGHT= ?, ";
		sql += " ST_NICK= ?, ";
		sql += " ST_NICK_REM= ?, ";
		sql += " ST_DEP_NAME= ? ";
		sql += " WHERE ST_NO= ? ";
		PreparedStatement ps = null;

		try {
			ps = this.dbConn.prepareStatement(sql);
			ps.setString(1, vo.getSt_no());
			ps.setString(2, vo.getSt_name());
			ps.setString(3, vo.getSt_addr());
			ps.setInt(4, vo.getSt_grade());
			ps.setInt(5, vo.getSt_height());
			ps.setInt(6, vo.getSt_weight());
			ps.setString(7, vo.getSt_nick());
			ps.setString(8, vo.getSt_nick_rem());
			ps.setString(9, vo.getSt_dep_name());
			ps.executeUpdate();
			System.out.println("업데이트 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(String st_num) {
		// TODO 여기는 한개의 레코드(데이터)를 삭제하는 메서드이다.
		String sql = " DELETE FROM TBL_STUENT  ";
		sql += " WHERE ST_NO = " + st_num;

		PreparedStatement ps = null;
		try {
			ps = this.dbConn.prepareStatement(sql);
			int ret = ps.executeUpdate();

			// 삭제가 정상적으로 이루어 졌는지 알아보는 방법으로
			// 아래 2가지 코드가 있지만
			// DBMS 서버와 통신(데이터 주고 받기)하는 과정에서
			// 레코드 정상적으로 삭제되면 반드기 0 이상의 값을
			// RETURN 해서 RET값에 담아 주지만

			// 레코드 삭제가 이루어 지지 않았을 경우
			// 정말 삭제할 레코드가 없는 경우도 있고
			// 이경우는 0을 return 할것이다

			// 하지만
			// 어떤 이유로 레코드가 있음에도 삭제가 이루어지지 않았을 경우
			// 0 미만의 값을 return 하는 경우도 있다.
			// 이런 경우 2번의 방법에서는
			// 정상적으로 삭제가 이루어졌다는 메시지를 보이게 된다.

			// 따라서 1번 방법이 안전한 코드 작성 법이다.

			// 1번 검증 방법
			if (ret > 0)
				System.out.println(ret + " 레코드 삭제성공");
			else
				System.out.println("삭제할 데이터가없습");

			// 2번 검증 방법
			if (ret == 0)
				System.out.println("삭제할 데이터가없습");
			else
				System.out.println(ret + " 레코드 삭제성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end delte

	public String makeStno() {

		String spl = " SELECT LPAD(MAX(ST_NO) +1,3,'0') FROM tbl_stuent ";
		PreparedStatement ps = null;
		try {
			ps = this.dbConn.prepareStatement(spl);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String strNum = rs.getString(1);
				return strNum;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
