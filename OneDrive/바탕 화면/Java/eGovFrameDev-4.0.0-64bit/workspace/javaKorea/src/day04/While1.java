package day04;

public class While1 {
	public static void main(String[] args) {
		//조건문 : if, switch
		//반복문 : while, for
		
		int age=22;
		if (age>=20) {
			//조건이 맞으면 실행하는 블록{}
			System.out.println("if문 : "+age);
		}
		
		while(age>=20) {
			System.out.println("while문 :"+age);
		}
	}
}
