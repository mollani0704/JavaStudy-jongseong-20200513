package 다형성복습;

public class SmartPhoneFactory extends Factory{
	@Override
	public void start() {
		System.out.println("스마트폰 공장을 가동합니다.");
	}
	
	public void showSmartPhone() {
		System.out.println("스마트폰들을 확인합니다.");
	}
}
