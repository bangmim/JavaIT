package day16;

public class Review4 {
	public static void main(String[] args) {
		ReviewTest4 test = new ReviewTest4();
		test.go(true, 3);				// 매개 변수(parameter) 형태를 지켜줘야 사용 가능하다
		int result1 = test.num();		// 리턴값은 변수로 담거나 즉시 사용 가능하다
		System.out.println(test.dNum()); // 리턴값 즉시 사용 가능
		String result3 = test.str();	
	}
}

class ReviewTest4{
	// 함수의 자료형 (return의 자료형_
	public void go(boolean a, int b) {	// () : 매개변수 - 함수를 사용하는 곳에서 입력받아야하는 값을 정해둔다.
		
		// void : return 생략 가능
	}
	
	public int num() {
		return 3;	// 이 함수를 사용한 곳에 return 옆의 값을 되돌려 준다
	}
	
	public double dNum() {
		return 3.14;
	}
	public String str() {
		return "안녕하세요";
	}
}