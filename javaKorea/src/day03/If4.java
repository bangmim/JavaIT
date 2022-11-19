package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		//예제
		//국어, 영어, 수학
		//각각 40점 이상
		//총합 150이상이면
		//'합격'
		//그외에는 '불합격'
		
		Scanner sc=new Scanner(System.in);
		int kore, engli,math, sum;
		
		
		System.out.println("국어 점수를 입력해주세요 >>>");
		kore=sc.nextInt();
		System.out.println("영어 점수를 입력해주세요 >>>");
		engli=sc.nextInt();
		System.out.println("수학 점수를 입력해주세요 >>>");
		math=sc.nextInt();
		
		sum=kore+engli+math;	//위치가 아래(점수를 다 받고)에 있어야 한다. 
		if((kore>=40 && engli>=40 && math>=40)&&(sum>=150)){
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격 입니다.");
		}
		//sc.close();		//안해도 된다.
		
		//다른 방법
		if(sum>=150) {
			if(kore>=40&&engli>40&&math>=40) {
				System.out.println("합격");
			}else {
				System.out.println("과락");
			} 
		}else {
			System.out.println("불합격");
			}

	}
}
