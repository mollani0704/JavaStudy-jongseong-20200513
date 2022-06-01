package j17_스태틱;

// 스태틱은 공유하는 영역이고, 생성없이 사용할 수 있다.
// 스태틱은 클래스 틀안에 값을 저장할 수 있게끔 한다. 
// 스태틱은 메소드와 변수에만 사용할 수 있다. 
// 스태틱은 이태릭체이다. 
// 스태틱은 공유하는 특성이다. 매번 생성해서 쓰면 비효율적인 상황에서 쓰인다. 
// 스태틱은 객체생성없이 호출이 가능. 그면 언제 사용가능?? 인스턴스 변수를 사용하지 않을 때

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();
		
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();

		st.count = 10;
		st2.count = 20;
		st3.count = 30;
		
		StaticTest.count = 100;
		
		st.staticmethod();
		st2.staticmethod();
		st3.staticmethod();
		
		StaticTest.staticmethod();
	}

}
