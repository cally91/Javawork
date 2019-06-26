package com.biz.jdbl_model;

public class StudentVO {

	private String st_no;		// char(3 byte)
	private 	String st_name;		// nvarchar2(20 char)
	private String st_add;		// nvarchar2(50 char)
	private int st_gtade;		// number(1,0)
	private int st_heignt;		// number(3,0)
	private int st_weight;		// number(5,0)
	private String st_nick;		// nvarchar2(20 char)
	private String st_nick_nem;	// nvarchar2(50 char)
	private String st_dept_no;	// char(3 byte)
	public String getSt_no() {
		return st_no;
	}
	public void setSt_no(String st_no) {
		this.st_no = st_no;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_add() {
		return st_add;
	}
	public void setSt_add(String st_add) {
		this.st_add = st_add;
	}
	public int getSt_gtade() {
		return st_gtade;
	}
	public void setSt_gtade(int st_gtade) {
		this.st_gtade = st_gtade;
	}
	public int getSt_heignt() {
		return st_heignt;
	}
	public void setSt_heignt(int st_heignt) {
		this.st_heignt = st_heignt;
	}
	public int getSt_weight() {
		return st_weight;
	}
	public void setSt_weight(int st_weight) {
		this.st_weight = st_weight;
	}
	public String getSt_nick() {
		return st_nick;
	}
	public void setSt_nick(String st_nick) {
		this.st_nick = st_nick;
	}
	public String getSt_nick_nem() {
		return st_nick_nem;
	}
	public void setSt_nick_nem(String st_nick_nem) {
		this.st_nick_nem = st_nick_nem;
	}
	public String getSt_dept_no() {
		return st_dept_no;
	}
	public void setSt_dept_no(String st_dept_no) {
		this.st_dept_no = st_dept_no;
	}
	@Override
	public String toString() {
		return "StudentVO [st_no=" + st_no + ", st_name=" + st_name + ", st_add=" + st_add + ", st_gtade=" + st_gtade
				+ ", st_heignt=" + st_heignt + ", st_weight=" + st_weight + ", st_nick=" + st_nick + ", st_nick_nem="
				+ st_nick_nem + ", st_dept_no=" + st_dept_no + "]";
	}
	
}
