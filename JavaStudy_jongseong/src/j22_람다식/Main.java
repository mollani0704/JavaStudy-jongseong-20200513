package j22_람다식;

//람다 쓸 때는 인터페이스에 작성되야할 함수는 하나여야 한다. 
public class Main {

	public static void main(String[] args) {
	
		Math2 m2_1 = new Math2Impl();
		Math2 m2_2 = new Math2() {
			
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};
		
		// 결과가 return 밖에 없을 때 중괄호({}) 생략
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
		Math2 m2_4 = (v1, v2) -> {
			
			v1 += 2;
			v2 -= 1;
			
			return v1 % v2;
			
		};
		
		double t = m2_3.calc(10, 3);
		System.out.println(t);
	}

}
