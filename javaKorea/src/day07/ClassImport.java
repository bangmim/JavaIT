package day07;

public class ClassImport {
	//접근권한제어자 -> 캡슐화
	//멤버변수(class 안의 변수)는 private, 메서드는 public
	
	private String str;
	private int num;
	
	//생성자:객체화할 때 사용되는 메서드
	//생성자의 이름은 클래스명과 같다
	ClassImport(){
		System.out.println("객체화 성공!");
	}

	public String getStr() {			//get : 변수를 직접 사용하지 말고, 이 메서드를 사용해라
		return str;
	}

	public void setStr(String str) {	//set : 변수에 값을 대입할 때 이 메서드를 통해 사용해라
		this.str = str;
	}
	
	//Q.int num의 getter와 setter를 직접 만들어보세요.
	public int Num (int num) {
		this.num=num;
		return num;
	}
	
//	 강사님 답안
	 public int getNum(){
	 	return num;
	 	}
	 public void setNum(int num){
	 	this.num=num;
	 	}
	 
	
	
}
