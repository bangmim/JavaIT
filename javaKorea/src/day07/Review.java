package day07;

public class Review {
	public static void main(String[] args) {
		//클래스와 메서드
		//클래스 : 변수와 함수의 꾸러미
		//메서드 : 클래스 안에 있는 함수, 기능 단위로 코드를 저장해 놓는다.
		
		//객체화: 해당 클래스에서 다른 클래스의 내용을 사용하고 싶을 때 필요한 작업.
		//사용 : 클래스명 변수명 = new 클래스명();
		//		변수명.클래스에서 만든 함수();
	
		MyClass mc= new MyClass();
		mc.Print();
		mc.Print2(2);
		mc.str="Hi ";
		mc.Print();
		mc.Print2(8);
	
		//같은 패키지 내의 클래스는 다른 class에서도 사용 가능하다.
		ClassImport ci = new ClassImport();	//객체화 성공!
		ci.setStr("Java");		//ci.str="Java";
//		ci.Num(314);			
//		ci.setNum(314);			//ci.num=314;
		
		System.out.println(ci.getStr());
		System.out.println(ci.getNum());	//num 입력 X -> 기본값 0
		System.out.println(ci.Num(314));
	}
}

class MyClass{		//class = 변수 + 함수
	//변수
	int num;				//기본값:0
	String str="Hello ";	//멤버변수를 초기화하지 않으면 기본값이 들어간다.(String 기본값 : null)
	double dNum;			//기본값:0.0
	
	//함수(메서드)
	int Print() {
		for(int i=0; i<5; i++) {
			System.out.println(str+num);			
		}
		return 0;		//return : 함수를 끝내고 사용한 곳에 최종값을 전달한다.
	}
	
	int Print2(int num) {
		for(int i=0; i<5; i++) {
			System.out.println(str+num);			
		}
		return 0;
	}
}