package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("X좌표를 입력해 주세요 : ");
		x = scanner.nextInt();
		
		System.out.print("Y좌표를 입력해 주세요 : ");
		y = scanner.nextInt();
		
		System.out.println("");
		
//		if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0)
//		&& ( x != 0 && y != 0))
		
//		if(x < -1000 || x > 1000 || y < -1000 || y > 10000) {
//			System.out.println("계산 불가 입니다1.");
//		} else if(x == 0 && y == 0 ) {
//			System.out.println("원점");
//		} else if(x == 0 || y == 0) {
//			System.out.println("계산 불가 입니다.");
//		} else if (x > 0 && y > 0) {
//			System.out.println("1사분면 입니다.");
//		} else if (x < 0 && y > 0) {
//			System.out.println("2사분면 입니다.");
//		} else if (x < 0 && y < 0) {
//			System.out.println("3사분면 입니다.");
//		} else {
//			System.out.println("4사분면 입니다.");
//		}
		
		String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0)
				&& ( x != 0 || y != 0) ?  "계산불가" 
						: x > 0 && y > 0 ? "1사분면"
								: x < 0 && y > 0 ? "2사분면"
										: x < 0 && y < 0 ? "3사분면"
												:x > 0 && y < 0 ? "4사분면" : "원점";
		System.out.println(result);
		
	}
	

}
