package com.biz.iolist.exec;

import com.biz.iolist.Service.IoilstService;

public class Ioex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoilstService ioService =new IoilstService();
		
		while(true) {
			ioService.viewIolist();
			if (ioService.insertIO()) System.out.println("데이터 추가 성공");
			else System.out.println("데이터 추가 실패");
		}

	}

}
