package day02;

public class If1 {
	public static void main(String[] args) {
		//상황에 따라 프로그램 동작을 다르게 하고 싶을 때 사용하는 문법
		
		//성인인지 미성년자인지 판별하는 프로그램
		int age=15;
		if(age>20) {
			System.out.println("성인입니다");
		}else {
			System.out.println("미성년자입니다");
		}
	
		/*
		if(조건1){
		 	조건1이 맞으면 실행할 문장1;
		 	조건1이 맞으면 실행할 문장2;
		 	} else if(조건2){
		 	조건1이 틀리고 조건2가 맞을 때 실행할 문장1;
		 	조건1이 틀리고 조건2가 맞을 때 실행할 문장2;
		 	} else if(조건3){
		 		...
		 	} else{
		 	모든 조건이 다 틀릴 때 실행할 문장;
		 	}
		 */
		
		//퀴즈
		//1.
		int 점수=90;
		//점수가 90이상이면 우등생, 그 외에는 일반학생
		if(점수>=90) {
			System.out.println("우등생");
		}else {
			System.out.println("일반학생");
		}

		
	}
}
