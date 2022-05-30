package j15_인터페이스;

public class BeamProjector implements Hdim{

	@Override
	public void connect() {
		System.out.println("빔프로젝터 연결");
		
	}

	@Override
	public void disconnect() {
		System.out.println("빔프로젝터 연결 해제");
		
	}

}
