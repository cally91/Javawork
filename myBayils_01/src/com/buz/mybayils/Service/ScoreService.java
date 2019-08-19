package com.buz.mybayils.Service;

import java.awt.Container;
import java.rmi.ServerRuntimeException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import com.buz.mybatis.dao.ScoreDao;
import com.buz.mybayils.config.DBconnection;
import com.buz.mybayils.model.ScoreVO;
import com.buz.mybayils.util.Contract;

public class ScoreService {

	private String st_num=null;
	Scanner scan= null;
	
	SqlSession sqlSession =null;
	ScoreDao scDao = null;
	
	public ScoreService() {
	
	scan=new Scanner(System.in);
	sqlSession=DBconnection.getSqlSessionFactory().openSession(true);
	scDao=(ScoreDao) sqlSession.getMapper(ScoreDao.class);
	
	}
	public void setSt_num(String st_num) {
		this.st_num=st_num;
	}
	
	public void viewScore(String st_num) {
		if(st_num==null){
			System.out.println("학번을 입력해야합니다.");
			return;
		}
		System.out.println(st_num+"학생의 성적리스트");
		System.out.println("---------------------------");
		System.out.println("과목\t\t점수");
		System.out.println("---------------------------");
		List<ScoreVO> scList =scDao.findByNum(st_num);
		for (ScoreVO vo : scList) {
			System.out.printf("%s\t\t%3d\n",vo.getSc_subject(),vo.getSc_score());
		}
		System.out.println("---------------------------");
	}
	public void insertScore(String st_num) {
		Set<String> subKey =Contract.SUBList.keySet();
		
		while(true) {
			System.out.println("--------------------------");
			int index=0;
			for(String suKey : subKey) {
				System.out.print(suKey+":"+Contract.SUBList.get(suKey));
				if(++index %5 ==0) System.out.println();
				else System.out.print("");
			}
			System.out.println("\n-----------------------");
			
		System.out.print("과목번호 (-9 종료)>>");
		String strSudject = scan.nextLine();
		if(strSudject.equals("-9"))break;
		System.out.print("과목점수 (-9 종료)>>");
		String strScore =scan.nextLine();
		try {
			int intScore =Integer.valueOf(strScore);
			ScoreVO vo =new ScoreVO(0,st_num,strSudject,intScore);
			scDao.insert(vo);
		}catch(NumberFormatException ne) {
			System.out.println("점수는 숫자만 입력해야합니다.");
		}catch(PersistenceException pe) {
		 if(pe.getMessage().contains("U_ST_NUM_SUBJECT")){
			 System.out.println("이미 입력된 과목입니다");
		 }else {
			 pe.printStackTrace();
		 }
		}catch(Exception e) {
			e.printStackTrace();
		}
//		} catch (Exception e) {
//			System.out.println("점수는 숫자로만 입력하세요");
//			continue;
//		}
		}
		
		
	}
}
