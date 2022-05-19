package j06_반복;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0 ) {				
				continue; // 다음 반복을 계속하라는 의미
			}
			System.out.println(i);
		}

	}

}
