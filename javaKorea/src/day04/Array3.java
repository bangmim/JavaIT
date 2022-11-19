package day04;

public class Array3 {
	public static void main(String[] args) {
		String name[]= new String[4];	//4칸짜리 빈 array를 만든다.
		int no[] = {1,2,3,4};
		
		name[0]="김가빈";
		name[1]="박창서";
		name[2]="임하늘";
		name[3]="하동훈";
		//name[4]=''; : 4칸짜리 Array에 5번째 값을 입력하는 것 > 프로그램 강제 종료되므로 주의하기
		
		System.out.println("====출석부====");
		for (int i=0; i<name.length; i++){
				System.out.println(no[i]+"번 - "+name[i]);
		}
	}
}
