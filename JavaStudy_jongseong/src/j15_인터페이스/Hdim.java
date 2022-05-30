package j15_인터페이스;

/*
 * 인터페이스(interface)
 * 
 * 약속
 *
 * 1. 기본적으로 모든 메소드는 추상 메소드이다. 
 * 2. 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다. 
 */

public interface Hdim {
	public void connect();
	public void disconnect();
}
