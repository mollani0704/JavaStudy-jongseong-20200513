package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

//@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 전체생성자
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Product2 {
	private final int productCode = 0;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
}
