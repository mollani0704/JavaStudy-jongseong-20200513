package j11_배열;

public class Array01 {
	// 배열 - 참조자료형.
	// 배열은 자료형을 담기 위해 쓰인다. 그래서 기본자료형도 담을 수 있고 참조자료형(클래스)도 담을 수 있다. 
	
	// int의 기본값은 0이다. null이 아니다.
	// String은 클래스이다. 
	// 모든 클래스는 기본값이 null이다. 
	// null이 주소값이다. 주소가 없는 것이 바로 null이다. 
	// 문자열이라는 것은 character 자료형의 배열이다. 
	// 클래스 변수는 주소값을 담는다. 그 주소값을 비워놓고 싶으면 null을 사용해라.
	// 문자열이라는 것은 일종의 주소값이다. 
	
	public static void main(String[] args) {
		
		// 1. 배열의 공간(크기)을 정해서 생성.
		int[] numbers = new int[10];
		char[] characters = {'a', 'b', 'c', 'd', 'e'}; 
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5];
		String str = "test";
		
		System.out.println("numbers의 길이 : " + numbers.length);
		System.out.println("strArray의 길이 : " + strArray.length);
		
		// 2. 배열에 들어갈 값을 미래 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < numbers.length; i++) {
			  System.out.println("numbers: " + numbers[i]);
			  System.out.println("numbers2: " + numbers2[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
