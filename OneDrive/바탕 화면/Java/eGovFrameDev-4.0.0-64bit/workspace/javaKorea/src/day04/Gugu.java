package day04;

public class Gugu {
	public static void main(String[] args) {
		System.out.println("====구구단====");
		
		for(int i=1; i<10; i++) {
			
			for(int j=2; j<10; j++) {
				//ln을 빼면 줄바꿈 제거
				//\t : 자동줄바꿈
				System.out.print(j+"X"+i+"="+j*i+"\t");
			}
			
			System.out.println();
		}
	}
}
