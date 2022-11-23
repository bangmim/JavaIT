package day07;

public class OverLoading1 {
	//오버로딩 : 같은 이름으로 메서드를 여러개 만드는 것
	//C언어 : 같은 이름의 함수가 존재X
	//C++ : 오버로딩 문법이 추가됨 - 메서드 이름이 같아도 매개변수가 다르면 OK
	int num;
	
	public int Print() {
		System.out.println(num);
		return num;
	}
	
	//Print 메서드를 오버로딩
	public int Print(int num) {		//같은 이름이지만 조건(소괄호 내용: 매개변수)이 다르므로 사용이 가능하다. 
		System.out.println(num);
		return num;
	}
	public int Print(int num1, int num2) {
		System.out.println(num1+num2);
		this.num=num1+num2;
		return this.num;
	}
	public int Print(double dNum) {
		System.out.println((int)dNum+" 실수함수 사용");
	return (int)dNum;
	}
}
