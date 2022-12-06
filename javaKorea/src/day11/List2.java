package day11;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ListClass2 lc2 = new ListClass2();
		lc2.go();
	}
}

class ListClass2{
	
	public void go() {
		
		//ArrayList 객채화 하는 방법 	//<> : 자료형
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		//# 메서드
		//추가, 삽입 add
		//수정 set
		//삭제 remove
		//읽기 get
		//총개수 size
		
		arr1.add("일");
		arr1.add("이");
		
		//읽기
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		
		arr2.add(1);
		arr2.add(2);

		System.out.println(arr2.get(0));
		System.out.println(arr2.get(1));
		
		
		
	}
}
