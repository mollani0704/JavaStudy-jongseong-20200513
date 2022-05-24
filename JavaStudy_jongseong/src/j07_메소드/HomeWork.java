package j07_메소드;

import java.util.Scanner;

public class HomeWork {

	public static char input() {
		Scanner scanner = new Scanner(System.in);
		
		char select = 0;
		System.out.print("명령을 입력하세요 : ");
		select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select;
	}
	
	
	public static char menu() {
		Scanner scanner = new Scanner(System.in);
		
		char select = 0;
		
		System.out.println("[ 메뉴 선택]");
		System.out.println("1. java?");
		System.out.println("2. python");
		System.out.println("3. javascript");
		System.out.println("q. 프로그램 종료");
		
		select = input();
		
		return select;
	}
	
	public static void menu2(String lan) {
		
		boolean loopFlag = true;
		
		char select = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(lan + "를 선택하셨습니다.");
		
		while(loopFlag) {
			System.out.println("[ " + lan + "메뉴 ]");
			System.out.println("1. " + lan + "란?");
			System.out.println("b. 뒤로가기");
			System.out.println("q. 프로그램 종료");
			
			select = input();
			
			if(select == 'b') {
				break;
			} else if(select == 'q') {
				break;
				
			} else if(select == '1') {
				System.out.println(lan+"란 ... 입니다.");
				System.out.println("계속하시려면 엔터를 눌러주세요.....");
				scanner.nextLine();
			} else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	
	public static void main(String[] args) {

		char select = 0;

		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			select = menu();
			
			if(select == 'q') {
				loopFlag = false;
				break;
			} else if(select == '1') {
				menu2("java");
			} else if(select == '2') {
				menu2("python");
			} else if(select == '3') {
				menu2("javaScript");
			} else {
				System.out.println("해당 명령은 보기에 없습니다. ");
				System.out.println("다시 입력하세요.");
			} 	
		}
		System.out.println("프로그램 종료");
	}
}