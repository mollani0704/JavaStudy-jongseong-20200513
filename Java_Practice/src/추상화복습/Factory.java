package 추상화복습;

public abstract class Factory {
	public abstract void start();
	
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}
}
