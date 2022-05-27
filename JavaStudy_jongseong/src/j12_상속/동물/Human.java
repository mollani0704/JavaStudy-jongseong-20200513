package j12_상속.동물;

/*
 * @ 어노테이션
 * 
 * @Override(재정의)
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다라는 의미.
 */

//원래는 상속받아서 부모의 메소드를 똑같이 사용하면 변수명이 같기 때문에 사용할 수 없지만
//상속과 구현이라는 관계에서만 오버라이드를 사용할 수 있다. 

public class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
