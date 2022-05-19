package j06_반복;

public class For01 {

	public static void main(String[] args) {
		for(int i = 10; i > 0; i--) { // 규칙적인 반복을 할 때 for문을 쓴다.
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i++) { // 10번 반복하겠다라는 것이다. 
			System.out.println(10-i);
		}
		
//		int i = 0;
//		
//		while(i < 5) { // 조건을 좀 자유롭게 주고 싶을 때 반복문을 쓴다. 
//			System.out.println(i + 1);
//			i++;
//		}
	}
}
