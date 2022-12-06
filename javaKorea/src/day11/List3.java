package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		ListClass3 lc3 = new ListClass3();
		lc3.go();
	}
}

class ListClass3{
	public void go() {	
		
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		arr1.add("아메리카노");
		arr1.add("카페라떼");
		arr1.add("카페모카");
		arr1.add("카라멜마끼아또");
		arr1.add(0, "에스프레소");		//수정아닌 삽입! 총 개수는 3->4가 된다 
		arr1.set(4, "오렌지주스");	
		arr1.remove(4);
		arr1.remove("카페모카");
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.indexOf("에스프레소"));		//index 번소 출력
//		System.out.println(arr1.get(2));
//		System.out.println(arr1.get(3));
//		System.out.println(arr1.get(4));
		System.out.println(arr1.size());
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.print(arr1.get(i)+" ");
		}
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("추가할 항목 입력 (0 입력시 종료) >>> ");
			String str = sc.next();
			if(str.equals("0")) {
				break;
			} else {
				arr2.add(str);
			}
		}
		for(int i=0; i<arr2.size(); i++) {
			System.out.print(arr2.get(i)+" ");
		}
	}
}
