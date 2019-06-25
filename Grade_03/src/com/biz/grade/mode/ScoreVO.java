package com.biz.grade.mode;

public class ScoreVO {

	/*
	 * vo를 원본 성적표.tst 파일형식으로 만들지 않고
	 * view 용으로 생성
	 * 보통 dto라는 점미사를 붙여주는것이좋다.
	 */
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int art;
	private int sci;
	private int hjs;
	
	private int total;
	private 	int ave;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getArt() {
		return art;
	}
	public void setArt(int art) {
		this.art = art;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHjs() {
		return hjs;
	}
	public void setHjs(int hjs) {
		this.hjs = hjs;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAve() {
		return ave;
	}
	public void setAve(int ave) {
		this.ave = ave;
	}
	@Override
	public String toString() {
		return "ScoreVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", art=" + art + ", sci="
				+ sci + ", hjs=" + hjs + ", total=" + total + ", ave=" + ave + "]";
	}	
}
