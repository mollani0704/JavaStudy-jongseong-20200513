package 인터페이스복습;

public class Main {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProject beamProject = new BeamProject();
		
		SmartPhone smartPhone = new SmartPhone(monitor);
		smartPhone.powerOn();
		smartPhone.powerOff();

	}

}
