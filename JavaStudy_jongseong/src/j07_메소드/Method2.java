package j07_메소드;

public class Method2 {
	
	
	// 클래스 안에 정의된 함수를 메소드라고 부른다.
	
	// 매개변수가 없으면서 반환도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	// 매개변수는 있고 반환이 없는 메소드
	public static void test2(int age, int year) {
		System.out.println("나이 : " + age);
		System.out.println("출생년도 : " + year);
	}
	// void는 return 할 값이 없을 때 쓴다. 
	
	// 메소드 앞에 있는 타입만 리턴 할 수 있다.
	// 매개변수가 없고 반환이 있는 메소드
	public static String test3() {
		return "김준일";
	}
	
	public static int test4() {
		return 10000;
	}
	
	// 매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
	}
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
	}
	
	// 메소드가 끝나는 것은 리턴을 만나거나 코드가 다 실행되는 것이다. 
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1(); //호출
		test2(29, 1994);
		String name = test3();
		System.out.println(name);
		System.out.println(test5("김준일", 1));
		test6();
		System.out.println("메인함수 끝");
	}

}
