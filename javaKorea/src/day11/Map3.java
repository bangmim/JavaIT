package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map3Impl mi3 = new Map3Impl();
		mi3.go();
	}
}

class Map3Impl{
	private HashMap<String, String> hm = new HashMap<>();
	public void go() {
		//국가별 수도
		hm.put("한국", "서울");
		hm.put("중국", "베이징");
		hm.put("미국", "워싱턴");
		hm.put("일본", "도쿄");
		hm.put("캐나다", "오타와");
		
		Scanner sc = new Scanner(System.in);
		String nation = null, capital = null;
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		
		//국가를 입력하세요 (0을 입력하면 전체보기) 
		while(it.hasNext()) {			
		System.out.println("국가를 입력하세요 (0 입력시 전체보기) >>");
		nation = sc.nextLine();
		capital = hm.get(nation);
			if(nation.equals("0")) {
				while(it.hasNext()) {
					String key = it.next();		//반복문 안에 있어야 무한반복되지 않는다.
					System.out.print(key+":");
					System.out.println(hm.get(key));
				}
			}else if(nation.equals("")) {
				System.out.println("단어를 입력하세요.");
			}else if(capital == null){
				System.out.println("사전에 없는 단어입니다");
			}else {
				System.out.print(nation+"의 수도는" + capital);
				System.out.println();
			}
		}
	}
}