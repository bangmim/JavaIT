package day04;

public class Array1 {
	public static void main(String[] args) {
		//반복문이 사용 가능한 묶음 => 배열
		
		String [] menu= {"에스프레소","아메리카노","카페라떼","카페모카","오렌지주스"};
		
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		System.out.println(menu[4]);
		
		System.out.println(menu[0+2]);	//인덱스로 연산이 가능하다
		
		for (int i=0; i<menu.length; i++) {
			System.out.println(menu[i]+" 있습니다");
		}
		
	}
	
}
