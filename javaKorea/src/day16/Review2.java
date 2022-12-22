package day16;

public class Review2 {
	public static void main(String[] args) {
		// 제어문 : 조건문, 반복문, 기타제어문
		// 조건문 : if, switch
		// 반복문 : while, for
		// 기타제어문 : break, continue, ... (goto)
		
		String str = null;
		int num = 0;
		
		// if문
		if(1 !=1) {
			System.out.println("이 문장은 항상 무시가 됩니다");
		}
		
		// if ~ else if ~ else
		if(str == null) {
			System.out.println("문자열은 비어있습니다");
		}else if(str.equals("")) {
			System.out.println("빈 문자열이 들어있습니다");
		}else {
			System.out.println(str);
		}
		
		// switch ~ case ~ break : 동일한 값을 비교할 때
		switch(num) {
		case 0:
			System.out.println("num is 0");
			break;
		case 1:
			System.out.println("num is 1");
			break;
			default:
				System.out.println("else...");
		}
		
		// 반복문 while, for
		while(num<3) {
			System.out.println("[while]num is less than 3");
			num++;
		}
		for(num=0; num<3; num++) {
			System.out.println("[for]num is less than 3");
		}
		
		// 빠른 for문 (python 형태) : 배열 전용
		int arr []= {0,1,2,3,4,5};
		for(int j : arr) {
			System.out.println("[배열전용 빠른 for]"+j);
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println("[기존 for]"+j);
		}
		
		// 기타제어문	>> 주로 반복문에서 조건으로 사용됨
		// break : 반복문을 종료한다. (반복문 취소)
		// continue : 더이상 아래 코드를 실행하지 않고 반복문은 처음으로 돌아간다. (1회성 취소)
		for(int x=0; x<10; x++) {
			if(x ==3 ) {	
//				break;		// 3일 때 반복문 종료
				continue;	// 3을 제외하고 반복문 실행
			}
			System.out.print(x+" ");
		}
		
		System.out.println();		// 줄 변경
		
		// 이중 반복문
		for(int a=0; a<3; a++) {
			for(int b=0; b<2; b++) {
				System.out.println("a: "+a+", b: "+b);
			}
		}
		
	}
}


