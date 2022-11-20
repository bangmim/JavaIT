package day08;

//데이터(변수)를 저장하는 부분
//View(class controller 포함) + Model --> MVC패턴 방법
public class Model {
	private int price;
	private String menu;

	//기본생성자
	public Model() {}
	
	//우클릭 Source > Generate Constructor using Field
	public Model(int price, String menu) {
		super();
		this.price = price;
		this.menu = menu;
	}

	//게터세터 (우클릭 Source>Generate Getter and Setter)
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
