package j15_인터페이스;

public class Monitor implements Hdim, VGA{

	@Override
	public void connect() {
		System.out.println("모니터에 연결");
		
	}

	@Override
	public void disconnect() {
		System.out.println("모니터 연결 해제");
		
	}
	
	@Override
	public void vgaConnect() {
		System.out.println("vga로 모니터 연결");
		
	}
	
}
