package 추상화복습;

public class FactoryMain {

	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[2];
		
		Factory lgFactory = new LGFactory();
		Factory samsungFactory = new SamsungFactory();
		
		factorys[0] = new LGFactory();
		factorys[1] = new SamsungFactory();
		
		for(Factory factory : factorys) {
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}
		
		
		

	}

}
