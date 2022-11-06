package day04;

public class While3 {
	public static void main(String[] args) {
		//예제
		int i=0;
		while(i<11) {
			System.out.println(i+"번 실행!");
			i+=2;
		
		//퀴즈1
			int a=0;
			while(a<5) {
				System.out.println("안녕");
				a++;
			}
		
		//퀴즈2
			int b=0;
			int sum=0;
			while(b<11) {
				sum+=b;
				b++;
			}
			System.out.println("1~10까지 합계 : "+sum);
			
		//퀴즈3
			int c=0;
			int sum1=0;
			while(c<51) {
				sum1 +=c;
				c++;
			}
			System.out.println("1~50까지 합계 : " + sum1);
		}
	}
}
