package com.biz.jdbc.model;

public class ScoreVO {

	private long SC_SEQ; // CHAR(3 BYTE)
	private String 	SC_DATE; // VARCHAR2(50 BYTE)
	private String SC_ST_NO; // VARCHAR2(50 BYTE)
	private String SC_SUBJET; // NVARCHAR2(50 CHAR)
	private int SC_SCORE; // NUMBERprivate
	
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreVO(long sC_SEQ, String sC_DATE, String sC_ST_NO, String sC_SUBJET, int sC_SCORE) {
		super();
		SC_SEQ = sC_SEQ;
		SC_DATE = sC_DATE;
		SC_ST_NO = sC_ST_NO;
		SC_SUBJET = sC_SUBJET;
		SC_SCORE = sC_SCORE;
	}
	public long getSC_SEQ() {
		return SC_SEQ;
	}
	public void setSC_SEQ(long sC_SEQ) {
		SC_SEQ = sC_SEQ;
	}
	public String getSC_DATE() {
		return SC_DATE;
	}
	public void setSC_DATE(String sC_DATE) {
		SC_DATE = sC_DATE;
	}
	public String getSC_ST_NO() {
		return SC_ST_NO;
	}
	public void setSC_ST_NO(String sC_ST_NO) {
		SC_ST_NO = sC_ST_NO;
	}
	public String getSC_SUBJET() {
		return SC_SUBJET;
	}
	public void setSC_SUBJET(String sC_SUBJET) {
		SC_SUBJET = sC_SUBJET;
	}
	public int getSC_SCORE() {
		return SC_SCORE;
	}
	public void setSC_SCORE(int sC_SCORE) {
		SC_SCORE = sC_SCORE;
	}
	@Override
	public String toString() {
		return "ScoreVO [SC_SEQ=" + SC_SEQ + ", SC_DATE=" + SC_DATE + ", SC_ST_NO=" + SC_ST_NO + ", SC_SUBJET="
				+ SC_SUBJET + ", SC_SCORE=" + SC_SCORE + "]";
	}
}
