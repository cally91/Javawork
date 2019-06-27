package com.biz.exec;

public class javaService {

	private int sum;
	
	public javaService(){
		sum=0;	
	}
	
	// 리턴이 필요없는 메서드
	public void add() {
	
	}
	// 정수 값(int 형)갑을 리턴해야하는 메서드
	public int add(int num) {
		return 0;
		
	}
	// 정수값(int 형)을 리턴해야하는 메서드
	//매개변수로 받은 2개의 값을 덧셈해서
	//일단sum변수에 저장을하고
	//sum 변수를 리턴 했다.
	public  int add(int num1 ,int num2 ) {
		sum= num1+num2;
		//return이 하는일
		// sum 변수가 unt 형으로 선언되어 있기 때문에
		//sum에 담아있는 num1+num2의 계산값을
		// 리턴
		return sum;
	}
}

