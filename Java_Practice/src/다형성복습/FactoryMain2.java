package 다형성복습;

public class FactoryMain2 {
	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[50];
		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i].start();;
		}
		
		System.out.println("");
		
		for(int i = 0; i < factorys.length; i++) {
				
			}
		}
	}

