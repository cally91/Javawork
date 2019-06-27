package com.biz.jdbc.model;

public class ScoroVO {

	//
	private long  sc_no;//	char(3 byte)
	private String sc_day;	//varchar2(50 byte)
	private String	sc_st_no;	//varchar2(50 byte)
	private String sc_subjet; //	nvarchar2(50 char)
	private int	sc_score; //	number
	public long getSc_no() {
		return sc_no;
	}
	public void setSc_no(long sc_no) {
		this.sc_no = sc_no;
	}
	public String getSc_day() {
		return sc_day;
	}
	public void setSc_day(String sc_day) {
		this.sc_day = sc_day;
	}
	public String getSc_st_no() {
		return sc_st_no;
	}
	public void setSc_st_no(String sc_st_no) {
		this.sc_st_no = sc_st_no;
	}
	public String getSc_subjet() {
		return sc_subjet;
	}
	public void setSc_subjet(String sc_subjet) {
		this.sc_subjet = sc_subjet;
	}
	public int getSc_score() {
		return sc_score;
	}
	public void setSc_score(int sc_score) {
		this.sc_score = sc_score;
	}
	@Override
	public String toString() {
		return "ScoroVO [sc_no=" + sc_no + ", sc_day=" + sc_day + ", sc_st_no=" + sc_st_no + ", sc_subjet=" + sc_subjet
				+ ", sc_score=" + sc_score + "]";
	}
	
	
}
