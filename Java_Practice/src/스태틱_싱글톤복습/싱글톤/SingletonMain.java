package 스태틱_싱글톤복습.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.printInfo();

	}

}
