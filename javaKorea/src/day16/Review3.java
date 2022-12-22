package day16;

public class Review3 {
	public static void main(String[] args) {
		// 객체지향 : 클래스 사용
		// 객체화 하여 사용
		ReviewTest3 test3 = new ReviewTest3();
		test3.go();
	}
}

class ReviewTest3{
	// 클래스 : 변수 + 함수 집합체
	private String str;		// 멤버변수
	
	public void go() {		// 메서드
		String str;	// 지역변수 (함수 안에서 사용하는 변수)
		str = "지역변수 str";
		this.str="멤버변수 str";	// this. 를 사용하면 멤버변수에 접근할 수 있다.
			
		System.out.println(str+" , "+this.str);
	}
}