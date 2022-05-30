package j14_추상;

public class FactoryMain2 {

	public static void main(String[] args) {
		LgFactory lgFactory = new LgFactory();
		lgFactory.start();
		lgFactory.stop();
		
//		Factory factory = new Factory(); 추상 클래스는 생성 할 수 없다.
		
		SamsungFactory samsungFactory = new SamsungFactory();
		samsungFactory.start();
		samsungFactory.stop();
	}

}
