package day07;

public class Extends4 {
	public static void main(String[] args) {
		//사람정보 출력
		Human 사랑해 = new Human("사랑해", 3);
		System.out.println("이름 : "+사랑해.getName()+", 나이 : "+사랑해.getAge());
		
		//회원정보 출력
		Member 김가나=new Member("김가나", 35, 98229);
		김가나.소개();
		System.out.println("이름 : "+김가나.getName()+", 나이 : "+김가나.getAge()+", 회원번호 : "+김가나.getNumber());
		
	}
}

//클래스 :사람
//이름, 나이
//생성자를 통해 정보입력
//게터세터 이용
class Human{
	protected String name;
	protected int age;
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("<<사람 정보>> 사람의 이름은 "+name+"이고, 나이는 "+age+"살 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


//클래스 : 회원
//+회원번호
//생성자를 통해서 정보를 입력		//생성자에도 public 사용
//회원번호 게터세터
//+회원소개

class Member extends Human{
private int number;

	public Member(String name, int age, int number) {
		super(name, age);		//부모 생성자를 사용
		this.number=number;
	}
	
	public void 소개() {
		System.out.println("<<회원 정보>> 회원의 이름은 "
	+name+"이고, 나이는 "+age+"살 이고, 회원번호는 "+number+" 입니다.");
	}
	/*
	 Human에서 protected가 아닌 private로 변수를 제공했을 경우
	 
	 <private String name;
	 private int age;>
	 
	 public void 소개(){
	 	System.out.println("<<회원 정보>> 회원의 이름은 "
	 	+this.getName()+"이고, 나이는 "+this.getAge()+
	 	"살 이고, 회원번호는 "+number+" 입니다.");
	 }
	 name,age는 this.getName(), this.getAge(); 형식으로 작성해야한다.
	 */

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
