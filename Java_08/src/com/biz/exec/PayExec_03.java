package com.biz.exec;

import java.io.IOException;

import com.biz.exec.servtice.PayService;

public class PayExec_03 {

	public static void main(String[] args) {
		String payReport = "src/com/biz/exec/금여명세서.txt";
		PayService ps=new PayService();
		ps.payCalce();
		try {
			ps.pintReport(payReport);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
