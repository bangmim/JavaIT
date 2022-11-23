package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc=new TestClass();
		TestClassEx tce = new TestClassEx();
		
		tc.Print();
		tce.Print();
		tce.add();
		tce.setNum2(3);
		
	}
}

class TestClass{
	//private : 나 외에 다 사용 불가
	//protected: 상속받은 클래스까지는 허용
	//default(안적으면/ 기본값) : 같은 패키지면 허용
	//public : 같은 프로젝트면 허용
	
	//상속할거면 private -> protected로 바꾸어 사용한다.
	protected int num;
	protected String str;
	private double dNum;
	
	public void Print() {
		System.out.println("테스트 클래스 사용");
	}
	
}

//TestClass를 상속받아서 수정& 추가
class TestClassEx extends TestClass{
	//추가
	private int num2;	
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	//수정(오버라이딩)
	@Override
	public void Print() {
		System.out.println("TestClassEx가 만든 Print 사용");
	}
	
	//추가
	public int add() {
		System.out.println("추가된 메서드");
		return 0;
	}
}
