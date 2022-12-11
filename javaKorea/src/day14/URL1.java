package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL1 {
	public static void main(String[] args) {
		// Stream : 데이터를 주고 받는 것 (input, output)
		// Socket : 네트워크 통신을 위해 제공되는 라이브러리 -> 자바에서는 클래스로 제공되어 사용할 수 있다.
		// URL : UDP통신
		
		// 대표적인 통신 방식
		// TCP/IP : 먼저 서로 연결을 하고 메시지를 주고받는다 (일반적으로 많이 쓰인다.) ,Socket
		// UDP : 받든 말든 상관없이 일단 보낸다. (방송, 브로드캐스트), 연결유지 X, DatagramSocket
		// HTTP : 웹 전용 통신, 연결유지X, URL
		// Serial : 가까운 장비간 통신
		// RestAPI : HTTP통신에서 정해진 규격에 맞춰 통신하는 관례
		
		MyURL url = new MyURL();
		// URL 클래스의 생성자에 넣을 url // 해당 페이지의 http 코드를 가져온다
		url.go("https://movie.naver.com/movie/sdb/rank/rmovie.naver");			
	}
}

class MyURL{
	// 바로 객체화하지 않는 이유 : try/catch에서 사용할 것이기 때문
	InputStream is = null;			// 내 프로그램이 데이터를 가져올 때에는 InputSTream
	InputStreamReader isr = null;	// UTF-8로 맞추기 위해 필요
	BufferedReader br = null;		// 문자열로 바꾸기 위해 버퍼단위로 읽음
	
	URL url = null;					// HTTP 통신
	String str = null;
	
	public void go(String address) {
		
		try {
			// HTTP 통신 (41~49)
			url = new URL(address);		// 해당 웹페이지로 접근
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader (isr);

			// 버퍼리더를 문자열로 변경 (한줄씩 줄을 바꾸면서)
			while((str = br.readLine()) != null) {	// 줄에 문자가 없으면 break;
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {	// 과부하 방지 위해 해제할 수 있는 프로그램은 해제해줘야 한다.
			try {
				is.close();
				br.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}