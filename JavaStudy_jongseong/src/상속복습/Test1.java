package 상속복습;

public class Test1 extends Test{
	public Test1() {
		
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인 : " + super.toString());
	}
}
