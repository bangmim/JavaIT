package day06;

public class Review {
	public static void main(String[] args) {
		//다른 클래스의 변수 또는 메서드를 사용하려면 '객체화'
		//클래스명 변수명 = new 클래스명 ();
		//변수명.
		MyReview mr=new MyReview();		//객체화
		mr.function3(33);			//메서드 사용
		mr.function1();
	}
}

// 클래스와 메서드
// 클래스 : 변수와 메서드를 뭉쳐놓은 꾸러미

class MyReview{	//소괄호 X (함수가 따로 존재하지 않고, 클래스 안에 다 들어있다)
	//변수 : 저장공간
	String str;
	int num;
	
	//메서드 : 코드를 저장하는 공간
	int function1() {
		//소괄호가 있으면 메서드 (단, if/switch/while/for(제어문) 제외)
		
		return this.num;	//자료형과 return 값이 일치해야한다.
		//this.num : 클래스에 있는 num 것 (단, 지역(함수내)에 중복이 없으면 생략 가능)
	}
	void function2() {
		//return 값이 없음
	}
	//() : 메서드라는 표시, 매개 변수를 만들어 놓는다.
	void function3(int num) {
		String str;
		this.num=num;
		//클래스에 있는 num = 메서드 사용 num
		str="지역변수"	;	//지역변수 : 함수가 끝나면 공간이 없어짐.
		this.str="멤버변수";	//멤버변수 : 클래스에 있는 변수
	}
	
}