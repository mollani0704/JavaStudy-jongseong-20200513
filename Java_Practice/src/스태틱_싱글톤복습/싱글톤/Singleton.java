package 스태틱_싱글톤복습.싱글톤;

public class Singleton {
	
	private static Singleton instance;
	private int count;
	
	private Singleton() {};
	
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
