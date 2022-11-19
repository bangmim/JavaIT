package day03;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		//예제
		
		String job=""; 
		int salary=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("직급을 입력하세요 >>>");
		job=scanner.next();
		switch(job) {
		case"사원":
			salary=2800;
			break;
		case"대리":
			salary=3600;
			break;
		case"과장":
			salary=5000;
			break;
		case"부장":
			salary=7500;
			break;
			default:
				salary=0;
		}
		System.out.println("연봉은 "+salary+" 입니다");
	}
}
