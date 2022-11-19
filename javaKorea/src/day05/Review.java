package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//1.입력
		Scanner sc = new Scanner(System.in);
		
		//2.출력
		System.out.println("Hello");
		
		//3.변수 : 저장공간
		String str;			//문자열 변수
		int num;			//정수 변수
		double dNum;		//실수 변수
		
		str="Java";
		num=314;
		dNum=3.14;
		
		//4.배열 
		String array []= {"a1","a2","a3","a4"};
		array[0]="b1";
		array[1]="b2";
		array[2]="b3";
		array[3]="b4";
		
		//5.조건문 if, switch
		//if~else if~else
		//switch~case~break
		if(num<100) {
			System.out.println("100미만의 num :"+num );
		}else if (num<200) {
			System.out.println("100~199 사이의 num : "+num);
		}else {
			System.out.println("200 이상의 num : "+num);
		}
		
		switch(num/100) {
		case 0:
			System.out.println("100미만의 num :"+num );
			break;
		case 1:
			System.out.println("100~199 사이의 num : "+num);
			break;
		default:
			System.out.println("200 이상의 num : "+num);
		}
		
		//6.반복문 while, for
		int i=0;
		while (i<5) {
			System.out.println("현재횟수:"+(i+1));
			i++;
		}
		for (int j=0;j<5;j++) {
			System.out.println("현재횟수:"+(j+1));
		}
		
		for(int k=0;k<10;k++) {
			if(k%2==0) {
				//짝수
				continue;	//아래 코드 실행하지 않고 반복문의 처음으로 돌아옴.
							//짝수번은 나오지 않음.
			}
			if(k>5) {
				break;
			}
			System.out.println(k+"번");
		}
		
		String array1[]= {"a1","a2","a3","a4"};
		//배열+반복문
		for(int x=0; x<array1.length; x++) {
			System.out.print(array1[x]+" ");
		}
	}
}
