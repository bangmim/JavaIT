package day03;

public class While2 {
	//while은 무한 반복을 방지하기 위해 플래그를 세운다.
	//반복문 : 유사한 코드를 원하는 횟수만큼 실행시킬 수 있어야한다.
	
	int i=0;		//플래그 0
	while(i!=1000) {
		System.out.println("Hello");
		i++;		//중괄호 블록 실행할 때마다 i는 1씩 증가
	}
}
