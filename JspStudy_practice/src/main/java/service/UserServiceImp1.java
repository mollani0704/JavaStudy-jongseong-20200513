package service;

import domain.dao.UserDao1;
import domain.dao.UserDaoImp1;
import web.dto.SignupReqDto1;

public class UserServiceImp1 implements UserService1{
	
	private final UserDao1 userDao1;
	
	public UserServiceImp1() {
		userDao1 = new UserDaoImp1();
	}
	
	@Override
	public boolean checkUsername(String username) throws Exception {
		
		return userDao1.findUserByUsername(username) != null;
	}

	@Override
	public boolean createUser(SignupReqDto1 signupReqDto1) throws Exception {
	
		return userDao1.save(signupReqDto1.toEntity()) > 0;
	}

	@Override
	public void getUser() throws Exception {
		
		
	}

	@Override
	public boolean updateUser() throws Exception {
		
		return false;
	}

	@Override
	public boolean deleleUser() throws Exception {
		
		return false;
	}



}
