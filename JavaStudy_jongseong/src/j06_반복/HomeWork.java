package j06_반복;

public class HomeWork {

	public static void main(String[] args) {
		//숙제(5/19)
		 /* 1.
		 *     *	
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		/* 2. 
//		 * *****
//		 *  ****
//		 *   ***
//		 *    **
//		 *     *
//		 */ 
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		/* 3. 
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		for(int i = 0; i < 5; i++)	{
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");	
			}
			
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			
			for(int m = 0; m < i; m++) {
				System.out.print("*");
			}
			
			
			System.out.println("");
		}
	}
		
}


