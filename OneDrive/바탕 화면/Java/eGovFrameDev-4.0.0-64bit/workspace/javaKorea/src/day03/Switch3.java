package day03;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		//년도와 월을 입력하면
		//해당 월이 몇일까지 있는지 알려주는 프로그램
		//1,3,5,7,8,10,12 ==> 31일
		//4,6,9,11 ==> 30일
		//2 ==> 28 or 29(윤년일때만)
		
		int year=0;
		int month=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("년도를 입력해주세요 >>>");
		year=sc.nextInt();
		System.out.println("월을 입력해주세요 >>>");
		month=sc.nextInt();
		
//		if(((year%4==0)&&!(year%100==0))||(year%400==0)){
//			System.out.println(year+"년은 윤년이고,");
//			switch(month) {
//			case 1:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 3:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 5:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 7:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 8:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 10:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 12:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 4:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 6:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 9:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 11:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 2:
//				System.out.println(month+"월은 29일까지 입니다");
//				break;
//			}
//		}else {
//			System.out.println(year+"년은 윤년이 아니고,");
//			switch(month) {
//			case 1:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 3:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 5:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 7:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 8:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 10:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 12:
//				System.out.println(month+"월은 31일까지 입니다");
//				break;
//			case 4:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 6:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 9:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 11:
//				System.out.println(month+"월은 30일까지 입니다");
//				break;
//			case 2:
//				System.out.println(month+"월은 28일까지 입니다");
//				break;
//			}
//		}
//	}
		
		//강사님 답안
		//같은 값이면 break없이 쓸 수 있다.
		int day=0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
		case 2:
			if(((year%4==0)&&!(year%100==0))||(year%400==0)) {
				day=29;
			}else {
				day=28;
			}
			break;
		default:
			System.out.println("해당 월은 없습니다");
		}
	
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다.");
			
	}
		
}

