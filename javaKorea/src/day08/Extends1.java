package day08;

public class Extends1 {
	public static void main(String[] args) {
		StarBupyeong sb= new StarBupyeong("아메리카노",3500);
		StarBupyeong sb2= new StarBupyeong("카페라떼",4500);
//		
		sb.sellInfo();
		sb.setInfo();
		sb2.sellInfo();
		sb2.setInfo();
	
	}
}

//1. 상속용, 2. 모든 메서드가 재정의되어야 함, 3. 명세서 (기본 툴 제공)	 ===> Interface : 명세서대로 안하면 오류발생(누락방지)

class Star{
	//본사 : 스타벅스가 갖춰야할 기본 데이터(=>변수)와 기능(=>함수)
	protected int price;
	protected String menu;
	
	//생성자로 가격, 메뉴 정하기
	Star(String menu, int price){
		this.menu=menu;
		this.price=price;
	}
	
	//oo을 판매합니다.
//	public void sellInfo(){
//		System.out.println(this.menu+"를 판매합니다");
//	}
	//또는 (return 사용)
	public String sellInfo(){
		System.out.println(this.menu+"를 판매합니다");
		return this.menu;
	}
	
	//oo의 가격은 oo입니다.
	public void setInfo() {
		System.out.println(this.menu+"의 가격은 "+this.price+"입니다");
	}
	//또는
//	public Star String info() {
//		System.out.println(this.menu+"의 가격은 "+this.price+"입니다");
//		return this;
//	}
	
}

class StarBupyeong extends Star{
	//부평점 : 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
	public StarBupyeong(String menu, int price){
		super(menu,price);
	}
	
	//생성자로 가격, 메뉴 재정의하기
//	private int price;
//	private String menu;
	
	//부평점 - oo를 판매합니다.
	public String sellInfo() {
		System.out.println("부평점 "+this.menu+"를 판매합니다");
		return menu;
	}
	
	//부평점- oo의 가격은 oo입니다.
	public void setInfo() {

		System.out.println("부평점 "+this.menu+"의 가격은 "+this.price+"입니다");
	}
}
//인터페이스를 상속받을 때는 extends 아닌 implements 사용
class StarGangnam implements Star2{
	int price;
	String menu;
	
	public StarGangnam(String menu, int price) {
		this.menu=menu;
		this.price=price;
	}
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("강남점 - "+menu+"를 판매합니다");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("강남점 - "+menu+"의 가격은 "+price+" 입니다");
	}
}

interface AA{
	
}
//다중 상속 가능
class SS extends Star implements AA, Star2{

	SS(String menu, int price) {
		super(menu, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
}


// 아래는 불가능
//class SS extends Star, Review{
//	
//}