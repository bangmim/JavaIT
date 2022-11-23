package day07;

//상속
public class Extends1 {
	public static void main(String[] args) {
		MyString ms = new MyString();
		ms.setNum(3, 0);
		ms.getPlus();		//저장된 두 수를 더함(메서드에 syso 출력함수가 있기 때문에 콘솔로 확인 가능한 것이다.)
		ms.getDiv();		//두 수를 나눔 (추가사항)
//							---->num2=0이면 버그발생 => 또 일일이 수정해야한다. --> 상속 extends 사용
		
		//~ 요청 : 두 수를 더하는데 우리는 마이너스 값이 없다.~
		MyStringEx mse = new MyStringEx();
		mse.setNum(3, -4);
		mse.getPlus();
		mse.getDiv();		//일일이 추가하지 않는 이상 불가. (비효율적인 작업)
		
		//~요청2 : 회사의 로고가 보이면 좋겠다~
		MyStringLogo msl = new MyStringLogo();
		msl.setNum(3, -4);
		msl.getPlus("====logo====");
		msl.getDiv("====logo====");
	
		
		//버그 | 추가사항
		//추가사항 : 나눗셈 추가
	
		//===> 상속 extends
		
	}
}

class MyString{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	//나눗셈 추가된 경우
	public double getDiv() {
		if(num2==0) {
			return 0.0;			//버그 발생(infinity)하지 않고 그냥 지나간다.
		}
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
	
}
class MyStringEx{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		if(num1<0) {
			num1 *= -1;
		}
		if(num2<0) {
			num2 *= -1;
		}
		
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

class MyStringLogo{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int getPlus(String logo) {
		System.out.println(logo+( num1+num2));
		return num1+num2;
	}
	public double getDiv(String logo) {
		System.out.println(logo+(double)num1/num2);
		return (double)num1/num2;
	}
	
}