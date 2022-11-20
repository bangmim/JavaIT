package day08;

public class Review {
	public static void main(String[] args) {
		//상속 : 클래스를 복사붙여넣기
		//extends 부모클래스명
		Test test = new Test();
		test.setVar(2, "A");
		
		Test test2 = new Test2();
		test2.setVar(2, "b",3.14);
	}
}

class Test{
	private int num;
	protected String str;
	
	Test(){
		System.out.println("생성자");
	}
	public void setVar(int i, String string, double d) {
		// TODO Auto-generated method stub
		
	}
	public void setVar(int num, String str) {
		this.num=num;
		this.str=str;
	}
	
	public int getNum() {
		return num;			//변수 직접 쓰지 말고 메서드 처리
	}
	
	public String getStr() {
		return str;		
	}
	
}
class Test2 extends Test {
	private double dNum;
	public Test2() {
		//부모 생성자를 그대로 사용
		super();
	}
	
	//상속을 받는 이유 : 클래스를 수정 & 추가 하기 위해
	public void setVar(int num, String str) {
		super.setVar(num, str);			//Test 클래스의 setVar을 사용
		//오버라이딩 == 재정의(수정)
		this.dNum=0.0;
		};	//오버라이딩 : 상속받은 후 재정의
		
	public void setVar(int num, String str, double dNum) {
		super.setVar(num, str);
		this.dNum=dNum;	
		}	//오버로딩 : 메서드 이름 같아도 매게변수 다르면 다른 메서드로 취급 ( 같은 이름의 메서드 여러개 만들 수 있다)
		
	//추가
	public double getDNum() {
		//super.getStr();
		//this.getStr();			//오버라이딩(재정의)=>우선순위는 this가 더 높은 것을 이용하는 것.
		return dNum;
	}

}

	