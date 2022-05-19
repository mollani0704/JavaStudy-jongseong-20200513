package j06_반복;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result = result + (i + 1);
			i++; // 조건 변화 수식 -> 이거는 조건문에 마지막에 쓰면 좋다.
		}
		System.out.println(result);
	}
}
