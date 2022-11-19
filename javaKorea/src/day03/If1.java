package day03;

public class If1 {
	public static void main(String[] args) {
		//조건문
		//if, switch
		//외부 조건에 따라서 프로그램 동작을 다르게 하고 싶을 때 사용한다.
		
		//if(){}
		//() 안 내용이 맞으면 {} 실행
		//() 안 내용이 틀리면 {} 무시
		
		//예제
//		int age=28;
//		if(age>=20) {
//			System.out.println("성인입니당");
//		}else {
//			//else: if 조건이 맞지 않을 때 실행할 코드
//			System.out.println("성인 아니에용");
//		}
		
		//예제1
		int age=-2;
		if(age>=20) {
			System.out.println("성인 입니다");
		}else if(age>=14) {
			System.out.println("청소년 입니다");
		}else if(age>=0) {
			System.out.println("어린이 입니다");
		}else {
			System.out.println("?");
		}
	}
}
