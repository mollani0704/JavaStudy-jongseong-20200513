package j02_변수와_상수;

public class Myinfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 *
		 * 1. 문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 *
		 * 이름: 문종성
		 * 나이: 31
		 * 연락처: 010-5466-0378
		 * 주소: 부산 수영구 광안동
		 *
		 *
		 */
		 char name1 = '문'; // 문자 한글자 문자는 ''작은 따옴표
		 char name2 = '종';
		 char name3 = '성';
		 int age = 31;
		 String phone = "010-5466-0378"; //String 문자열은 " " 큰 따옴표
		 String address = "부산 수영구 광안동";
		 
		 System.out.print("이름: ");
		 System.out.print(name1);
		 System.out.print(name2);
		 System.out.println(name3);
		 System.out.print("나이: ");
		 System.out.println(age);
		 System.out.print("연락처: ");
		 System.out.println(phone);
		 System.out.print("주소: ");
		 System.out.println(address);
		 
		 System.out.print("이름: ");
		 System.out.println(""+ name1 + name2 + name3); // 16진수 -> 10진수로 바꿈. 값이 원래 유니코드이기 때문에 더했을 때 그냥 숫자로 나온다.
		 System.out.println("나이: " + age);
		 
		 System.out.println("세수의 합:" + (10 + 20 + 30));
	}

}
