package day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		//퀴즈3
		java.util.Scanner sc=new Scanner(System.in);
		String answer=null;
		while(true) {
			System.out.println("대한민국의 수도는?");
			answer=sc.next();
			if(answer.equals("서울")) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("오답입니다. 다시 입력해주세요");
				continue;
			}
		}
	}
}
