package day11;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		//ArrayList, HashMap, (HashSet)
		
		ListClass1 lc1 = new ListClass1();
		lc1.go();
		
	}
}

class ListClass1{
	
	public void go() {
		// int ==> <Integer> : int 자료형을 보관하게끔 선언한다
		// double ==> <Double> : double 자료형을 보관하게끔 선언한다.
		ArrayList<Integer> arr1 = new ArrayList<Integer>();	//추가, 삭제 가능하다
		
		//배열 : 미리 자리 만들어 둔다.
		int num[]= new int [10];	
		
		// # 값 대입
		num[0] = 1;
		arr1.add(1);
		
		num[1]=2;	//인덱스를 지정해주어야한
		arr1.add(2);	// .add(value)  //자동으로 지정해준다.
		
		num[2]=3;
		arr1.add(3);
		
		// # 수정
		num[1]=22;
		arr1.set(1, 22);	//.set(index, value)
		
		// # 삽입 (1과 2 사이)
		arr1.add(2, 123);	//2번에 삽입 >> 기존에 2번 값은 자동으로 뒤로 밀려간다.	
		for(int i=num.length-1; i>2; i--) {
			if(i != num.length-1) {
				num[i+1] = num[i];
			}
		}
		num[2]=123;
		
		// # 제거 : 1번방을 없애고 싶다.
		//arrayList
		arr1.remove(1);		
		//배열
		for(int i=1; i<num.length; i++) {
			if(i !=num.length-1) {
				num[i]=num[i+1];				
			}
		}
		num[num.length-1]=0;
		
		//배열 전체보기
		for(int i=0; i<num.length; i++) {
			if(num[i] !=0) {				
				System.out.println(num[i]);
			}
		}
		
		//ArrayList 전체보기
		for (int i=0; i<arr1.size(); i++) {
			System.out.println("arrList:"+arr1.get(i));
		}
	}
}
