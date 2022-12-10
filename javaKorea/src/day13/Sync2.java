package day13;

public class Sync2 {
	public static void main(String[] args) {
		Room room = new Room();
		Thread t1 = new Thread(room,"사람1");
		Thread t2 = new Thread(room,"사람2");
		Thread t3 = new Thread(room,"사람3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

// 의상실
// 한 사람이 사용중이면 다른 사람은 대기
class Room implements Runnable{
private int time;
	@Override
	public void run() {
		synchronized (this) {	
			time=0;
			System.out.println(Thread.currentThread().getName()+" 의상실 들어감");
			while(time<5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				time++;	//초를 먼저 ++ 하면 0초가 아닌 1초부터 시작한다
				System.out.println(Thread.currentThread().getName()+" 옷을 갈아입는 중 ..."+time+"초");
			}
			System.out.println(Thread.currentThread().getName()+" 의상실 나옴");
		}
	}
	
	
}