package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("김준일", "웹개발");
		Teacher t2 = new Teacher("김준일", "웹개발");
		
		System.out.println(t1); // toString은 생략이 가능하다. 
		System.out.println(t2); 
		System.out.println(t1 == t2); 
		System.out.println(t1.equals(t2));
		
		System.out.println(t1.hashCode() == t2.hashCode());
		
//		Object obj = t1; // 업캐스팅 가능(상속 또는 구현이 되었다.)

	}
	
//	public void test(Object obj) {
//		System.out.println(obj.toString());
//		if(obj instanceof Teacher) {
//			Teacher teacher = (Teacher) obj;
//		}
//	}
	
}
