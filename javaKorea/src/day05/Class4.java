package day05;

public class Class4 {
	public static void main(String[] args) {
		Aircon aircon=new Aircon();			//객체화
		aircon.temp=20;
		System.out.println(aircon.temp);
		
		aircon.powerOn();
		aircon.tempUp();
		aircon.tempDown();
		aircon.tempDown();
		aircon.currentTemp();
	}
}
class Aircon{
	int temp=25;			//클래스 안에서 만들어진 변수 => 멤버변수
	void currentTemp() {
		int temp=0;			//함수 안에서 만들어진 변수 => 지역변수 
		//지역변수: 함수 내에서만 사용 가능. 밖에서 사용 X, 우선순위가 멤버변수보다 높다
		//변수 앞에 this.을 입력하면 멤버에 있는 변수 또는 메서드를 지칭한다. 지역변수가 아닌 멤버변수를 사용한다.
		System.out.println("현재 온도는 "+this.temp+"입니다");	//19도
		System.out.println("현재 온도는 "+temp+"입니다");			//0도
	}
	
	//클래스 안에 있는 함수를 사용할 수 있는 이유 : (Aircon this)가 생략되어있기 때문.
	void tempUp() {			//void : return 값을 생략할 수 있다.
		temp++;			//this.temp++;; 에서 this가 생략되어 있는 것이다.
		System.out.println("에어컨 온도를 올립니다. 온도:"+temp);
	}
	void tempDown() {
		this.temp--;
		System.out.println("에어컨 온도를 내립니다. 온도:"+temp);
	}
	void powerOn() {
		System.out.println("에어컨을 가동합니다. 온도:"+temp);
	}
}