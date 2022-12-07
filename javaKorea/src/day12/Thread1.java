package day12;

public class Thread1 {
	public static void main(String[] args) {
		// # 면접
		// 배열 사용법 
		// 오버로딩과 오버라이딩의 차이
		// 컬렉션 List, Set, Map의 차이
		// 프로세스와 쓰레드의 차이
		
		// 프로그램 : 운영체제에 설치된 처리방법과 순서가 기술된 명령문의 집합체(예 .exe : 실행파일)
		// 프로세스 : 컴퓨터에서 연속적으로 실행중인 프로그램
		// 쓰레드(Thread) : 프로세스 내에서 실제로 작업을 수행하는 주체
		
		// main() : 주쓰레드
		// 목표 : 쓰레드를 추가하고 다루는 방법
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {
				e.printStackTrace();}		//1000ms 동안 쓰레드 중지
		}
		
	}
}

// main에 있는 것만 실행된다. >> 스레드가 main에만 있기 떄문
class MyThread1{
	public void go() {
		System.out.println("실행!");
	}
}


