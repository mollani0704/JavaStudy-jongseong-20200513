package j20_컬렉션.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	private int studentCode;
	private String name;
	private String schoolName;
}
