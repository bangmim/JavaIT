package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL3 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		URL url = null;
		String str = null;
		String myWord = null;
		// 특정 페이지에서 원하는 문자열만 가져와서 출력하기
		
		try {
			url = new URL("https://movie.naver.com/movie/sdb/rank/rpeople.naver");
			is = url.openStream();
			isr= new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			System.out.println("<<<영화인 순위>>>");
			while((str = br.readLine()) != null) {
				if((str.contains("title"))&&(str.contains("<td"))) {
//					System.out.println(str);
					String parse = str.substring(str.indexOf("<td class=\"title\"><a href=\"/movie/bi/pi/basic.naver?st=1&code=")+61);
//					System.out.println(parse);
					myWord = parse.substring(parse.indexOf(">")+1, parse.indexOf("</a"));
					System.out.println(myWord);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

