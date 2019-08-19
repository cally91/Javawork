package com.biz.iolist.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConnection {

	private static SqlSessionFactory sqlSessionFactory =null;
	
	static {
		String configFile ="com/biz/iolist/config/DBConfig.xml";
		
		try {
			InputStream inputStream =Resources.getResourceAsStream(configFile);
			SqlSessionFactoryBuilder buildet =new SqlSessionFactoryBuilder();
			
			if (sqlSessionFactory ==null) {
				sqlSessionFactory =buildet.build(inputStream);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  static SqlSessionFactory getSessionFactory() {
		return sqlSessionFactory;
	}
}
