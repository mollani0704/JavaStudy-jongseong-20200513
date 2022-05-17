package j04_입력;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		
		String result = null;
		result = year % 4 == 0
				&& year % 100 != 0
				|| year % 400 == 0
				? "윤년" : "윤년 아님";
		System.out.println(result);

	}

}
