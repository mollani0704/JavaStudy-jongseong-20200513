package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * num = 0;
		 * 
		 * 반복 횟수를 입력하세요 : 5
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		
		System.out.print("반복 횟수를 입력하세요 : ");
		num2 = scanner.nextInt();

		while(num < num2 ) {
			System.out.println(num+1);
			num ++;
		}
		
		num = 0;
		
		while(num < num2 ) {
			System.out.println(num2-num);
			num++;
		}	
	}
}
