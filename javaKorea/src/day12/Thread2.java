package day12;

public class Thread2 {
	public static void main(String[] args) {
		//Thread 추가는 main에서 한다.
		MyThread2 mt2 = new MyThread2();	//Thread 추가 1
		MyThread2 mt22 = new MyThread2();	//Thread 추가 2
		
		// 추가된 Thread는 start 메서드로 실행한다. (run에 적은 코드는 start로 실행)
		mt2.start();
		mt22.start();
	}
}

// Thread를 추가하고 싶다면 Thread를 상속받으면 된다. >> 클래스에 extend Thread
class MyThread2 extends Thread{
	// Thread의 코드는 run에 구현한다
	// run (Ctrl+space+enter)
	@Override 
	public void run() {
		// 추가된 쓰레드는 run() 메서드를 main으로 가진다.
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {sleep(1000);} 
			catch (InterruptedException e) {
				e.printStackTrace();}
		}
	}
}