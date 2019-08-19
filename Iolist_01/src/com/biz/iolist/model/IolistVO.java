package com.biz.iolist.model;

public class IolistVO {
	private long io_sep;	//NUMBER	PRIMARY KEY	,
	private String io_date;	//	VARCHAR2(10)		NOT NULL,
	private String io_pcode;//	Nvarchar2(5)		NOT NULL,
	private String io_ccode;	//	Nvarchar2(5)		NOT NULL,
	private String io_inout;	//	Nvarchar2(1)		NOT NULL,
	private int io_pty	;//NUMBER		,
	private int io_price;	//NUMBER	,	
	private int io_total;	//NUMBER
	
	public IolistVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IolistVO(long io_sep, String io_date, String io_pcode, String io_ccode, String io_inout, int io_pty,
			int io_price, int io_total) {
		super();
		this.io_sep = io_sep;
		this.io_date = io_date;
		this.io_pcode = io_pcode;
		this.io_ccode = io_ccode;
		this.io_inout = io_inout;
		this.io_pty = io_pty;
		this.io_price = io_price;
		this.io_total = io_total;
	}
	public long getIo_sep() {
		return io_sep;
	}
	public void setIo_sep(long io_sep) {
		this.io_sep = io_sep;
	}
	public String getIo_date() {
		return io_date;
	}
	public void setIo_date(String io_date) {
		this.io_date = io_date;
	}
	public String getIo_pcode() {
		return io_pcode;
	}
	public void setIo_pcode(String io_pcode) {
		this.io_pcode = io_pcode;
	}
	public String getIo_ccode() {
		return io_ccode;
	}
	public void setIo_ccode(String io_ccode) {
		this.io_ccode = io_ccode;
	}
	public String getIo_inout() {
		return io_inout;
	}
	public void setIo_inout(String io_inout) {
		this.io_inout = io_inout;
	}
	public int getIo_pty() {
		return io_pty;
	}
	public void setIo_pty(int io_pty) {
		this.io_pty = io_pty;
	}
	public int getIo_price() {
		return io_price;
	}
	public void setIo_price(int io_price) {
		this.io_price = io_price;
	}
	public int getIo_total() {
		return io_total;
	}
	public void setIo_total(int io_total) {
		this.io_total = io_total;
	}
	@Override
	public String toString() {
		return "IolistVO [io_sep=" + io_sep + ", io_date=" + io_date + ", io_pcode=" + io_pcode + ", io_ccode="
				+ io_ccode + ", io_inout=" + io_inout + ", io_pty=" + io_pty + ", io_price=" + io_price + ", io_total="
				+ io_total + "]";
	}
	
}
