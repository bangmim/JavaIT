package day03;

import day01.Syso1;

public class Review {
	public static void main(String[] args) {
		//변수 초기화(선언과 동시에 대입을 한번에)
		String 변수="초기화:선언과 동시에 대입";
		
		//변수 사용
		System.out.println(변수);
		
		//대입 시 유의사항
		String 변수1="짱미박>-<";
		변수=변수1;		// [변수 : 공간, 변수1: 값]으로 사용된다.
		System.out.println(변수);
		
		//연산자
		//== 같다(true/false)
		System.out.println(변수==변수1);		//true
		
		//!= 다르다
		//>, <, >=, <=
		//+, -, *, /(몫), %(나머지)
		//+=, -=, *=, /=, %=
		//++, --
		//&&, ||, !
	
		//누적/증감 연산
		int num1=0;
		int num2=0;
		
		num1=num1+2;				//num1+=2;	//2
		System.out.println(num1);

		num2+=2;
		System.out.println(num2);
		
		//만약, 누적/증가 값이 1인 경우 한번 더 생략 가능하다.
		num1+=1;	//num1=num1+1
		num2++;		//num2 += 1;	//num2 +1
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1-1;	//num1 -= 1
		num2--;			//num2 -= 1; //num2 -1
		
		System.out.println(num1);
		System.out.println(num2);
		
		//자료형 변환(정수 <->실수)
		int 정수1=3;
		double 실수1=3.14;
		
		System.out.println(정수1);	//3
		System.out.println(실수1);	//3.14
		
		System.out.println("===형변환===");
		System.out.println((double)정수1);	//3.0
		System.out.println((int)실수1);		//3
		
		/*
		 정수 / 정수 == 정수
		 실수 / 실수 == 실수
		 실수 / 정수 == 실수
		 (if 실수 / 정수 == 정수 하고 싶다면 --> (int)실수 / 정수 또는 실수 / 정수 == (int)실수
		 */
		
	}
	
}
