package day03;

public class Switch1 {
	public static void main(String[] args) {
		int num=3;
		
		if(num==0) {
			System.out.println("num은 0");
		}else if(num==1) {
			System.out.println("num은 1");
		}else if(num==2) {
			System.out.println("num은 2");
		}else if(num==3) {
			System.out.println("num은 3");
		}
		
		//Switch : 같은지 비교
		//switch~case~break
		switch(num) {
		case 0:
			System.out.println("num은 0");
			break;			//break 없으면 break를 만날때 까지 밑에 있는 코드를 전부 실행한다.
		case 1:
			System.out.println("num은 1");
			break;
		case 2:
			System.out.println("num은 2");
			break;
		case 3:
			System.out.println("num은 3");
			break;
			default:
				System.out.println("그 밖");
		}
	}
}
