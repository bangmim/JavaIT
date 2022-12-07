package day12;

public class Thread6 {
	public static void main(String[] args) {
		MyThread6 mt6 = new MyThread6();
		MyThread6Ex mt6ex = new MyThread6Ex("first");
		MyThread6Ex mt6ex2 = new MyThread6Ex("second");
		
		mt6ex.setPriority(Thread.MAX_PRIORITY);		//최고 우선순위 쓰레드
		mt6ex2.setPriority(Thread.MIN_PRIORITY);	//최저 우선순위 쓰레드
	
		mt6.start();
		try {mt6.join();} 
		catch (InterruptedException e) {
			e.printStackTrace();}
		mt6ex2.start();		//코드를 먼저 작성해도 가능하면 setPriority 순서대로 적용한다.
		mt6ex.start();
	}
}

class MyThread6 extends Thread{
	@Override
	public void run() {
		go();
	}
	
	//0.5초에 한번씩 add (총 20번)
	public void go() {
			for(int i=0; i<20; i++) {
				Thread4.arr.add(" "+i);
			}		
	}
}

class MyThread6Ex extends Thread{
	
	public MyThread6Ex(String name) {
		currentThread().setName(name);
	}
	
	@Override
	public void run() {
		go();
	}
	//1초에 한번씩 전체 조회(총 10번)
	public void go() {
		
	//10번 조회
	for(int j=0; j<10; j++) {
		System.out.print(currentThread().getName()+"");
		//한번 전체 조회
		for(int i =0; i<Thread4.arr.size(); i++) {
			System.out.print(" "+Thread4.arr.get(i));
		}
		System.out.println();
		
	}
	}
}