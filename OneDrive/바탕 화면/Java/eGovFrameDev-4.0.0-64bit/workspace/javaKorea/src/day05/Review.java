package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
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
				continue;	//아래 코드 실행하지 않고 반복문의 처음으로 돌아ㅏㅁ.
							//짝수번은 나오지 않음.
			}
			if(k>5) {
				break;
			}
			System.out.println(k+"번");
		}
		
		String array[]= {"a1","a2","a3","a4"};
		//배열+반복문
		for(int x=0; x<array.length; x++) {
			System.out.print(array[x]+" ");
		}
	}
}
