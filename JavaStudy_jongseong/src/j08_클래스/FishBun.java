package j08_클래스;

 // 클래스도 자료형이다. ->  참조자료형.
 // 생성자는 반환자료형이 생략되어져 있고 클래스명이랑 같다. 
 // 생성자는 무조건 주소값을 반환한다. 

public class FishBun {
	String material; // 재료
	String dough;
	
	
	void test() {
		
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
	
}
