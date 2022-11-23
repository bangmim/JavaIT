package day06;

public class Class11 {
	public static void main(String[] args) {
		Animal dog=new Animal("멍멍이",7,"강아지", "멍멍");
		Animal cat=new Animal("냥이",3,"고양이", "야옹");
		dog.소개();
		dog.먹이();
		dog.소리();
		
		cat.소개();
		cat.먹이();
		cat.소리();
		
	}
	
}

class Animal{
	//멤버변수:name, age, type
	private String name;
	private int age;
	private String type;
	private String sound;
	
	Animal(String name, int age, String type, String sound){
		this.name=name;
		this.age=age;
		this.type=type;
		this.sound=sound;
	}

	//메서드:소개, 먹이, 소리
	public void 소개() {
		System.out.println(name+"의 나이는 "+age+"살 이고, "+type+"입니다.");
	}
	public void 먹이() {
		System.out.println(name+"가 밥을 먹습니다");
	}
	public void 소리() {
		System.out.println("<<< "+type+" 울음소리 >>>");
		System.out.println(name+"는 "+sound+" 하고 소리를 냅니다");
	}
	
}