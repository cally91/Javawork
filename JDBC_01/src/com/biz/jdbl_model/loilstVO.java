package com.biz.jdbl_model;

public class loilstVO {

	private int	IO_SEP;	//NUMBER
	private String	IO_DATE;	//VARCHAR2(10 BYTE)
	private String	IO_INOUT;	//NVARCHAR2(10 CHAR)
	private int	IO_ANT;	//NUMBER
	private int	IO_PRTCE;	//NUMBER
	private int	IO_TOTAL;	//NUMBER
	private String	IO_PCOED;	//VARCHAR2(7 BYTE)
	private String	IO_CCODE;	//VARCHAR2(5 BYTE)
	public int getIO_SEP() {
		return IO_SEP;
	}
	public void setIO_SEP(int iO_SEP) {
		IO_SEP = iO_SEP;
	}
	public String getIO_DATE() {
		return IO_DATE;
	}
	public void setIO_DATE(String iO_DATE) {
		IO_DATE = iO_DATE;
	}
	public String getIO_INOUT() {
		return IO_INOUT;
	}
	public void setIO_INOUT(String iO_INOUT) {
		IO_INOUT = iO_INOUT;
	}
	public int getIO_ANT() {
		return IO_ANT;
	}
	public void setIO_ANT(int iO_ANT) {
		IO_ANT = iO_ANT;
	}
	public int getIO_PRTCE() {
		return IO_PRTCE;
	}
	public void setIO_PRTCE(int iO_PRTCE) {
		IO_PRTCE = iO_PRTCE;
	}
	public int getIO_TOTAL() {
		return IO_TOTAL;
	}
	public void setIO_TOTAL(int iO_TOTAL) {
		IO_TOTAL = iO_TOTAL;
	}
	public String getIO_PCOED() {
		return IO_PCOED;
	}
	public void setIO_PCOED(String iO_PCOED) {
		IO_PCOED = iO_PCOED;
	}
	public String getIO_CCODE() {
		return IO_CCODE;
	}
	public void setIO_CCODE(String iO_CCODE) {
		IO_CCODE = iO_CCODE;
	}
	@Override
	public String toString() {
		return "loilstVO [IO_SEP=" + IO_SEP + ", IO_DATE=" + IO_DATE + ", IO_INOUT=" + IO_INOUT + ", IO_ANT=" + IO_ANT
				+ ", IO_PRTCE=" + IO_PRTCE + ", IO_TOTAL=" + IO_TOTAL + ", IO_PCOED=" + IO_PCOED + ", IO_CCODE="
				+ IO_CCODE + "]";
	}
	
	
}
