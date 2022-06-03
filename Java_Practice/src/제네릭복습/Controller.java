package 제네릭복습;

public class Controller {
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234");
	}
	
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29);
	}
	
	public CMRespDto getUser() {
		User user = new User();
		user.setUsercode("2");
		user.setUsername("junil");
		user.setPassword("1234");
		user.setName("김준일");
		user.setEmail("skj1234@kakao.com");
		
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);
		} else {
			return new CMRespDto<String>(-1 ,"회원정보 가져오기 실패", "usercode = 2");
		}
	}
}
