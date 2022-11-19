package day02;

public class Oper4 {
	public static void main(String[] args) {
		//연산자 (연산기호, 특정한 기능)
		//1. 산술연산자 : +,_,*,/,%
		//2. 대입연산자 : =
		//3. 누적연산자 : +=,-=, *=,/=
		//4. 증갑연산자 : ++,--
		//5. 비교연산자 : <,>,<=,>=,==,!=
		//6. 논리연산자 : &&, ||, !
		
		int 숫자1=0;
		
		숫자1++;	//숫자1+=1;
		숫자1--;	//숫자1-=1;
		
		int num=3;
		num--;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		++num;	//먼저 2을 누적하고 시작
		num++;	//코드 실행 후 1 누적 연산
		
		int 숫자2=0;
		System.out.println(++숫자2); 	//++하고 출력
		System.out.println(숫자2++); 	//출력 이후 ++
		System.out.println(숫자2);
		
		//증감연산자 ++,--
		//변수명 앞 또는 뒤에 사용
		//+=1; , -=1; 줄임말
		
		num=num+1;
		num+=1;
		num++;
		
	}
}
