package j15_인터페이스;

public class SmartPhone {
	
	// 질문 VGA는 어떻게 사용하는가??
	private final Hdim hdim; // final 붙이는 이유 : 생성될 때 무조건 값을 집어넣게 만들게.
	
	public SmartPhone(Hdim hdim) {
		this.hdim = hdim;
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdim.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdim.disconnect();
	}
}
