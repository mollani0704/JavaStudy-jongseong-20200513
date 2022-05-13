package j02_변수와_상수;

public class MaxMin { //첫대문자는 무조건 클래스

	public static void main(String[] args) {
		final int MAX_NUMBER = 100; // 상수는 대문자로 쓴다.
		final int MIN_NUMBER; //
		
		//변수는 카멜표기법과 소문자로 씀.
		//상수는 유일하게 쓰이는 값일 때 씀. 예)프로그램 경로가 바뀌면 안되는 경우...등등
		//리터럴 상수
		//형변환
		//업캐스팅 문자 -> 정수 -> 실수
		//다운캐스팅 실수 -> 정수 -> 문자
		
		MIN_NUMBER = 10;
		
		System.out.println("최대값:" + MAX_NUMBER);
		System.out.println("최소값:" + MIN_NUMBER);
	}

}
