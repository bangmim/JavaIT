package day12;

public class Thread6 {
	public static void main(String[] args) {
		MyThread6 mt6 = new MyThread6();
		MyThread6Ex mt6ex = new MyThread6Ex("first");
		MyThread6Ex mt6ex2 = new MyThread6Ex("second");
		
		mt6ex.setPriority(Thread.MAX_PRIORITY);		//최고 우선순위
		mt6ex2.setPriority(Thread.MIN_PRIORITY);	//최저 우선순위
		
		mt6.start();
		
		try {
			mt6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mt6ex.start();
		mt6ex2.start();
	}
}

class MyThread6 extends Thread{
	
	
}

class MyThread6Ex extends Thread{
	
	MyThread6Ex(String name){
		currentThread().setName(name);
	}
	
	public void run() {
		for(int j=0; j<10; j++) {
			System.out.print(currentThread().getName()+":");
		}
	}
	
}
