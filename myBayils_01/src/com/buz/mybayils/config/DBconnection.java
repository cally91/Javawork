package com.buz.mybayils.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBconnection {

	/*
	 * MyBatis의 기능으로
	 * SBConnection Pool 을 생성하고
	 * 관리하는 관리주제
	 * 
	 * Factory
	 * 어껀 클래스를 객체 그룹으로 생성해 두고
	 * ]필요한 곳에 공급하는
	 * Manager 성격의 클래스
	 */
	private static SqlSessionFactory sqlSessionFactory=null;
	
	static {
		String configFile ="com/buz/mybayils/config/dbconfig.xml";
		/*
		 * Reader는 FilReader, BufferedReader의 할아버지
		 */
		try {
			Reader configResource = Resources.getResourceAsReader(configFile);
			if (sqlSessionFactory == null) {
				sqlSessionFactory =new SqlSessionFactoryBuilder().build(configResource);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();	
									
			}
			
		}//end static 
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}

