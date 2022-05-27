package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	
	private UserService userService;
	private User[] users;
	
	public UserManagementController() {
		userService = new UserService();
		users = new User[2];
	}
	
	public void createUser() {
		System.out.println("여기 호출?");
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		
		} else {
			System.out.println("더 이상 사용자를 추가 할 수 없습니다.");
		}
	}

	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void updateUser() {
		
	}
}
