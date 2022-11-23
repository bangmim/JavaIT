package day06;

import day01.Syso1;

//public class : 파일당 1개
public class Class10 {
	public static void main(String[] args) {
		//객체화
		MyClass10 mc=new MyClass10();
		mc.Hello();
		mc.setStr("name");
		
		mc.setStr1("My name is ");
		mc.setStr2("mihyun");
		
		mc.setNum1(-8);
		mc.setNum2(5);
		
		
		System.out.println(mc.getStr());
		System.out.println(mc.getStrSum());
		System.out.println(mc.getNum());
		
	}
}

class MyClass10{
	//#1 매개변수가 없고(파라미터가 없고) 리턴값이 없는 Hello World 출력하는 메서드
	public void Hello() {
		System.out.println("Hello World");
	}
	
	//#2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//#3 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return

	private String str1, str2;
	
	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStrSum() {
		return str1+str2;
	}
	/*
	 <강사님 답안>
	 
	 String quizw3(String str1, String str2){
	 return str1+str2;
	 
	 <객체화> 
	 String result3=mc.quiz3("My","Quiz");
	 		System.out.println(result3);
	 또는
	 		System.out.println(mc.quiz3("My","Quiz"));
	 */
	
	//#4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	private int num1, num2;


	public void setNum1(int num1) {
		this.num1 = num1;
		
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum() {	
		int sum;
		sum=num1+num2;
		
		if(num1<0) {
			return (num1 * -1)+num2;
		} else if(num2<0) {
			return (num2*-1)+num1;
		}
		return sum;
	}
	/*
	 <강사님답안>
	 int quiz4(int num1, int num2){
	 if(num1<0){
	 num1=num1 * -1;
	 }
	 if(num2<0){
	 num2=num2 * -1;
	 }
	 return num1 + num2;
	 
	 <객체화>
	 int result4=mc.quiz4(3,-4);
		System.out.println(result4);
		또는
		System.out.println(mc.quiz4(3,-4));
	 */
}
