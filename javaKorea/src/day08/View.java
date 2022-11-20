package day08;

//화면에 출력하는 부분
public class View {
	public static void main(String[] args) {
		Model model= new Model(3000, "아메리카노");	//Model 클래스에 있는 변수를 추가
		Model model2= new Model(4500, "카페라떼");	//Model 클래스에 있는 변수를 추가
		//model 변수에 3000, "아메리카노" 저장됨
		
		Controller con = new Controller(model2);
		
		//syso
		System.out.println(con.sell()+"를(을) 판매합니다.");
		System.out.println(con.info().getMenu()+"의 가격은 "+con.info().getPrice()+"원 입니다");
	}
}	//MVC패턴 (Model-View-Controller 코딩방식)

//흐름(로직)을 제어하는 부분  (로직을 작성하는 부분)
class Controller{
	Model model=new Model();		//비어있는 model
	
	//view에 있는 model에 있는 값 사용
	public Controller(Model model /*, int price, String menu*/){
		this.model.setPrice(model.getPrice());
		this.model.setMenu(model.getMenu());
	}
	
	public String sell() {
		return model.getMenu();
	}
	
	public Model info() {
		return model;
	}
}