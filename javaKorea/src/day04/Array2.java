package day04;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		String menu[]= {"에스프레소","아메리카노"};	//2칸
		int price[]= {1500,2500};	//개수를 동일하게 맞춰주기.	//2칸
		
		for(int i=0; i<menu.length; i++) {	//i<menu.length : 인덱스는 0부터 시작하기 때문.
			System.out.println(menu[i]+":"+price[i]+"원");
		}
		
		//배열 초기화(선언과 동시에 값 대입)
		int num[]= {0,10,20,30,40};
		
		//배열 선언 (공간만 먼저 생성)
		int no[]=new int[5];
		
		//대입
		num[0]=5;
		no[0]=5;
		
		int number[];
		//numbers= new int[100];
		
		//Array 출력하기 : 1. Arrays 메서드 이용. Arrays.toString(array이름)
		System.out.println(Arrays.toString(no));
		System.out.println(Arrays.toString(num));
	}
}
