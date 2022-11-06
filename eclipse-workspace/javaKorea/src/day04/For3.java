package day04;

public class For3 {
	public static void main(String[] args) {
		//퀴즈1
		for(int i=0; i<5; i++) {
			System.out.println("안녕");
		}
		
		//퀴즈3
		int sum=0;
		for(int i=0; i<10; sum+=i) {
			i++;
		}
		System.out.println(sum);
		
		//퀴즈4
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		
	}
}
