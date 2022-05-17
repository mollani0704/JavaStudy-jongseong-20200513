package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름: 김준일					(문자열) 	name
		 * 나이: 29						(정수)		age
		 * 연락처: 010-9988-1916		(문자열)	phone
		 * 주소: 부산 동래구 사직동		(문자열)	address
		 * 성별: 남						(문자)		gender
		 * 
		 * [개인정보 출력]
		 * 이름 => 김준일					(문자열)
		 * 나이 => 29						(정수)
		 * 연락처 => 010-9988-1916		(문자열)
		 * 주소 => 부산 동래구 사직동		(문자열)
		 * 성별 => 남						(문자)
		 * 
		 */
		
		/*
		 * next()와 nextLine()의 차이
		 * next는 enter와 space를 무시한다. 그래서 만약 입력을 할 때 space를 입력한다면
		 * 입력한 값이 짤려버린다.
		 * 
		 * nextLine은 enter와 space를 받는다. 
		 * 
		 * 그리고 항상 next()에 값을 입력하게 되면 마지막에 enter값이 남는다.
		 * ex) 부산 동래구 사직동\n
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in); //버퍼에 대해서 알아보자, scanner에 대해서도 알아보자.
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = ' ';
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		scanner.nextLine();
		
		System.out.print("주소: ");
		address = scanner.nextLine();
		
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		
		System.out.println("[개인정보 출력]");
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
	}

}
