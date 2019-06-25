package com.biz.bank.servire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.mode.BankBalanceVO;

public interface BankService {
	public void readBalance() throws IOException ;
	public void writeBalance() throws IOException ;
	public BankBalanceVO pickAcc(String accNum) ;
	public void inputMoney(String acc, int money); 
	public void ontputMoney(String acc, int money); 
	public int selectMenu() ;
}
