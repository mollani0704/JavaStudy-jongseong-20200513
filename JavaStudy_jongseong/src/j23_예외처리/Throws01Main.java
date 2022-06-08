package j23_예외처리;

// 예외처리 무조건 main전에는 처리하라

public class Throws01Main {
	
	public void test() throws Exception{
		
		Throws01 throws01 = new Throws01();
		
		throws01.printArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
	}
	
	public static void main(String[] args) {
		Throws01Main main = new Throws01Main();
		try {
			main.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
