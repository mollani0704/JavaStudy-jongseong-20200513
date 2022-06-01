package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	/*
	 * 상품 정보 클래스(Entity Class)
	 * 
	 * - Entity Class 기본세팅 -
	 * 1. 변수
	 * productCode - int
	 * productName - String 
	 * category - int
	 * productionDate - LocalDate
	 * 
	 * 2. 기본 생성자
	 * 3. 전체생성자
	 * 4. getter, setter
	 * 5. hashCode()
	 * 6. equals()
	 * 7. toString()
	 */
	
	private String schoolName;
	private String schoolAddress;
	private String schoolMajor;
	private String schoolType;
	
	private int studentCounts;
	private LocalDate schoolOpenDay;
	
	public School() {}

	public School(String schoolName, String schoolAddress, String schoolMajor, String schoolType, int studentCounts,
			LocalDate schoolOpenDay) {
		super();
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolMajor = schoolMajor;
		this.schoolType = schoolType;
		this.studentCounts = studentCounts;
		this.schoolOpenDay = schoolOpenDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolAddress, schoolMajor, schoolName, schoolOpenDay, schoolType, studentCounts);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolAddress, other.schoolAddress) && Objects.equals(schoolMajor, other.schoolMajor)
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(schoolOpenDay, other.schoolOpenDay)
				&& Objects.equals(schoolType, other.schoolType) && studentCounts == other.studentCounts;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + ", schoolMajor=" + schoolMajor
				+ ", schoolType=" + schoolType + ", studentCounts=" + studentCounts + ", schoolOpenDay=" + schoolOpenDay
				+ "]";
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolMajor() {
		return schoolMajor;
	}

	public void setSchoolMajor(String schoolMajor) {
		this.schoolMajor = schoolMajor;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public int getStudentCounts() {
		return studentCounts;
	}

	public void setStudentCounts(int studentCounts) {
		this.studentCounts = studentCounts;
	}

	public LocalDate getSchoolOpenDay() {
		return schoolOpenDay;
	}

	public void setSchoolOpenDay(LocalDate schoolOpenDay) {
		this.schoolOpenDay = schoolOpenDay;
	};	
}
