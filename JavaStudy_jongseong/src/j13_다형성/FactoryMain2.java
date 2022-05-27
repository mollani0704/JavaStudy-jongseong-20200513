package j13_다형성;

public class FactoryMain2 {

	//업캐스팅 될려면 상속이 되있어야하고
	//다운캐스팅할려면 업캐스팅 된 녀석을 다운캐스팅 할 수 있다.
	//업캐스팅 된 녀석을 다시 다운 캐스팅 할 수 있지 다른 녀석으로 다운캐스팅 할 수 없다.
	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
		
	
		for(int i = 0; i < factorys.length; i++) {
			//삼항연산자, 조건 연산자.
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		// 업캐스팅
		for(Factory factory : factorys) {
			factory.start();
		}
		
		int i = 10;
		double d = i;
		int ii = (int) d;
		
		System.out.println();
		
		// 다운 캐스팅
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
				
			} else if(factory instanceof ComputerFactory){
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			} else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
		}
	}
}
