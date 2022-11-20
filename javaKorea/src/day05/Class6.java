package day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신=new Person();
		
		홍길동.name="홍길동";
		홍길동.age=24;
		홍길동.gender="남";
		홍길동.height=179.2;
		
		이순신.name="이순신";
		이순신.age=43;
		이순신.gender="여";
		이순신.height=198.2;
		
		홍길동.personInfo();
		이순신.personInfo();
		
		홍길동.setInfo("홍길동", 26, "남", 178.2);
		이순신.setInfo("이순신", 43, "여", 159.8);
		
		홍길동.정보보기();
		이순신.정보보기();
	}
}

class Person{
	//이름, 나이, 성별, 키
	String name;
	int age;
	String gender;
	double height;
	
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
		 System.out.println("이름: "+name+"나이: "+age+"성별: "+gender+"키: "+height);
	 }
	
	//인사하기(예:홍길동이 인사합니다)
	public void personInfo() {
		System.out.println(name+"이 인사합니다");
	}
}
