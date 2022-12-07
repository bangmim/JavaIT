package day12;

public class Runnable1 {
	public static void main(String[] args) {
		// 스레드 추가 생성법 1 : Thread를 상속한다.
		// 스레드 추가 생성법 2 : Runnable을 상속하고, 사용하는 곳에서 Thread를 객체화한다.
		
		MyRunnable1 mr1 = new MyRunnable1();	//1 객체화
		Thread t1 = new Thread(mr1);			//2 스레드 생성 > 인자로 넘기기
		t1.start();								//3 스레드 start();
		
		MyThread7 mt7 = new MyThread7();
		mt7.start();
		
	}
}

class ex1{
	
}

// 자바 : 다중상속 불가능 (이미 다른것을 상속을 받고 있으면 Thread 상속이 불가능)
// >>implements Runnable 사용한다
class MyRunnable1 extends ex1 implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.print(i+" ");
			try {Thread.sleep(100);} 
			catch (InterruptedException e) {
				e.printStackTrace();}
		}
	}
	
}

class MyThread7 extends Thread{
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.print(i+" ");
			try {Thread.sleep(1100);} 
			catch (InterruptedException e) {
				e.printStackTrace();}
		}
	}
}
