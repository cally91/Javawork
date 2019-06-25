package com.biz.DAO;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Scanner;

import com.biz.DTO.memDTO;
import com.biz.GP.gamePiay;

public class memDAO {

		public ArrayList<memDTO> arrList;
		private memDTO mdto;
		public String playID[];
		public boolean newID[];
		
		memDAO(){
			arrList =new ArrayList<memDTO>();
			mdto = new memDTO();
			playID = new String[1];
			newID = new boolean[1];
		}
		public  boolean loginMenu() {
			Scanner sc =new Scanner(System.in);
			boolean loop = true;
			while (loop) {
				System.out.println("기존 ID로그인 (1), 신규ID 생성 (2),ID 리스트 (3)");
				System.out.print("입력 :");
				int inputNum =sc.nextInt();
				
				switch (inputNum) {
				case 1 :
					loop = login(playID);
					break;
				case 2 :
					loop = insert(select(newID));
				case 3:
					memberPrint();
					break;
				
				default:
					System.out.println("잘못 입력하였씁니다");
				}	
			}
		gamePiay gPlay =new gamePiay();
		memDTO loginID =gPlay.Io
			
		}
		private boolean login(String[] playID) {
			// TODO Auto-generated method stub
			return false;
		}
		private void memberPrint() {
			// TODO Auto-generated method stub
			
		}
		private boolean insert(Object select) {
			// TODO Auto-generated method stub
			return false;
		}
		private Object select(boolean[] newID) {
			// TODO Auto-generated method stub
			return null;
		}
	
	
}
