package day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		//퀴즈2
		//입력받은 나라의 수도를 알려주는 프로그램 개발하기
		//0을 입력하면 종료
		String nations[]= {"한국","대한민국","미국","중국","일본"};
		String cities[]= {"서울","서울","워싱턴","베이징","도쿄"};
		
		//[예시]
		//어느 나라의 수도가 궁금하신가요?
		//미국의 수도는 워싱턴 입니다.
		
		Scanner sc=new Scanner(System.in);
		String answer=null;
		String in;		//입력받은 값을 위한 변수 만들기
		int idx;		//입력받은 문자열의 값과 동일한 문자열의 위치를 백업해 둘 변수
		
			/*
			System.out.println("어느 나라의 수도가 궁금하신가요?");
			answer=sc.next();
			
			for(int i=0; i<nations.length; i++) {
				if(answer.equals(nations[i])) {
					System.out.println(nations[i]+"의 수도는"+cities[i]+"입니다");
				}if(!answer.equals(nations[i])) {
					continue;
				}if(answer.equals("0")) {
					break;
				}
				else {
					System.out.println("없는 나라 입니다.");
				}
			}
			*/
			
			//강사님 답안
			while(true) {
				System.out.println("어느 나라 수도가 궁금하신가요? (0을 입력하면 종료)");
				in=sc.next(); 	//입력받은 값 저장
				idx=-1;		//인덱스 기본값:0 > -1인경우 : 잘못 입력한 경우
				
				//인덱스 만들기
				for(int i=0; i<nations.length; i++) {
					if (in.equals(nations[i])) {
						idx=i;	//같다면 해당 위치 백업
					}
				}
				
				if(in.equals("0")) {		//입력값 = 0 인경우
					System.out.println("프로그램 종료");
					break;
				}
				if(idx!=-1) {
					System.out.println(nations[idx]+"의 수도는 "+cities[idx]+"입니다");
	
				}else {
					System.out.println("해당 국가가 없습니다.");
				}
			
			}
	}
}
