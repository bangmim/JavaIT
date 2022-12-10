package day13;

public class Review {
	public static void main(String[] args) {
		// 컬렉션 : ArrayList, HashMap, Set
		// 쓰레드 : Thread, Runnable 상속받아 사용
		MyThread t1 = new MyThread();
		MyRunnable r1 = new MyRunnable();
		Thread t2 = new Thread(r1);
		
		t1.start();
		try {t1.join();} 
		catch (InterruptedException e) {
			e.printStackTrace();}
		t2.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		// 구현부
		System.out.println("여기있는 코드가 실행");
	}
	
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("인터페이스 재정의");
	}
	
}