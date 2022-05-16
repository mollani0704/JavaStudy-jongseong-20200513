package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 * 
		 * result = False
		 * 
		 * 년도가 4의 배수이면 True 아니면 False
		 * 
		 * 윤년이면 true 아니면 false
		 * 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수 일 때.
		 * 
		 */
		int year = 1999;
		boolean result = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		System.out.print(result);

	}

}
