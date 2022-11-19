package day03;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		//출력 (결과를 사용자에게 보여줌)
		System.out.println("출력 syso");
		
		//입력(사용자가 값을 제공)
		Scanner sc = new Scanner(System.in);
		
		//입력을 받으려면 받을 변수(공간)가 있어야 한다.
		int 숫자1=0;
		String 글자1=null;
		double 숫자2=0.0;
		
		//입력받기
		System.out.println("정수를 입력하세요 : ");
		숫자1=sc.nextInt();
		System.out.println("글자를 입력하세요 : ");
		글자1=sc.next();
		System.out.println("실수를 입력하세요 : ");
		숫자2=sc.nextDouble();
		
		System.out.println("입력하신 숫자는 : "+숫자1);
		System.out.println("입력하신 글자는 : "+글자1);
		System.out.println("입력하신 실수는 : "+숫자2);
		
		if(숫자1==10) {
			//int
			System.out.println("입력하신 숫자는 10 입니다");
		}
		if(숫자2==3.14) {
			//double
			System.out.println("입력하신 실수는 3.14입니다");
		}
		if(글자1.equals("비교대상")) {
			//string
			System.out.println("입려하신 글자는 비교대상 입니다");
		}
	}
}
