package day16;

import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		// 출력 syso
		System.out.println("Hello world\n");
		// 입력 Scanner
		Scanner sc = new Scanner(System.in);
		
		// 변수와 자료형
		// 변수 : 데이터를 저장할 수 있는 공간 (저장공간), 수정 또는 반복 사용
		// 자료형 : int, double, String, boolean, ... 개발자의 실수 방지 & 개발자의 의도를 명확화
		String str;		// 변수 선언
		boolean bool;
		int num =0;		// 변수 초기화
		str="";			// 값 대입
		
		num = sc.nextInt();		// 입력받은 정수 대임
		str = sc.next();		// 입력받은 문자열 대임
		str = sc.nextLine();	// 띄어쓰기도 가능
		num = Integer.parseInt(sc.nextLine());	// 자료형 변환
		System.out.println((double)num);		// 자료형 변환
		
		// 연산자 (연산 기호)
		num = num + 23;
		num = num - 23;
		num = num / 1;
		num = num * 2;
		num = num % 2;		// 나머지 구하기
		
		num = 3;		// 대입 연산자 
		bool = (num == 3);
		bool = (num != 3);
		bool = num < 3;
		bool = num > 3;
		bool = num <= 3;
		bool = num >= 3;
		
		bool = (num == 3) && (num < 4);		// && (AND) >> 둘 다 true여야 true , 둘 중 하나라도 false면 false
		bool = (num == 3) || (num < 4);		// || (OR)  >> 둘 중 하나라도 true면 true, 둘 다 false면 false
		bool = !(num ==3);					// ! (NOT)  >> 반대로 바꿈 (true면 false로 출력)
		
		// 줄임말
		num ++;			// 1 더하기는 나중에
		++num;			// 1 더하기 먼저
		num--;
		--num;
		
		num += 2;		// num = num + 2;
		num -= 2;
		num *= 3;
		num /= 3;
		num %= 2;
		
		
				
		
	}
}
