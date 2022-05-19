package j06_반복;

public class Star {
	
	/* 숙제(5/19)
	 * 1.
	 *     *	
	 *    **
	 *   ***
	 *  ****
	 * *****
	 * 
	 * 2. 
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 * 3. 
	 *     *
	 *    ***
	 *   *****
	 *  *******
	 * *********
	 */

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 5; j > i; j--) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}

	}

}
