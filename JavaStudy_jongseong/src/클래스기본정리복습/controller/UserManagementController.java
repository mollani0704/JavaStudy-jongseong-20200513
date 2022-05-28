package 클래스기본정리복습.controller;

import 클래스기본정리복습.repository.User;
import 클래스기본정리복습.service.UserService;

public class UserManagementController {
	
	private UserService userService;
	
	public UserManagementController() {
		userService = new UserService();
	}
	
//	public void createUser() {
//		System.out.println("여기 호출?");
//		User user = userService.insertUser();
//		
//		System.out.println("[새로 추가된 사용자]");
//		System.out.println(user.toString());
//	}
//	
//	public void updateUser() {
//		
//	}
}
