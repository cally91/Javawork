package com.biz.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class DBconnection {

	public static Connection dbconn = null;

	static {
		// OracleDrivr= full path
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String userNume = "user5";
		String password = "1234";

		try {
			Class.forName(jdbcDriver);
			dbconn = DriverManager.getConnection(url, userNume, password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
