package day02;

public class Oper3 {
	public static void main(String[] args) {
		//연산자 (연산기호, 특정한 기능)
		//1. 산술연산자 : +,_,*,/,%
		//2. 대입연산자 : =
		//3. 누적연산자 : +=,-=, *=,/=
		//4. 증갑연산자 : ++,--
		//5. 비교연산자 : <,>,<=,>=,==,!=
		//6. 논리연산자 : &&, ||, !
		
		int 숫자1;
		int 숫자2;
		숫자1=3;
		숫자2=2;
		int 숫자3;
		
		//누적연산
		System.out.println(숫자1+숫자2);
		숫자3=숫자1+숫자2;
		숫자1=숫자1+숫자2;
		System.out.println(숫자1);
		숫자1+=숫자2;	//숫자1=숫자1+숫자2;
		
		int 숫자4=0;
		System.out.println(숫자4);
		숫자4=숫자4+1;
		System.out.println(숫자4);
		
		숫자4+=2;		//숫자4=숫자4+2	//1+2
		System.out.println(숫자4);	//3
		
		//예제
		int i=0;
		i+=3;
		System.out.println("i+=3="+i);
		i+=3.14;
		System.out.println("i+=3.14="+i); 	//i는 int이기 때문에 6
		i*=2;
		System.out.println("i*=2="+i);
		i/=2;
		System.out.println("i/=2="+i);
		i-=5;
		System.out.println("i-=2="+i);
		i%=2;
		System.out.println("i%=2="+i);
	}
}
