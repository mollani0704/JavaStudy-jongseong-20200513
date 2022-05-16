package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 클래스로 시작하는 자료형을 참조자료형이라 한다. 
		System.out.print("값 입력 : ");
		int num = scanner.nextInt();
		
		System.out.println("입력한 값: " + num);
	}

}
