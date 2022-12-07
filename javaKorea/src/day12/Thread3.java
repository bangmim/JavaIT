package day12;

public class Thread3 {
	public static void main(String[] args) {
		// 가정 : 캐릭터가 움직이면서 배경음악은 재생되고 있음
		MyThread3 mt3 = new MyThread3();
		MyThread3Bgm bgm = new MyThread3Bgm();
		
		// run 메서드 실행 >> 멀티Thread로 인해 프로그램이 동시에 진행될 수 있다.
		mt3.start();
		bgm.start();
		
	}
}

class MyThread3 extends Thread{
	// 캐릭터 동작
	@Override
	public void run() {
		go();		
	}
	
	public void go() {
		for (int i = 0; i <10; i++) {
			System.out.println("캐릭터 동작중");
			try {sleep(1000);} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class MyThread3Bgm extends Thread{
	// 배경음악 담당
	@Override
	public void run() {
		go();		
	}
	
	public void go() {
		for(int i=0; i<20; i++) {
			System.out.println("배경음악 재생중");
			try {sleep(500);} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}