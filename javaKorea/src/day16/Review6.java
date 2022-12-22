package day16;

public class Review6 {
	public static void main(String[] args) {
		// 다형성
		Inter1 r1 = new ReviewTest6Ex();
		Inter1 r2 = new RT6();
		
		r1.go();
		r2.go();
	}
}

class RT6 implements Inter1{

	@Override
	public void go() {
		System.out.println("오버라이딩 "+str);
	}
	
}

class ReviewTest6Ex implements Inter1{

	@Override
	public void go() {
		System.out.println("오버라이딩 "+num);
	}
	
}

// 추상클래스 : 클래스와 인터페이스의 중간, 구현해도 되고 안해도 된다
abstract class ReviewTest6 implements Inter1{
	public abstract void method1();
	public void method2() {
		
	}
	
	// 추상 클래스는 다른 클래스에 extends 되는 경우가 많다. 
	// 추상 클래스에서 상속받은 method를 구현하는 경우는 적은것 같다.
}

interface Inter1{
	// 상수 초기화 : 수정이 불가능한 변수를 상수라고 한다. (final), 사용
	public final static int num = 3;
	String str = "a";	// public final static 생략
//	num = 4;	// 수정 불가능
	
	// 메서드 선언 : 상속받은 곳에서 구현해라{}
	public void go();
	
	
}