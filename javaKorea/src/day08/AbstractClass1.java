package day08;

//class를 만들 때 abstract 체크!
//추상클래스 (클래스와 인터페이스의 중간) : 인터페이스의 일부만 구현해서 제공하고자 할 때
public abstract class AbstractClass1 implements Interface1{
	
	//구현(중괄호)을 안할거면 abstract 붙여서 만들기
	public abstract void speed();
	
	//구현을 할거면 그대로 만들기(일반적으로 만들기)
	public void bigdata() {
		System.out.println("5G 사용");
	}
	
}
