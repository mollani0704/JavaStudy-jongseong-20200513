package j09_접근지정자.a;

public class Student {
	// 접근지정자를 private로 한 것이 정보은닉이다. 
	// 정보은닉, 캡슐화에 대해서 알아보기.
	
	private String name;
	private String schoolName;

	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	
}
