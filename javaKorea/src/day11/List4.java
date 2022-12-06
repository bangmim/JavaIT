package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	public static void main(String[] args) {
		//메뉴입력 프로그램 만들기
		Quiz qz = new Quiz();
		qz.go();
		
		//Scanner 버그 (1과 2를 함께 사용할 수 없다.)
		//next(), nextInt()	--1
		//nextLine(), Integer.parseInt(nextLine())	--2
		
	}
}


class Quiz{
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num, num2, num3 ;
		String str, str2;

		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.println("추가할 항목 입력 >>");
				str = sc.next();
				arr1.add(str);
			}else if(num==2) {
				System.out.println("수정할 위치를 입력하세요 >>");
				num2=sc.nextInt();
				System.out.println("수정 내용을 입력하세요 >>");
				str2=sc.next();
				arr1.set(num2, str2);
			}else if(num==3) {
				System.out.println("삭제할 위치를 입력하세요 >>");
				num3 = sc.nextInt();
				arr1.remove(num3);
			}else if(num==4) {
				for(int i=0; i<arr1.size(); i++) {
					System.out.print(arr1.get(i)+" ");
				}
				System.out.println();
			}
			if(num==0) {
				System.out.println("프로그램 종료");
				return;
			}
			sc.close();
		}
		
		//강사님 답안
//		while (true) {
//			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
//			num = Integer.parseInt(sc.nextLine());
//		
//			if(num==0) {
//				System.out.println("프로그램 종료");
//				break;		//break으로 종료 가능
//			}else if(num==1) {
//				System.out.println("추가할 항목 입력 >>");
//				str = sc.nextLine();
//				arr1.add(str);
//			}else if(num==2) {
//			System.out.println("수정할 위치를 입력하세요 >>");
//			num =Integer.parseInt(sc.nextLine());	//재사용 가능
//			System.out.println("수정 내용을 입력하세요 >>");
//			str=sc.nextLine();	//재사용 가능
//			arr1.set(num-1, str);	//사용자가 1번을 입력했을 때 --> 0번째 index 
//			}else if(num==3) {
//			System.out.println("삭제할 위치를 입력하세요 >>");
//			num =Integer.parseInt(sc.nextLine());
//			arr1.remove(num-1);
//			}else if(num==4) {
//			for(int i=0; i<arr1.size(); i++) {
//				System.out.print(arr1.get(i)+" ");
//			}
//			System.out.println();
//			}
//		}
}
}