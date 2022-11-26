package day09;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		MyRandom2 mr2 = new MyRandom2();
		mr2.go();
	}
}

class MyRandom2{
	public void go() {
		//랜덤을 돌리는 방법 2가지
		//2. Random클래스
		Random rand = new Random();
		
		double num1 = rand.nextDouble();	//0.0~0.999999 
		System.out.println(num1);		
		
		int num2=rand.nextInt(100);			//0~99
		System.out.println(num2);
		
		//1~100
		int num3=rand.nextInt(100)+1;		//(0~99) + 1
		System.out.println(num3);
		
		//50~100
		int num4=rand.nextInt(50)+50; 		//(0~50) + 50
		System.out.println(num4);
		
	}
}