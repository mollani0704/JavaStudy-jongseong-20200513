package j16_인터페이스_활용.controller;

import j16_인터페이스_활용.service.UserService;

public class APIController {
	
	private final UserService userService;
	
	public APIController(UserService userService) { // 디펜젼시 인젝션 - 종속에 대한 주입
		this.userService = userService;
	}
	
	public void addUser() {
		System.out.println("사용자 추가");
		userService.create();
	}
	
	public void getUser() {
		System.out.println("사용자 정보 가져오기");
		userService.read();
	}
	
	public void modifiedUser() {
		System.out.println("사용자 정보 수정");
		userService.update();
	}
	
	public void removeUser() {
		System.out.println("사용자 삭제");
		userService.delete();
	}
}
