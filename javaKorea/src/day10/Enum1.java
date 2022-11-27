package day10;

import day10.Student2.SchoolType;

public class Enum1 {
	public static void main(String[] args) {
		Student1 std1 = new Student1(0);
		Student1 std2 = new Student1(2);	//세월이 지나거나, 다른사람이 볼 때 ==> 쉽게 알 수가 없음(메모 분실하면 큰일난다)
		std1.go();
		std2.go();
		
		Student2 std3 = new Student2(SchoolType.초등학교);
		Student2 std4 = new Student2(SchoolType.대학교);
		std3.go();
		std4.go();
		
		MyType[] type = MyType.values();		//[타입1][타입2][타입3][타입4]
		for (int i=0; i<type.length; i++) {
			System.out.println(type[i]+", 번호는 "+type[i].ordinal());	//이름 출력할 때에는 .name() 안써도 된다.
			System.out.println(type[i].name()+", 번호는 "+type[i].ordinal());	//이름 출력할 때에는 .name() 안써도 된다.
		}
	
		//빠른 for문
		for(MyType t: type) {
			//t==type[i]
			System.out.println(t.name()+", 번호는 "+t.ordinal());
			System.out.println(t+", 번호는 "+t.ordinal());
		}
	}
}

class Student1{
	//0 : 초등학교, 1: 중학교, 2: 고등학교, 3: 대학교
	private int SchoolType;
	
	Student1(int num){
		SchoolType=num;
	}
	
	public void go() {
		if(SchoolType==0) {
			System.out.println("초등학생");
		}else if(SchoolType==1) {
			System.out.println("중학생");
		}else if(SchoolType==2) {
			System.out.println("고등학생");
		}else if(SchoolType==3) {
			System.out.println("대학생");
		}
	}
}

//class 밖에서도 만들 수 있다.
//숫자로 쓰면 나중에 알기 힘들 수 있어 이름을 준다.
enum MyType{	
	타입1, 타입2, 타입3, 타입4
}

class Student2{
	enum SchoolType{
		초등학교, 중학교, 고등학교, 대학교
		//초등학교 == 0, 중학교 == 1, 고등학교 == 2, 대학교 == 3 (자동설정된다)
	}

	SchoolType school;
	public Student2(SchoolType school) {
		this.school=school;
	}
	
	public void go() {
		if(school == SchoolType.초등학교) {
			System.out.println("초등학생");
		}else if(school == SchoolType.중학교) {
			System.out.println("중학생");
		}else if(school == SchoolType.고등학교) {
			System.out.println("고등학생");
		}else if(school == SchoolType.대학교) {
			System.out.println("대학생");
		}
	}
	
}