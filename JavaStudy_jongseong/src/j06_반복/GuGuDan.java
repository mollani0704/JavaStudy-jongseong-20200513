package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		
//		for(int i = 2; i < 10; i++ ) {
//			System.out.println(i + "단");
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//			System.out.println("");
//		}
		
		for(int dan = 0; dan < 8; dan++) {
			System.out.println((dan + 2) + "단");
			for(int i = 0; i < 9; i++) {
				int result = (dan + 2) * (i + 1);
				System.out.println((dan + 2) + " X " + (i + 1) + " = " + result );
			}
			System.out.println();
		}
	}
}
