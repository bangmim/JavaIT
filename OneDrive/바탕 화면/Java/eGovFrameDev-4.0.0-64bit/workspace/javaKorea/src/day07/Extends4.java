package day07;

public class Extends4 {
	public static void main(String[] args) {
		Human hm = new Human("휴면",22);
		//사람 정보 출력
		System.out.println("이름:"+hm.getName()+", 나이:"+hm.getAge());

		Member mb=new Member("멤버",13,111);
		//회원 정보 출력
		
		mb.memberInfo();
	}
}

//클래스 :사람
//이름, 나이
//생성자를 통해 정보입력
//게터세터 이용
class Human{
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
}




//클래스 : 회원
//+회원번호
//생성자를 통해서 정보를 입력
//회원번호 게터세터
//+회원소개
class Member extends Human{
	private int memNo;
	public Member(String name, int age, int memNo){
		super(name,age);		//부모의 생성자를 사용
		this.memNo=memNo;	
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo=memNo;
	}
	public void memberInfo() {
		System.out.println("이름:"+super.getName()+", 나이:"+this.getAge()+", 회원번호:"+this.getMemNo());
	}
}