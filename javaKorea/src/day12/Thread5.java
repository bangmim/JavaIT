//package day12;
//
//public class Thread5 {
//	public static void main(String[] args) {
//		//멀티쓰레드 환경에서
//		//우선순위 정하는 방법
//		//1. join() : 지금 실행중인 쓰레드 말고는 전부 대기
//		//2. setPriorityi() : 우선순위 정하기
//	
//		MyThread5 mt5 = new MyThread5();
//		MyThread5Ex mt5ex = new MyThread5Ex();
//		
//		mt5.start();
//		try {mt5.join();}	//join():나 말고 대기
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		mt5ex.start();		//대기중
//	}
//}
//
//class MyThread5 extends Thread{
//	public void run() {
//	for(int i=0; i<20; i++) {
//		Thread4.arr.add(""+i);
//		sleep(10);
//	}
//}
//}
//
//class MyThread5Ex extends Thread{
//	public void run() {
//		for (int j=0; j<10; j++) {
//			for(int i=0; i<Thread.arr.size();i++) {
//				System.out.print(Thread4.arr.get(i)+" ");
//			}		
//			System.out.println();
//			sleep(1000);
//		}
//		}
//}