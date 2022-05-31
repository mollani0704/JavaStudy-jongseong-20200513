package 인터페이스복습;

public class BeamProject implements Hdmi, VGA{

	@Override
	public void connect() {
		System.out.println("빔프로젝터 연결");
		
	}

	@Override
	public void disconnect() {
		System.out.println("빔프로젝터 연결 해제");
		
	}
	
	@Override
	public void vgaConnect() {
		System.out.println("VGA로 빔프로젝트 연결");
		
	}
}
