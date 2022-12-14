package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime2 {
	public static void main(String[] args) {
		MyTimer2 myTimer2 = new MyTimer2();
		myTimer2.go();
	
	}
}

class MyTimer2{
	public void go() {
		while(true) {
			curTime();
			try {
				Thread.sleep(1000);		//1000ms 동안 중지 => 1초마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void curTime() {	//현재시간
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();			//현재 시간을 얻음
		
		SimpleDateFormat sdf = new SimpleDateFormat("`yy.MM.dd. - HH:mm:ss");	// ` : 생략 표시
		String cur_time=sdf.format(date);	//형식 재구성
		
		System.out.println(cur_time);
		
	}
	
	
	
}