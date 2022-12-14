package day13;

import java.io.File;

public class Stream1 {
	public static void main(String[] args) {
		// Stream : 강, 흐름
		// 데이터를 주고받는 행위를 빗대어 표현했다. (메시지, 파일, ... 데이터를 주고받는 행위)
		
		FileFound ff = new FileFound();
		ff.go("c:\\");		// C:\
		// \\ 2번하는 이유 : 문자열에서 특정 기호르 사용하기 위해서는 앞에 \ 표시를 해줘야 한다.
		// 예) \',  \",  \\,  \n,  \t
		
	}
}

class FileFound {
	public void go(String path) {
		System.out.println(path+" 안에 있는 파일 검색");
		File file = new File(path);		// File 클래스에 경로를 넘겨준다. 
		String[] file_list = file.list();	// 모든 파일 목록 배열로 저장
		
		// 가져온 파일 목록을 반복문을 통해 하나씩 보여주기
		for(int i=0; i<file_list.length; i++) {
			System.out.println((i+1)+"."+file_list[i]);
		}
		
		// 빠른 for문 (python 형태의 for문)
		System.out.println("============python 형태의 for문============");
		for(String str : file_list) {
			
			System.out.println(str);
		}
		
	}
}