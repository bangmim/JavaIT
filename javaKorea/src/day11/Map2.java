package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl mi2 = new Map2Impl();
		mi2.go();
		mi2.tester();
	}
}

class Map2Impl{
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		//퀴즈 단어사전 만들기
		hm.put("사과", "apple");
		hm.put("바나나", "banana");
		hm.put("오렌지", "orange");
		hm.put("수박", "watermelon");
		hm.put("감", "persimmon");
//		
//		Set<String> keyset = hm.keySet();			//전체 key 만들기
//		Iterator<String> it = keyset.iterator();	//반복문을 위해 반복자 생성
//		Scanner sc = new Scanner(System.in);
//		while(it.hasNext()) {
//			System.out.println("[영한사전] 검색할 단어를 입력하세요 >>>");
//			String key = sc.next();				
////			String key = it.next();					// key 만들기 (순서는 무작위)
////			System.out.println(it.next());
//			System.out.print(key+":");
//			System.out.println(hm.get(key));		//key에 대한 value 출력
//		}
		
	}
	public void tester() {
		Scanner sc = new Scanner(System.in);
		String eng = null, kor = null;
		System.out.println("[영한사전] 검색할 단어를 입력하세요 >>");
		kor = sc.nextLine();
		eng = hm.get(kor);
		if(eng == null || eng.equals("")) {	//null 비교할 때에는 .equls 아닌 == 로 한다.
			System.out.println("사전에 없는 단어입니다");
		}else {			
			System.out.println("뜻 : "+eng);
		}
	}
}
