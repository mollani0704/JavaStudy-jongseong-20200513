package j20_컬렉션.Hashset;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;


public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<Student> studentset = new HashSet<Student>();
		/*
		 * HashSet<Student>
		 * 
		 * 20220001, 김준일, "부산대학교"
		 * 20220002, 김준이, "부경대학교
		 * 
		 * 20220002의 코드를 가진 학생을 조회
		 * 
		 * 20220001의 코드를 가진 학생을 삭제
		 */
		studentset.add(new Student(20220001, "김준일", "부산대학교"));
		studentset.add(new Student(20220002, "김준이", "부경대학교"));
		
		Iterator<Student> iterator = studentset.iterator();		
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {
				System.out.println(student);
			}
		}
		
		iterator = studentset.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				studentset.remove(student);
			}
		}
		System.out.println(studentset);
	}
}
