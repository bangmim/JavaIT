package day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 mst4 = new MyString4();
		mst4.go();
	}
}

class MyString4{
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println(won());
	}

	public String won() {
		//정수를 입력받아 천원 단위로 ,를 찍어 출력
		//5000000->5,000,000
		System.out.println("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		String result="";
		result=Integer.toString(num);
		
		if(num>1000 && num<10000) {
			String str1=result.substring(0,1);
			String str2=result.substring(1,4);
			result=str1+","+str2;
		}else if(num>10000 && num<100000) {
			String str1=result.substring(0,2);
			String str2=result.substring(2,5);
			result=str1+","+str2;
		}else if(num>100000 && num<1000000) {
			String str1=result.substring(0,3);
			String str2=result.substring(3,6);
			result=str1+","+str2;
		}else if(num>1000000 && num<10000000) {
			String str1=result.substring(0,1);
			String str2=result.substring(1,4);
			String str3=result.substring(4,7);
			result=str1+","+str2+","+str3;
		}else if(num>10000000 && num<100000000) {
			String str1=result.substring(0,2);
			String str2=result.substring(2,5);
			String str3=result.substring(5,8);
			result=str1+","+str2+","+str3;
		}else if(num>100000000 && num<1000000000) {
			String str1=result.substring(0,3);
			String str2=result.substring(3,6);
			String str3=result.substring(6,9);
			result=str1+","+str2+","+str3;
		}else{
			//int의 범위가 제한되어있다(21억4천 7백만 이하)
			String str1=result.substring(0,1);
			String str2=result.substring(1,4);
			String str3=result.substring(4,7);
			String str4=result.substring(7,10);
			result=str1+","+str2+","+str3+","+str4;
		}
		
		/*다른 방법*/
		int result_len=result.length();
		String parse1, parse2,parse3, parse4;
		switch(result_len) {
		case 4:
			//9999
			parse1=result.substring(1, 4);
			parse2=result.substring(0, 1);
			result=parse2+","+parse1;
			break;
		case 5:
			parse1=result.substring(2, 5);
			parse2=result.substring(0, 2);
			result=parse2+","+parse1;
			break;
		case 6:
			parse1=result.substring(3, 6);
			parse2=result.substring(0, 3);
			result=parse2+","+parse1;
			break;
		case 7:
			parse1=result.substring(4, 7);
			parse2=result.substring(1, 4);
			parse3=result.substring(0, 1);
			result=parse3+","+parse2+","+parse1;
			break;
		case 8:
			parse1=result.substring(5, 8);
			parse2=result.substring(2, 5);
			parse3=result.substring(0, 2);
			result=parse3+","+parse2+","+parse1;
			break;
		case 9:
			parse1=result.substring(6, 9);
			parse2=result.substring(3, 6);
			parse3=result.substring(0, 3);
			result=parse3+","+parse2+","+parse1;
			break;
		case 10:
			parse1=result.substring(7, 10);
			parse2=result.substring(4, 7);
			parse3=result.substring(1, 4);
			parse4=result.substring(0, 1);
			result=parse4+","+parse3+","+parse2+","+parse1;
			break;
		}
		
		return result;
	}
}
