package day07;

public class Extends2 {
	public static void main(String[] args) {
		MyOper mo = new MyOper();
		mo.setNum(3, -4);
		mo.getPlus();
		mo.getDiv();
		
		//의견1:마이너스값 없애기
		MyOperEx moe = new MyOperEx();
		moe.setNum(3, -4);
		moe.getPlus();
		moe.getDiv();
		
		//의견2:로고 붙이기
		MyOperLogo mol =new MyOperLogo();
		mol.setNum(3, -4);
		mol.getPlus("====logo==== ");
		mol.getDiv();
		
		//수정사항 : 나눗셈 | 버그
		
		//업무량이 너무 많다 ->> 사람이 복사 붙여넣기 하니까 실수할 수 있고, 결국 사람이 수정해야한다.
		//사람 복붙 -> 컴퓨터 복붙 ===> 상속 탄생
		//상속 : 클래스 복붙(기존 클래스의 변수와 메서드를 물려받는다)
		
	}
}

class MyOper{
	private int num1,num2;
	
	public void setNum(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	public double getDiv() {
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
	
}

class MyOperEx extends MyOper{	//복붙 끝
	//요청1 :마이너스 없애기
	//오버라이딩 : 상속받은 후 수정
	//사용 : 수정할 함수 이름 적고 Ctrl+space+enter;
	
	//수정(오버라이딩) : 상속받은 후 수정하고자 하는 메서드만 적어준다.
	@Override
	public void setNum(int num1, int num2) {
		if(num1<0) {
			num1 *= -1;
		}
		if(num2<0) {
			num2 *= -1;
		}
		super.setNum(num1, num2);		//super. : 부모클래스의
	}
	
}

class MyOperLogo extends MyOper{
	//요청2: 로고 붙이기
	//추가사항 
	
	public int getPlus(String str) {
		System.out.print(str);
		return super.getPlus();		//str + (super: num1+num2)
	}
}