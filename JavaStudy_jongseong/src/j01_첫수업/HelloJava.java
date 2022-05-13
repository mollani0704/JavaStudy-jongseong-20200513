package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello, Java");
		System.out.println("Hello, Java"); //마지막에 줄바꿔준다.
		System.out.print(10 + 5);
		System.out.println();
		
		int age = 15;
		
		System.out.print("이름: ");
		System.out.println("문종성");
		System.out.print("직업: ");
		System.out.println("개발자");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		
		System.out.print("이름: ");
		System.out.println("문종성");
		System.out.print("직업: ");
		System.out.println("개발자");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1;
		
		System.out.println(age);
	}

}
