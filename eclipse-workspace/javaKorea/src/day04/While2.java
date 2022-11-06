package day04;

public class While2 {
	public static void main(String[] args) {
		//구조 : while (){}
		//원하는 횟수 만큼만 실행하도록 '플래그'를 세운다.
		//횟수를 카운팅 할 수 있는 플래그(기준점)
		int i=0;
		while(i != 19) {	//i=0,1 2회만 실행된다.
			System.out.println("Hello");
			i++;		//반복문을 한번 실행할 때 마다 플래그를 1씩 증가시킨다. (횟수 카운팅)
		}
	}
}
