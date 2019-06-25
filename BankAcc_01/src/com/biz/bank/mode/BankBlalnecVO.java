package com.biz.bank.mode;

public class BankBlalnecVO {
	
	private String acc;
	private int balance;
	private String data;
	
	
	
	public BankBlalnecVO(String acc, int balance, String data) {
		super();
		this.acc = acc;
		this.balance = balance;
		this.data = data;
	}
	public BankBlalnecVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "BankBlalnecVO [acc=" + acc + ", balance=" + balance + ", data=" + data + "]";
	}

}
