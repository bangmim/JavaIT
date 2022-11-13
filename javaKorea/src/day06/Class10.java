package day06;

import java.util.Scanner;

public class Class10 {
	public static void main(String[] args) {
		//객체화 하여 사용
		MyClass10 mc=new MyClass10();
		//#1
		mc.hello();
		
		//#2
		mc.str("자바");
		
		//#3
		String result=mc.str1("나는","퀴즈");
		System.out.println(result);
		
		//#4
		int result1=mc.num(-4, 8);
		System.out.println(result1);
	}
}

class MyClass10{
	//#1 매개 변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	void hello(){
		System.out.println("Hello World");
	}
	//#2 매개 변수가 String 1개, 매개 변수의 문자열을 출력해주는 메서드
	public void str(String a) {
		System.out.println(a);
	}
	//#3 매개 변수로 String을 2개 받아서, 두 문자열을 합치고 return
	//return 한 값은 main메서드에서 syso로 출력
	String str1(String a1, String a2 ) {
		return a1+a2;
	}
	//#4 매개변수로 int 2개 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	//절댓값으로 만들고 더한다음 return
	int num(int num1, int num2) {
		if(num1<0) {
			num1=num1*-1;
		}
		if(num2<0) {
			num2=num2*-1;
		}
		return num1+num2;
	}
}