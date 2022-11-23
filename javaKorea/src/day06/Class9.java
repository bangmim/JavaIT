package day06;

public class Class9 {
	public static void main(String[] args) {
		//덜 잘하는 사람 : class 사용
		MyClass9 mc=new MyClass9();
		
		//입력받을 때 set
		mc.setNum1(3);
		mc.setNum2(4);
		mc.Print();
		
		System.out.println(mc.getNum1());	//사용할 때 get
		
		//변수(정보)는 private로, 메서드는 public으로 정보를 보호한다 -> 캡슐화
		
		//문제 : 함수를 덜 만들게 된다. 
//		mc.num1=3;
//		mc.num2=4;
//		mc.Print();
		
	}
}

//잘하는 사람 : class 만들기 (설계)

//접근권한제어자 : public(중요)/private(중요)/protected/default
	//public : 모두 사용 가능
	//protected : 같은 패키지 + 상속 에서 사용 가능
	//(default) : 같은 패키지에서 사용 가능
	//private : 같은 클래스일 경우만 사용 가능
	
class MyClass9{
	//접근권한제어자 : 멤버변수 private, 멤버메서드(함수) public
	private int num1, num2;	//변수에는 정보가 저장된다. (보안중요) ==>private 사용(변수로 직접 사용 불가)
	
	//사용시 함수 이용 public
	
	//사용 조건1.변수 앞에 private
	//변수 사용 함수만들기 : private 있는 class에 우클릭 > Source > Generate Gatters and Setters
	
	public void Print() {
		System.out.println("num1: "+num1+" num2: "+num2);
	}

	//get : 바깥에서 사용하게 할 때
	public int getNum1() {
		return num1;
	}
	
	//set : 바깥에서 값을 받아올 때
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}