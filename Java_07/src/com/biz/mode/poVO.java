package com.biz.mode;

public class poVO {

	private String mouny;
	private int won;
	private int ga;
	
	public poVO(String mouny, int won, int ga) {
		super();
		this.mouny = mouny;
		this.won = won;
		this.ga = ga;
	}
	
	public poVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMouny() {
		return mouny;
	}
	public void setMouny(String mouny) {
		this.mouny = mouny;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
	@Override
	public String toString() {
		return "poVO [mouny=" + mouny + ", won=" + won + ", ga=" + ga + "]";
	}

	
}
