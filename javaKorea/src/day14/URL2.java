package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class URL2 {
	public static void main(String[] args) {
		MyURLEx m = new MyURLEx();
		m.go("https://movie.naver.com/movie/sdb/rank/rmovie.naver");
	}
}


class MyURLEx{
	// 바로 객체화하지 않는 이유 : try/catch에서 사용할 것이기 때문
	InputStream is = null;			// 내 프로그램이 데이터를 가져올 때에는 InputSTream
	InputStreamReader isr = null;	// UTF-8로 맞추기 위해 필요
	BufferedReader br = null;		// 문자열로 바꾸기 위해 버퍼단위로 읽음
	
	URL url = null;					// HTTP 통신
	String str = null;
	ArrayList<String> parseArray = new ArrayList<>();
		
	public void go(String address) {
		
		try {
			url = new URL(address);		// 해당 웹페이지로 접근
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader (isr);

			while((str = br.readLine()) != null) {	// br.readLine() : 한 줄씩 읽기
			// 버퍼리더를 문자열로 변경 (한줄씩 줄을 바꾸면서)
//				System.out.println(str);
				
				// 내가 원하는 문자열을 찾는다	(html 코드를 보고 작성해야한다)
				if(str.contains("<a href=\"/movie/bi/mi/basic.naver?code=")&&!(str.contains("onclick"))) {
					String parse = str.substring(str.indexOf("title=")+7, str.indexOf("\">"));	// 내가 원하는 문자열을 가져오기 위해 자를 부분
					parseArray.add(parse);		// 파싱한 데이터를 ArrayList에 저장
//					System.out.println(str);
					
				}
			}
		} catch (Exception e) {	// catch 범위를 Exception으로 바꾸면 넓은 범위로 error 커버가 가능하다
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
		
		// ArrayList에 저장된 데이터를 모두 출력
		for(int i=0; i<parseArray.size(); i++) {
			System.out.println((i+1)+"위. "+parseArray.get(i));
		}
		
	}
}