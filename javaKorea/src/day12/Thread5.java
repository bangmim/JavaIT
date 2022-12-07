package day12;

public class Thread5 {
	public static void main(String[] args) {
		// 멀티 쓰레드
		// 우선순위 정하는 방법
		// (1) join() : 지금 실행중인 쓰레드 말고 전부 대기
		// (2) setPriority() : 우선순위 정하기
		
		MyThread5 mt5 = new MyThread5();
		MyThread5Ex mt5ex = new MyThread5Ex();
		
		mt5.start();
		try {mt5.join();} 			// join() : 나 말고 대기
		catch (InterruptedException e) {
			e.printStackTrace();}
		
		System.out.println("----------");	//join 끝날 때 까지 대기
		mt5ex.start();						//join 끝날 때 까지 대기
		
	}
}

class MyThread5 extends Thread{
	@Override
	public void run() {
		go();
	}
	
	//0.5초에 한번씩 add (총 20번)
	public void go() {
		//static은 객체화 없이 바로 사용이 가능하다 >> static이 있는 className.arrayName.메서드
			for(int i=0; i<20; i++) {
				Thread4.arr.add(" "+i);
				try {sleep(10);} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
	}
}

class MyThread5Ex extends Thread{
	@Override
	public void run() {
		go();
	}
	//1초에 한번씩 전체 조회(총 10번)
	public void go() {
		
	//10번 조회
	for(int j=0; j<10; j++) {
		//한번 전체 조회
		for(int i =0; i<Thread4.arr.size(); i++) {
			System.out.print(" "+Thread4.arr.get(i));
		}
		System.out.println();	
	}
	}
}
