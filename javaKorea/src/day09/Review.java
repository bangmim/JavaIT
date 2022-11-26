package day09;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//출력
		System.out.println("java2");
		
		//변수 : 저장공간
		//자료형 : 변수에게 줄 공간의 크기 및 형태
		String 문자열변수 ="문자열 저장";
		int 정수형변수 =314;
		double 실수형변수 = 3.14;
		boolean 불린형변수 =true; 		//false | true;
		
		System.out.println(문자열변수);
		
		//입력 Scanner
		Scanner sc = new Scanner(System.in);
//		문자열변수=sc.next();			//단어를 입력(띄어쓰기 금지)
//		정수형변수=sc.nextInt();		//정수를 입력
//		실수형변수=sc.nextDouble();		//실수를 입력
		
//		문자열변수=sc.nextLine();		//문장을 입력 (버그가 있어서 next, nextInt와 혼용 금지)
//		정수형변수=Integer.parseInt(sc.nextLine());		//정수를 입력(nsxtInt 대체용) 	//문자열을 정수형으로 형변환
//		실수형변수=Double.parseDouble(sc.nextLine());		//입력받은 문자열을 실수로 변환(nsxtDouble 대체용) 
		sc.close();		//스캐너 그만쓰기
		
		//# (자료)형 변환
		//int <-> double : 기본자료형
		int num= 4;
		double dNum = 3.14;
		System.out.println((double)num);
		System.out.println((int)dNum);
		
		//String <-> int : 개발된 자료형(클래스)
		//toString, Integer.parseInt
		String str="001230";
		num = Integer.parseInt(str);	//문자열을 정수로 변환
		str = Integer.toString(num);	//정수를 문자열로
		
		System.out.println(num);

		//조건문 if~else if~else
		if(num < 0) {
			System.out.println("숫자는 0보다 작다");
		}else if(num ==0) {
			System.out.println("숫자는 0이다");
		}else if(num>0) {
			System.out.println("숫자는 0보다 크다");
		}else {
			System.out.println("그 밖에");
		}
		
		//switch~case~break
		switch(num) {
		case 0:
			System.out.println("num == 0");
			break;
		case 1:
			System.out.println("num ==1");
			break;
		default:
			System.out.println("그밖에");
		}
		
		//반복문 while, for
		int count = 0;
		while(count<5) {
			System.out.println("현재 "+(count+1)+"번");
			count ++;
		}
		
		for (int i=5; i>0; i--) {
			System.out.println("현재 "+i+"번");
			if(i==3) {
				break;		//반복문 끝(i==3에서 멈춤)
//				continue;	//밑에 부분은 실행하지 않고 처음으로 올라감
			}
		}
		
		ReviewTest rt=new ReviewTest();		//객체화
		rt.go();
		
	}	//main 메서드
}	//클래스

//클래스 : 변수 + 함수(메서드)
class ReviewTest extends TheOne implements TheTwo{
	//멤버변수 private
	private int num[]= {10,20,30,40,50};
	
	//메서드 public
	public void go() {
		for(int i=0; i<5; i++) {
			//지역변수 i는 중괄호가 끝나면 없어진다.
			System.out.println(num[i]);
		}
	}
	
}

class TheOne{
	private String str;
	public TheOne() {
		//클래스 이름과 같고 소괄호가 있으면 '생성자'
		//생성자 : 객체화 하는 순간에 사용될 메서드
		System.out.println("객체화 성공!");
	}
	
	public String getStr() {		//메서드의 자료형 == return의 자료형
		return str;			//return : 함수를 종료시키면서 해당 값을 사용한 곳에 전달
	}
	public void setStr(String str) {	// () : 매개변수, 사용하는 곳에서 전달해줘야하는 값을 지정하는 변수들
		this.str = str;		//this. : 이 클래스의, 멤버에 있는 변수나 메서드를 사용하기 위해 앞에 붙여준다.
	}
	
	
	
}

interface TheTwo{		//명세서
	public void go();	//구현X	//인터페이스의 메서드는 상속받은 곳에서 {}를 구현해줘야한다.
}
