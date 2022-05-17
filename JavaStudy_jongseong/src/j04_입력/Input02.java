package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력: nextLine()			안녕
		 * 문자열2 입력: next()				hi
		 * 문자 입력: next().charAt(0)		A
		 * 정수 입력: nextInt()				10
		 * 실수 입력: nextDouble()			3.14
		 * 
		 */
		
		//변수 선언을 위에서 작성하고 밑에서 값을 입력하라.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열1 입력: "  );
		String str1 = scanner.nextLine();
		
		System.out.print("문자열2 입력: ");
		String str2 = scanner.next();
		
		System.out.print("문자 입력: ");
		char char1 = scanner.next().charAt(0);
		
		System.out.print("정수 입력: ");
		int int1 = scanner.nextInt();
		
		System.out.print("실수 입력: ");
		double double1 = scanner.nextDouble();
		
		System.out.println("");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(char1);
		System.out.println(int1);
		System.out.println(double1);

	}

}
