package day12;

import java.util.ArrayList;

public class Thread4 {
	static ArrayList <String> arr = new ArrayList<>();
	public static void main(String[] args) {
		MyThread4 mt4 = new MyThread4();
		 MyTread4Ex mt4ex = new  MyTread4Ex();
		
		mt4.start();
		mt4ex.start();
	}
}

class MyThread4 extends Thread{
	public void run() {
		for(int i=0; i<20; i++) {
			Thread4.arr.add(""+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyTread4Ex extends Thread{
	public void run() {
	for (int j=0; j<10; j++) {
//		for(int i=0; i< Thread.arr.size();i++) {
//			System.out.print(Thread4.arr.get(i)+" ");
//		}		
		System.out.println();
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}