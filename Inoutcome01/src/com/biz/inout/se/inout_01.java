package com.biz.inout.se;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.mode.inoupVO;
import com.biz.mode.inoutDTO;

public class inout_01 {

	List<inoupVO> iolist;
	List<inoutDTO> ioViewList;
	
	FileReader fileReaer;
	BufferedReader buff;
	
	public inout_01(String fileName) throws FileNotFoundException {
		// vo에 담고
		//list에 추가
		iolist=new ArrayList<inoupVO>();
		ioViewList =new ArrayList<inoutDTO>();
		fileReaer=new FileReader(fileName);
		buff=new BufferedReader(fileReaer);
	}
	public void viewDele() throws IOException {
		String reader = "";
		while(true) {
			reader = buff.readLine();
			if(reader==null)break;
			String [] iolists=reader.split(":");
			inoupVO vo =new inoupVO();
			vo.setDate(iolists[0]);
			vo.setDivsion(iolists[1]);
			vo.setName(iolists[2]);
			vo.setQuantity(Integer.valueOf(iolists[3]));
			vo.setUnitPrice(Integer.valueOf(iolists[4]));
			
			iolist.add(vo);
		}
		
	}
		

	public void viewavg() {
		for(inoupVO vo : iolist) {
			inoutDTO dto =new inoutDTO();
			dto.getAmt();
			dto.getClass();
			dto.getDate();
			
			
			
		}

	}
	public void viewList() {
	

		
	}
	
	


}
