package day04;

public class Flow2 {
	public static void main(String[] args) {
		//기타 제어문: break, continue
		
		//break:반복문을 끝냄. 강제종료
		//continue:반복문 1회성 취소
		
		for (int i=1; i<6; i++) {
			if(i==3) {
				break;		//i==3이면 반복문 종료
			}
			System.out.println(i+"번");
		}
		System.out.println("프로그램 종료");
		
		for(int i=1; i<6; i++) {
			if(i==3) {
				continue;		//i==3이면 밑에 코드 실행 X (1회성 취소. 4회부터 다시 실행된다(3회만 취소))
			}
			System.out.println(i+"회");
		}
		System.out.println("프로그램 종료2");
	}
}
