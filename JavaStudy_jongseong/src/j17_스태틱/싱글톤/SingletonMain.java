package j17_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야 한다. 
		 * 2. 싱글톤의 생성자는 무조건 private이어야 한다. 
		 * 3. getInstance 안에서 스태틱 변수만 사용 가능(일반변수 사용 불가)
		 * 왜냐하면 일반변수는 생성이 되야지만 사용이 가능하기 때문에.
		 * 
		 */
		
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.printInfo();

		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(20);
		singleton2.printInfo();
	}

}
