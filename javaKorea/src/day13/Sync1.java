package day13;

public class Sync1 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		Thread t1 = new Thread(toilet,"홍길동");
		Thread t2 = new Thread(toilet,"임꺽정");		// 하나의 클래스를 두 쓰레드가 공유할 때는 '동기화'
		
		t1.start();
		t2.start();
	}
}

class Toilet implements Runnable{
	private int time;
	@Override
	public void run() { 
		synchronized (this) {		//mutex : 어떤 것을 동기화? >> this : 해당 클래스(toilet)를 사용하는 것 모두
			time = 0;
			System.out.println("화장실 들어감");
			while(time<5) {
				try {Thread.sleep(1000);} 
				catch (InterruptedException e) {
					e.printStackTrace();}
				time ++;
				System.out.println(Thread.currentThread().getName()+" 화장실 사용 중 ..."+time+"초");
			}
			System.out.println("화장실 비움");
		}
	}
	
}