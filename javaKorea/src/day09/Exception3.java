package day09;

import java.io.BufferedReader;
import java.io.IOException;

//Exception : 제일 포괄적인 범위
//IOException : IO 관련된 범위 (좀 더 좁은 범위)

public class Exception3 {
	public static void main(String[] args) throws Exception {
		Try3 try3= new Try3();
		try3.go();
		
		//throws Exception : 예외가 발생할 경우 Exception 클래스에 맡긴다
	}
}

class Try3{
	private BufferedReader br = null;
	
	public void go() throws Exception {
		//1. try~catch 사용
		try {
			br.read();
		} catch (IndexOutOfBoundsException e) {
			// 배열 범위가 넘어갔을 때 예외처리
			e.printStackTrace();
		} catch (IOException e) {
			// IO 예외가 나왔을 때만 예외처리
			e.printStackTrace();
		} catch (Exception e) {
			// 모든 예외대상에 대해서
		e.printStackTrace();
	}
		
		//2. throws Exception 사용
		br.read();
	}
}