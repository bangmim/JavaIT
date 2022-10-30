package day02;

public class Oper6 {
	public static void main(String[] args) {
		//연산자 (연산기호, 특정한 기능)
		//1. 산술연산자 : +,_,*,/,%
		//2. 대입연산자 : =
		//3. 누적연산자 : +=,-=, *=,/=
		//4. 증갑연산자 : ++,--
		//5. 비교연산자 : <,>,<=,>=,==,!=
		//6. 논리연산자 : &&, ||, !
		
		//논리연산자
		//&& : and
		//|| : or
		// ! : not(boolean 값을 반대로 바꿈), true->false, false->true
		boolean tst=!true;
		System.out.println(tst);
		
		boolean 참= true;
		boolean 거짓 = false;
		
		//and &&
		//+가 우선순위가 높아 논리연산자를 괄호로 묶어서 먼저 수행하게 한다.
		System.out.println("참&&참:"+(참&&참));
		System.out.println("참&&거짓:"+(참&&거짓));
		System.out.println("거짓&&참:"+(거짓&&참));
		System.out.println("거짓&&거짓:"+(거짓&&거짓));
	
		//or ||
		System.out.println("참||참:"+(참||참));
		System.out.println("참||거짓:"+(참||거짓));
		System.out.println("거짓||참:"+(거짓||참));
		System.out.println("거짓||거짓:"+(거짓||거짓));	//flase
		
		//not !
		System.out.println(!참);	//false
		System.out.println(!거짓);	//true
		
		
	}
}
