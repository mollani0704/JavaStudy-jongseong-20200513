package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스1)
 * 모든 클래스는 Object클래스다 라고 말할 수 있다.
 * 모든 클래스는 Object로 업캐스팅이 가능하다. 
 * toString은 정보를 담는 entity class에서 많이 사용한다. 
 * 
 */

public class Teacher {
	
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Teacher) {
//			Teacher teacher = (Teacher) obj;
//			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	public void classInfo() {
		System.out.println();
	}
}
