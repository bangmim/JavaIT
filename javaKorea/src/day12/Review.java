package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Review {
	public static void main(String[] args) {
		// 컬렉션 : 배열을 좀더 쉽게 사용하기 위해 자바에서 제공해주는 클래스 (자바에서 만든 배열)
		// List, Set, Map
		// List(ArrayList) : 삭제 및 삽입이 쉽고 순서를 갖고 있다. >> 등록 순서
		// Set(HashSet) : 중복 안되고 순서가 없다. >> Iterator(반복자)와 함께 쓰인다. 
		// Map(HashMap) : key와 value로 이루어졌다. >> 순서가 아닌 키로 관리한다.
		__List list = new __List();
		list.go();
		__Set set = new __Set();
		set.go();
		__Map map = new __Map();
		map.go();
	}
}

class __List{
	ArrayList<String> arr = new ArrayList<>();
	public void go() {
		// 추가 add
		arr.add("one");
		arr.add("two");
		arr.add("three");
		arr.add("four");
		
		//삽입 add
		arr.add(0, "ZERO");
		
		//조회 get
		System.out.println(arr.get(0));
		
		//삭제 remove
		arr.remove(0);
		arr.remove("three");
		
		//수정 set
		arr.set(0, "ONE");

		//전체조회 size
		for(int i=0; i<arr.size(); i++) {
			System.out.println("arr : "+arr.get(i));
		}
		
	}
}

class __Set{	// 중복X! 가장 큰 특징 O(∩_∩)O
	Set<String> hs = new HashSet<String>();	//다형성 : 자식 클래스를 객체화 할 때 부모클래스를 자료형으로 사용해도 된다.
	public void go() {
		//추가 add
		hs.add("일");
		hs.add("이");
		hs.add("삼");
		hs.add("사");
		hs.add("사");
		
		//전체 조회 Iterator
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
	}
}

class __Map{
	// 웹에서 자주 사용. 순서가 아닌 내가 정한 키워드(key)로 보관한다
	HashMap<Integer, String> hm = new HashMap<Integer, String>();	
	public void go() {
		//추가 put
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "five");	//key가 같으면 아래 코드가 실행된다
		hm.put(4, "four");
		
		//조회 get
		System.out.println(hm.get(4));
		System.out.println(hm.keySet());	//전체 key를 array로 출력
		
		System.out.println("--------------");
		//전체조회 Set/Iterator
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(key+" : "+hm.get(key));
		}
		
		System.out.println("--------------");
		//Map 자체를 보기
		System.out.println(hm);
	}
	
}