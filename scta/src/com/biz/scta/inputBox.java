package com.biz.scta;

import javax.swing.JOptionPane;

public class inputBox {

	public static void main(String[] args) {

		
		int num = Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
		int num2 =num+3*(3+2)-3;
		JOptionPane.showMessageDialog(null,num+"+3X(3+2)-3의 답은\t"+num2+" 입니다");
		
		if (num2 >= 20 && num2 <=40) {
			JOptionPane.showMessageDialog(null, "ㅇㅇ");
			
		} else if (num2 <=20 && num2>=40) {
			JOptionPane.showMessageDialog(null, "ㄴㄴ");
		}

	}

}
