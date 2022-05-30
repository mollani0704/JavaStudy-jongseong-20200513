package j14_추상;

/*
 * abstract(추상)
 * 메소드를 추상화할려면 그 클래스도 추상화해야한다. 
 * 추상클래스는 추상 메소드도 넣을 수 있지만 일반 메소드도 넣을 수 있다.
 * 
 * 추상메소드 
 * 1. return type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다. 
 * 3. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야한다. 
 * 
 * 추상클래스
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다. 
 * 2. 추상 클래스는 생성할 수 없다. new 클래스()를 할 수 없다. 단순히 설계도의 역할에 지나지 않는다.
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지는 않아도 된다. 
 * 
 */

//추상 클래스
public abstract class Factory {
	
	//추상 메소드 - 오버라이드를 꼭 해야한다. 
	public abstract void start();
	
	//일반 메소드
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}
	
	
}
