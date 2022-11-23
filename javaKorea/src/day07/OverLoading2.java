package day07;

public class OverLoading2 {
	//오버로딩 : 일반 메서드에서는 헷갈리기 때문에 권장하지 않는다.
	//오버로딩 : 생성자 or 연산자를 사용할 때에 사용한다.
	//-->자바에서는 연산자를 거의 사용하지 않기 때문에 생성자에만 주로 쓰인다.
	
	//생성자 : 객체화를 하면서 처음에 해야하는 작업들을 적어놓는 메서드
	OverLoading2(){
		System.out.println("생성자1");
	}
	OverLoading2(int num){
		System.out.println("생성자2");
	}
	OverLoading2(int num1,int num2){
		System.out.println("생성자3");
	}
	//생성자 오버로딩
	OverLoading2(String str){
		System.out.println(str+" >> 생성자4");
	}
}
