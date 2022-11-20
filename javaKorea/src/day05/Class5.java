package day05;

//객체지향 : 클래스 기반 코딩 기법 (클래서 안에서만 코딩하겠다)


public class Class5 {
	public static void main(String[] args) {
		//Car 객체화
		//사용 : 클래스명 객체명 = new 클래스명();
		
		//클래스 : 추상적인 개념 (설계도)
		//객체(Object) : 구체적인 대상
		Car 아빠차 = new Car();
		Car 엄마차 = new Car();
		Car 내차= new Car();
		
		//방법1(메서드 이용해서 정보받기)
		아빠차.setInfo("아빠",	 "제네시스", 3388);
		엄마차.setInfo("엄마","아반떼",1122);
		
		//방법2(속성 이용해 직접 입력)
		내차.owner="홍길동";
		내차.name="k5";
		내차.car_num=9999;
		
		//객체지향			(C언어 : 절차지향)
		System.out.println(아빠차.car_num);
		System.out.println(내차.car_num);
		
		아빠차.carInfo();
		엄마차.carInfo();
		내차.carInfo();
	}
}

//설계도
class Car{
	//속성
	String owner;
	String name;
	int car_num;
	
	public void carInfo() {
		System.out.println("차주인: "+owner+" 모델명: "+name+" 차번호: "+car_num);
	}
	
	//정보받기
	public void setInfo(String owner, String name, int car_num) {
		this.owner=owner;
		this.name=name;
		this.car_num=car_num;
	}

}