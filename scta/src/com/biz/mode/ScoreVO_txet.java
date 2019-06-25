package com.biz.mode;

public class ScoreVO_txet {

	private String country1;
	private String country2;
	private int score;

	public ScoreVO_txet(String country1, String country2, int score) {
		super();
		this.country1 = country1;
		this.country2 = country2;
		this.score = score;
	}

	// public String ();
	private void game() {
	}

	public String getCountry1() {
		return country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
