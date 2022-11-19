package day03;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		//윤년 구하는 프로그램 만들기
		//년도를 입력받고 윤년인지 아닌지 판별해주는 프로그램 만들어보기
		
		//윤년:해당 년도가 4로 나누어 떨어지고 100으로는 나누어 떨어지지 않으면 윤년 (2월 29일)
		//혹은 400으로 나누어 떨어지면 무조건 윤년
		
		//예) 2012 : 윤년 (4의 배수면서 100의 배수가 아님)
		//2200:윤년 아님(100의배수)
		//2013:윤년 아님(4의 배수가 아님)
		//2000:윤년(400의 배수)
		
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("년도를 입력하세요 >>>");
		year=sc.nextInt();
		
		if((year%4==0)&&!(year%100==0)) {
			System.out.println("윤년입니다");
		}else if(year%400==0) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
		
		//강사님 답안
		//AND(&&)가 먼저 수행될 수 있도록 괄호로 감싸준다.
		if(((year%4==0)&&!(year%100==0))||(year%400==0)) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년 아님");
		}
		
	}
}
