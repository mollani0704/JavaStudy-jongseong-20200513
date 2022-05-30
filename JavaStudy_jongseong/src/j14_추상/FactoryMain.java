package j14_추상;

public class FactoryMain {
	// 무조건 상속이 된거만 형변환을 할 수 가 있다.
	// 업캐스팅하는 이유 : 배열을 만들어서 묶을 수 있다.
	
	public static void main(String[] args) {
		Factory lgFactory = new LgFactory(); 
		Factory samsungFactory = new SamsungFactory();
		
		// Factory 클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성.
		Factory[] factorys = new Factory[2];
		
		factorys[0] = new SamsungFactory();//업캐스팅
		factorys[1] = new LgFactory();//업캐스팅
		
		for(Factory factory : factorys) { // foreach: 처음부터 끝까지 반복
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}
		
	}

}
