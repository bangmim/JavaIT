package day08;

//데이터(변수)를 저장하는 부분
//View(class controller 포함) + Model --> MVC패턴 방법

public class Model {
	
	private int price;
	private String menu;
	
	//기본생성자 만들기
	public Model() {}
	
	//변수를 사용한 생성자 만들기 : 우클릭 Source > Generate Constructor using Fields
	public Model(int price, String menu) {
		super();
		this.price = price;
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
}
