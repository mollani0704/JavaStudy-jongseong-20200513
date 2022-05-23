package j07_메소드;

import java.util.Scanner;

public class Menu {
	
	public static void sleepAndContinue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계속하시려면 엔터를 눌러주세요....");
		scanner.nextLine();
	}
	
	public static char inputSelect() {
		Scanner scanner = new Scanner(System.in);
		
		char select = 0;
		
		System.out.print("명령을 입력하세요: ");
		select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select;
	}
	
	public static boolean showMenu2() {
		
		char select = 0;
		
		System.out.println("java를 선택하셨습니다.");
//		System.out.print("계속하시려면 엔터를 눌러주세요");
//		scanner.nextLine(); // 반복을 잠시 멈추는 역할.
			while(true) {
				System.out.println("[ java 메뉴]");
				System.out.println("1. java란?");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				
				select = inputSelect();
				
				if(select == 'b') {
					break;
				} else if(select == 'q') {
					return true;
					
				} else if(select == '1') {
					System.out.println("자바란 ...입니다.");
					sleepAndContinue();

					
				} else {
					System.out.println("해당 명령은 보기에 없습니다. ");
					System.out.println("다시 입력하세요.");
					sleepAndContinue();
				}
			}
			
		return false;
	}
	
	public static boolean showMenu1() {
		while(true) {
			
			char select = 0;
			
			System.out.println("[ 메뉴 선택 ]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			select = inputSelect();
			
			if(select == 'q') {
				break;		
				
			} else if(select == '1') {
				if(showMenu2()) {
					return true;
				}
									
			} else if(select == '2') {
//			System.out.println("python를 선택하셨습니다.");
//			System.out.print("계속하시려면 엔터를 눌러주세요");
//			scanner.nextLine(); // 반복을 잠시 멈추는 역할.
				while(true) {
					System.out.println("[ python 메뉴]");
					System.out.println("1. python이란?");
					System.out.println("b. 뒤로가기");
					
					select = inputSelect();
					
					if(select == 'b') {
						break;
					} else if(select == '1') {
						System.out.println("파이썬이란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요...");
						sleepAndContinue();
						
					} else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
						sleepAndContinue();
					}
					
					System.out.println();
				}
				
			} else if(select == '3') {
//			System.out.println("javascript1를 선택하셨습니다.");
//			System.out.print("계속하시려면 엔터를 눌러주세요");
//			scanner.nextLine(); // 반복을 잠시 멈추는 역할.
				while(true) {
					System.out.println("[javascript 메뉴]");
					System.out.println("1. javascript이란?");
					System.out.println("b. 뒤로가기");
					
					select = inputSelect();
					
					if(select == 'b') {
						break;
					} else if(select == '1') {
						System.out.println("자바스크립트란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요");
						sleepAndContinue();
					}
					
					System.out.println();
				}
				
			} else {
				System.out.println("해당 명령은 보기에 없습니다. ");
				System.out.println("다시 입력하세요.");
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		showMenu1();
		
		System.out.println("프로그램 종료");

	}

}
