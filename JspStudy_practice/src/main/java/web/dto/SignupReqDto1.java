package web.dto;

import domain.entity.User1;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignupReqDto1 {
	private String name;
	private String email;
	private String username;
	private String password;
	
	public User1 toEntity() {
		return User1.builder()
				.name(name)
				.email(email)
				.username(username)
				.password(password)
				.roles("ROLE_USER")
				.build();
	}
	
}
