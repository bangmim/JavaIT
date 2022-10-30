package day02;

public class If2 {
	public static void main(String[] args) {
		//2.버스카드 기계
		int age=13;
		if(age>=20) {
			System.out.println("성인");
		} else if(age>=14 && age<=20) {
			System.out.println("청소년");
		} else {
			System.out.println("어린이");
		}
		
		//강사님 답안
		int 나이=5;
		int 금액=0;
		if(나이>=20) {
			System.out.println("성인");
			금액=1000;
		}else if(나이>=14) {
			System.out.println("청소년");
			금액=650;
		}else {
			System.out.println("미성년자");
			금액=300;
		}
		System.out.println(나이+"세의 버스요금은 "+금액+"원 입니다");
		
	}
}
