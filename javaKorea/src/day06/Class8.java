package day06;

public class Class8 {
	public static void main(String[] args) {
		Person ps=new Person("홍길동", 30, "남", 167.8);
		Person ps1=new Person("이순신", 23, "여", 175.3);
		//해당 클래스 사용을 위해서 먼저 해줘야 하는 작업을 문법으로 만듦 (생성자)
		ps.personInfo();
		ps.정보보기();
		
	}
}

class Person{
	//이름, 나이, 성별, 키
	String name;
	int age;
	String gender;
	double height;
	
	//생성자의 이름은 클래스의 이름과 같다. 자료형이 없다
	Person(String name, int age, String gender, double height){
		setInfo(name, age, gender, height);
//		//setInfo 없는 경우
//		this.name=name;
//		this.age=age;
//		this.gender=gender;
//		this.height=height;
	}
	

	
	//정보보기(이름, 나이, 성별 ,키 출력)
	public void setInfo(String name, int age, String gender, double height) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		
		System.out.println("이름 : "+name+", 나이 : "+age+", 성별 : "+gender+", 키 : "+height+"cm");
	}
	
	//강사님 답안
	 public void 정보보기() {
		 System.out.println("이름: "+name+"나이: "+age+" 성별: "+gender+" 키: "+height);
	 }
	
	//인사하기(예:홍길동이 인사합니다)
	public void personInfo() {
		System.out.println(name+"이 인사합니다");
	}
}
