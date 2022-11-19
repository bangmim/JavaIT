package day06;

import day01.Syso1;

public class Class11 {
	public static void main(String[] args) {
		Animal dog=new Animal("멍멍이",1,"강아지");
		Animal cat=new Animal("냥이",3,"고양이");
		
		dog.소개();//멍멍이의 나이는 1살이고 강아지입니다.
		cat.소개();	//냥이의 나이는 3살이고 고양이입니다.
		
		dog.먹이();	// 멍멍이가 밥을 먹습니다.
		cat.먹이();	//	냥이가 밥을 먹습니다.
		
		dog.소리();	// 강아지 울음소리 
		cat.소리();	// 고양이 울음소리
		
		
	}
}

class Animal{
	//멤버변수(private) : name, age, speciese 	//멤버변수 앞에는 private를 붙인다.
	private String name=null;
	private int age=0;
	private String speciese=null;
	
	Animal(String name, int age, String speciese) {
		this.name=name;
		this.age=age;
		this.speciese=speciese;
	}
		
	//메서드:소개, 먹기, 짖기
	public void 소개() {
		System.out.println(name+"이의 나이는 "+age+"살 이고 "+speciese+"입니다.");
	}

	public void 먹이() {
		System.out.println(name+"이가 밥을 먹습니다");
	}
	public void 소리() {
		System.out.println(speciese+"울음소리");
	}
}