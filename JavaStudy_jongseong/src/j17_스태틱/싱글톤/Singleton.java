package j17_스태틱.싱글톤;

/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야한다. 
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return 해줄 수 있는 
 * 	  getInstance() static 메소드가 존재해야 한다. 
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야한다.
 *   
 */

public class Singleton {
	
	private static Singleton instance = new Singleton();
	private int count;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
	}
}
