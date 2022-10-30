package day01;

public class Var3 {
	public static void main(String[] args) {
		
		//자료형 (type)
		
		//숫자
		int 뺄셈=13-4;
		
		//문자
		String 주소="13-4";
		String 휴대폰번호="010-1212-3432";
		
		//실수
		double 파이=3.14;
		
		System.out.println(뺄셈);
		System.out.println(주소);
		System.out.println(휴대폰번호);
		System.out.println(파이);
		
		//= : 같다 의미 X
		//변수(공간)를 처음 만들 때는 자료형을 적어야한다.
		
		//이미 만들어진 변수에 다른 값을 넣거나 사용할 때에는 
		//자료형 없이 적어야한다.
		휴대폰번호="010-8272-3939";
		System.out.println(휴대폰번호);
		
		//선언 : 공간만 만듦
		String var1;
		//초기화 : 선언과 동시에 값도 할당한다.
		String var2="hi";
		//대입 : 이미 있는 공간에 값을 할당한다.
		var1="hello";
		
		String name="ooo";
		String birth="1950년 5월 5일";
		//int 하나로 묶어서 변수를 여러개 만들 수 있다.
		int year=1950, month=5, day=5;
		double height=177.0;
		
		System.out.println("이름 : "+name);
		System.out.println("생일 : "+year+"년"+month+"월"+day+"일");
		System.out.println("키 : "+height+"cm");

		
	}
}
