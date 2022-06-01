package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		
		String name = "김준일"; // -> 이 값 자체가 주소다. 
		String name2 = "김준일";// -> '똑같이 김준일로 만든 주소를 비교하기 때문에 비교했을 때 값이 true가 나온다'
		
		System.out.println(name == name2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1: ");
		name = scanner.nextLine();
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);

		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
	}

}
