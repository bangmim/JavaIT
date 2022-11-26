package day08;

import java.util.Scanner;

//Interface2Impl : interface2를 구현했다.
public class Interface2Impl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//다형성 : 부모의 자료형으로 통일 (코드 재사용이 증가됨)
		Interface2 shop=null;
		int shop_num;
		
		System.out.println("지점을 입력하세요 >>> (1:강남, 2:신촌, 3:인천, 0:종료)");
		shop_num=sc.nextInt();
		
		if(shop_num==1) {
			shop=new Gangnam();
		}else if(shop_num==2) {
			shop=new Sinchon();
		}else if(shop_num==3) {
			shop=new Incheon();
		}else if(shop_num==0) {
			System.out.println("종료합니다");
			return;
		}
		
		shop.make("아메리카노", 3000);
		shop.make("꿀아메리카노", 3500);
		shop.make("에스프레소", 2500);
		shop.make("카페라떼", 4500);
		
		shop.coffeList();
		
		System.out.println("구입할 커피를 입력하세요>>>");
		shop.sell(sc.next());
		
//		Interface2 gangnam=new Gangnam();		//다형성 (자료형을 부모의 것으로 통일할 수 있음)
//		Interface2 sinchon=new Sinchon();
//		Interface2 incheon=new Incheon();
//		
//		//기존방식(다형성 사용 X)
//		gangnam.make("아메리카노", 3000);
//		gangnam.make("꿀아메리카노", 3500);
//		gangnam.make("에스프레소", 2500);
//		gangnam.make("카페라떼", 4500);
//		gangnam.coffeList();
//		
//		incheon.make("바닐라라떼", 3500);
//		incheon.coffeList();
//		
//		sinchon.make("복숭아아이스티", 3000);
//		
//		System.out.print("구입할 커피를 입력하세요 >> ");
//		gangnam.sell(sc.next());
	}
}

class Gangnam implements Interface2 {
	String menu[]=new String[100];	//공간 먼저 만들어두기
	int priceList[]=new int [100];
	int end_idx=0;		
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		int index=-1;
		for(int i = 0; i<menu.length; i++) {
		if(coffee.equals(menu[i])) {
			index=i;
			break;		//커피를 찾으면 index에 백업하고 break;
			}
		}
		System.out.println("강남점 - "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목 + 가격을 메뉴에 추가
		menu[end_idx]=coffee;
		priceList[end_idx]=price;
		end_idx++;
		
		System.out.println("강남점 - 커피를 추가했습니다.");
		
	}

	@Override
	public void coffeList() {
		// 현재 커피 리스트와 가격 리스트를 출력
		// 에스프레소 : 2000원 ...
		System.out.println("<<<<<<<강남점>>>>>>>");
		for(int i = 0; i<end_idx; i++) {
			if(menu[i].equals(null)||menu[i].equals("")) {
				break;
			}
			System.out.println(menu[i]+": "+priceList[i]+"원");
		}
	}
	
}

class Sinchon implements Interface2 {
	String menu[]=new String[100];	//공간 먼저 만들어두기
	int priceList[]=new int [100];
	int end_idx=0;		
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		int index=-1;
		for(int i = 0; i<menu.length; i++) {
			if(coffee.equals(menu[i])) {
				index=i;
				break;		//커피를 찾으면 index에 백업
			}
		}
		System.out.println("신촌점 - "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다");
	}
	
	@Override
	public void make(String coffee, int price) {
		// 커피항목 + 가격을 메뉴에 추가
		menu[end_idx]=coffee;
		priceList[end_idx]=price;
		end_idx++;
		
		System.out.println("신촌점 - 커피를 추가했습니다.");
		
	}
	
	@Override
	public void coffeList() {
		// 현재 커피 리스트와 가격 리스트를 출력
		// 에스프레소 : 2000원 ...
		System.out.println("<<<<<<<신촌점>>>>>>>");
		for(int i = 0; i<end_idx; i++) {
			if(menu[i].equals(null)||menu[i].equals("")) {
				break;
			}
			System.out.println(menu[i]+": "+priceList[i]+"원");
		}
	}
	
}

class Incheon implements Interface2 {
	String menu[]=new String[100];	//공간 먼저 만들어두기
	int priceList[]=new int [100];
	int end_idx=0;		
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		int index=-1;
		for(int i = 0; i<menu.length; i++) {
			if(coffee.equals(menu[i])) {
				index=i;
				break;		//커피를 찾으면 index에 백업
			}
		}
		System.out.println("인천점 - "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다");
	}
	
	@Override
	public void make(String coffee, int price) {
		// 커피항목 + 가격을 메뉴에 추가
		menu[end_idx]=coffee;
		priceList[end_idx]=price;
		end_idx++;
		
		System.out.println("인천점 - 커피를 추가했습니다.");
		
	}
	
	@Override
	public void coffeList() {
		// 현재 커피 리스트와 가격 리스트를 출력
		// 에스프레소 : 2000원 ...
		System.out.println("<<<<<<<인천점>>>>>>>");
		for(int i = 0; i<end_idx; i++) {
			if(menu[i].equals(null)||menu[i].equals("")) {
				break;
			}
			System.out.println(menu[i]+": "+priceList[i]+"원");
		}
	}
	
}