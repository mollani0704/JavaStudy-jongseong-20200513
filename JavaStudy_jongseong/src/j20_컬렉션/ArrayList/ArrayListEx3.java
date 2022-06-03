package j20_컬렉션.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.Entity.Student;

public class ArrayListEx3 {

	public static void main(String[] args) {
	
		/* 
		 * 1. Student 자료형을 담을 수 있는 ArrayList를 생성.
		 * 2. studentCode    name    schoolName
		 * 20220001          김준일   부산교육대학원
		 * 20220002			곽나경		부산대학교
		 * 20220003			정현경		부경대학교
		 * 20220004			정현경		부산대학교
		 * 20220005			전주홍		동아대학교
		 *
		 *
		 * 3. 전체 학생 정보 출력
		 * 
		 * 4. 인덱스 3의 위치에 삽입
		 * 20220006		한대경		서울대학교
		 * 
		 * 5. 인덱스 2의 위치에 있는 학생의 학교명을 고려대학교로 변경
		 * 
		 * 6. 인덱스 5의 위치에 있는 학생의 정보를 수정
		 * 20220007    김나예 		부산여자중학교
		 * 
		 * 7. 인덱스 0의 위치에 있는 학생의 정보를 삭제
		 * 
		 */
		
		//1. 
		ArrayList<Student> StudentList = new ArrayList<Student>();
		
		//2.
		StudentList.add(new Student(20220001, "김준일", "부산교육대학원"));		
		StudentList.add(new Student(20220002, "곽나경", "부산대학교"));		
		StudentList.add(new Student(20220003, "정현경", "부경대학교"));		
		StudentList.add(new Student(20220004, "정현경", "부산대학교"));		
		StudentList.add(new Student(20220005, "전주홍", "동아대학교"));		
		
		//3.
		for(Student student : StudentList) {
			System.out.println(student);
		}

		System.out.println("");
		
		//4. 
		StudentList.add(3, new Student(20220006, "한대경", "서울대학교"));
		for(Student student : StudentList) {
			System.out.println(student);
		}

		System.out.println("");
		
		//5. 
		StudentList.get(2).setSchoolName("고려대학교");
		for(Student student : StudentList) {
			System.out.println(student);
		}
		
		System.out.println("");
		
		//6. 
		StudentList.set(5, new Student(20220007, "김나예", "부산여자중학교"));
		for(Student student : StudentList) {
			System.out.println(student);
		}
		
		System.out.println("");
		
		//7.
		StudentList.remove(0);
		for(Student student : StudentList) {
			System.out.println(student);
		}
		
  }
}