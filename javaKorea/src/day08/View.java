package day08;

// # MVC패턴 (Model-View-Controller 코딩방식)

//화면에 출력하는 부분
public class View {
	public static void main(String[] args) {
		Model model = new Model(3000, "아메리카노");		//Model 클래스에 있는 변수를 추가한다.
		Model model1 = new Model(4500, "카페라떼");		//Model 클래스에 있는 변수를 추가한다.
		//model 변수에 3000, "아메리카노" 저장되었다.
		
		Controller con = new Controller(model);		//모델에 저장된 내용을 controller로 넘겼다.
		Controller con1 = new Controller(model1);		//모델에 저장된 내용을 controller로 넘겼다.
		
		//syso 화면 출력
		System.out.println(con.sell()+"를 판매합니다.");
		System.out.println(con1.sell()+"를 판매합니다.");
		System.out.println(con.info().getMenu()+"의 가격은 "+con.info().getPrice()+"원 입니다.");
		System.out.println(con1.info().getMenu()+"의 가격은 "+con1.info().getPrice()+"원 입니다.");
	}
}	

//흐름(로직)을 제어하는 부분  (로직을 작성하는 부분)
class Controller{
	//비어있는 model
	Model model = new Model();
	
	//view로 받은 model
	public Controller(Model model  /*, == int price, String menu*/ ){		//model에 있는 변수를 가지고 왔기 때문에 int price, String menu 대신 Model 변수 하나로 사용할 수 있다.
		this.model.setPrice(model.getPrice());
		this.model.setMenu(model.getMenu());
		
	}
	
	//String : class 형태의 자료형
	public String sell() {
		return model.getMenu();
	}
	
	//
	public Model info() {
		return model;
	}
	
}