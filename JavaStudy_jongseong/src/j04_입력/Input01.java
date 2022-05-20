package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 클래스로 시작하는 자료형을 참조자료형이라 한다. 
		
		String str1 = null;
		String str2 = null;
		String str3 = null;
		String str4 = null;
		
		System.out.print("첫번째 값 입력 : ");
		str1 = scanner.next();
		str2 = scanner.next();
		str3 = scanner.next();
		str4 = scanner.nextLine();
		
		System.out.println("값 : " + str1 + str2 + str3);
		System.out.println("값 : " + str4);
		
//		int num1 = scanner.nextInt();
//		System.out.print("두번째 값 입력 : ");
//		int num2 = scanner.nextInt();
//		
//		System.out.println("입력한 값: " + (num1 + num2));
//		
//		scanner.next();					//문자열(String)
//		scanner.nextLine();				//문자열(String)
//		scanner.next().charAt(0);		//문자(char)
//		scanner.nextInt();				//정수(int)
//		scanner.nextDouble();			//실수(double)
	}

}
