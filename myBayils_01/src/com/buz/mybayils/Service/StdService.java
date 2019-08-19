package com.buz.mybayils.Service;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.buz.mybatis.dao.StudentDao;
import com.buz.mybayils.config.DBconnection;
import com.buz.mybayils.model.studentVO;

/*
 * Service 클래스에서 수행하던 DB 관련 코드를
 * Dao 클래스로 분리한다
 * 
 * 이게 Service 클래스는 Business logic수행하는 코드
 */
public class StdService {

		private String st_num=null;
		Scanner scan= null;
		
		SqlSession sqlSession =null;
		StudentDao stdDao = null;
		
		public StdService() {
			
			scan =new Scanner(System.in);
			sqlSession =DBconnection.getSqlSessionFactory().openSession(true);
			stdDao =(StudentDao) sqlSession.getMapper(StudentDao.class);
		}
		/*
		 * 키보드에서 학번을 입력 받고 해당하는 학생정보가 있는지 검사하는 매서드
		 */
		public boolean isNotStd() {
			System.out.print("학번 >>");
			st_num=scan.nextLine();
			
			//학번에 해당하는 학생이 있으면 vo는 값을 갖을 것이다.
			// 없으면  null값을 갖을 것이다.
			studentVO vo =stdDao.fineByNum(st_num);
			if(vo!=null) {
				System.out.println(vo);
				System.out.println("-------------");
				return false;
			}else {
				System.out.println("학생정보가 없습니다. 새로 입력하세요");
				return true;
			}
			
		}
		
		public boolean insertStd() {
			
			//insertStd 가 실행되는경우
			//학번을 입력했는데 학생정보를 못찾는 경우이다
			//학번을 입력하였을때 class scope 의 st_num에 저장하였으므로
		// INSERTsTD 메서드에서도 ST_NUM를 그대로 사용할수있다
			
			boolean bRet = true;
			System.out.print("이름(-E:종료)>>");
			String st_name=scan.nextLine();
			if(st_name.equals("-E")) return false;
			
			System.out.print("전화번호>>");
			String st_tel=scan.nextLine();
			
			System.out.print("학년>>");
			String st_grade=scan.nextLine();
			int int_grade=1;
			try {
				int_grade= Integer.valueOf(st_grade);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			studentVO vo= new studentVO(st_num,st_name,st_tel,int_grade);
			if (stdDao.insert(vo)>0) bRet=true;
			else bRet=false;
			
			return bRet;
		}
		
		public String getSt_num() {
			return this.st_num;
		}
		
}
