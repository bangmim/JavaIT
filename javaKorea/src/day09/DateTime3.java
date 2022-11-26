package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime3 {
	public static void main(String[] args) {
		MyTimer3 myTimer3 = new MyTimer3();
		myTimer3.go();
	}
}

// 
class MyTimer3{
	
	public void go() {
		
		Calendar c = Calendar.getInstance();
		Date date= c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 ");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
		String year = sdf.format(date);
		String month = sdf1.format(date);
		String day= sdf2.format(date);
		
		int tomorrow=Integer.parseInt(day)+1;
		
		int tMonth = Integer.parseInt(month)+1;
		
		System.out.println(year);
		System.out.println(month+"월");
		System.out.println("내일은 "+ year+month+"월 "+ tomorrow+"일 입니다.");

		
		
	}
	
}
