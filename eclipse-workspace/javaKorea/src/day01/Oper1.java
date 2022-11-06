package day01;

public class Oper1 {
	public static void main(String[] args) {
		int 숫자1=3;
		int 숫자2=2;
		
		//프로그래밍에서는 연산이 가능하다
		//연산을 시켜주는 기호들을 '연산자'라고 부른다.
		
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(19*2);
		System.out.println(19/3);
		
		//연산은 변수끼리도 가능하다.
		숫자1=1;
		숫자2=2;
		int 숫자3=숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		String 글자1="안녕!";
		String 글자2="하세요!";
		System.out.println(글자1+글자2);
		
		//숫자는 더하기, 빼기, 곱하기, 나누기 등등
		//글자는 더하기만 가능
		
		//연산자
		String 글자3= "Hello"+"World";
		int num=1+1;
		int num1=2-1;
		int num2=3*3;
		int num3=9/3;
		int num4=10%3;	//나머지
		
		System.out.println(글자3);
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		//우선순위 높음 : *, /
		//우선순위 낮음 : +, -
		
		//Q.
		int 국어=55, 영어=41, 수학=62;
		//합계
		int sum=국어+영어+수학;
		//평균
		//실수 : double 
		//수 하나를 실수로 만든다. > 나누는 수에 소수점을 적어주거나 정수형 변수 앞에 (double)을 적어준다.
		//double avg=sum/3.0;
		double avg=(double)sum/3;
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
			
		//자료형 변환 : 변수 앞에 (자료형)을 적어준다.
		System.out.println((int)3.14);	//3
		System.out.println(3.14);		//3.14
		
		System.out.println(3);			//3
		System.out.println((double)3);	//3.0
		


		
	}
}
