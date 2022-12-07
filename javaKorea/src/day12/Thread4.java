package day12;

import java.util.ArrayList;

public class Thread4 {
	static ArrayList<String> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		MyThread4 mt4 = new MyThread4();
		MyThread4Ex mt4ex = new MyThread4Ex();
		
		mt4.start();
		mt4ex.start();
	}
}

class MyThread4 extends Thread{
	@Override
	public void run() {
		go();
	}
	
	//0.5초에 한번씩 add (총 20번)
	public void go() {
		//static은 객체화 없이 바로 사용이 가능하다 >> static이 있는 className.arrayName.메서드
			for(int i=0; i<20; i++) {
				Thread4.arr.add(" "+i);
				try {
					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
	}
	
}

class MyThread4Ex extends Thread{
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
		//한번 조회 1초 sleep
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	}
}