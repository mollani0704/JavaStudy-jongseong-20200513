package 다형성복습;

public class FactoryMain {

	public static void main(String[] args) {
		
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();

	}

}
