package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = null;
		String str2 = null;
		String str3 = null;
		String str4 = null;
		String str5 = null;
		String str6 = null;

		System.out.print("개요 : ");
		str1 = scanner.nextLine();
	
		
		System.out.print("감독 : ");
		str2 = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.print("등급 : ");
		str3 = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.print("흥행 : ");
		str4 = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.print("줄거리 : ");
		str5 = scanner.nextLine();
		scanner.nextLine();
		str6 = scanner.nextLine();
		
		System.out.println("");
		
		System.out.println("개요: " + str1);
		System.out.println("");
		System.out.println("감독: " + str2);
		System.out.println("");
		System.out.println("등급: " + str3);
		System.out.println("");
		System.out.println("흥행: " + str4);
		System.out.println("");
		System.out.println("줄거리");
		System.out.println(str5);
		System.out.println(str6);
	}

}
