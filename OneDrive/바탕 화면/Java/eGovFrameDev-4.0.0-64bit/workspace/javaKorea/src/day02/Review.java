package day02;

public class Review {
	public static void main(String[] args) {
		//프로그래밍 언어(자바) 
		
		//출력 syso > Ctrl+space 자동완성
		//실행(디버깅 없이 시작) Ctrl+F11 
		System.out.println("Hello World");
		
		//변수 : 저장공간
		String word="Java";		//글자 저장할 수 있는 공간
		
		System.out.println("Hello "+word);
		System.out.println("===========");
		System.out.println("Hello "+word);
		System.out.println("=========");
		System.out.println("Hello "+word);
		System.out.println("Hello "+word);
		System.out.println("Hello "+word);
		System.out.println("==========");
		
		int num=0;				//정수 저장할 수 있는 공간
		double dnum=0.0;		//실수 저장할 수 있는 공간
		//int num2="hello";		//자료형이 값과 맞지 않으면 오류처리 (개발잘의 실수 방지)
		
		//자료형 변환
		System.out.println((double)num);
		
		//변수(공간)을 처음 만들 땐 변수이름 앞에 자료형을 적어주고
		//이미 만들어진 변수(공간)을 사용할 땐 자료형 없이 적어준다.
		
		num=5;			//다른 값 대입
		System.out.println(num);
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽의 공간에 담는다)
		num=7;			//왼쪽은 '공간'역할, 오른쪽은 '값' 역할
		String str="Hi";
		
		word=str;					//word:공간, str:값
		System.out.println(str);	//word:"Java" --> "Hi"
	
		// +,-,*,/
		
		//변수명 만들 때 주의사항
		//1. 맨 앞에는 숫자 X, 특수문자 X (한글, 영어)
		//2. 띄어쓰기X
		//3. 특수문자X(예외도 있음)
	}
}
