package service;

import domain.entity.User1;
import web.dto.SignupReqDto1;

public interface UserService1 {
	public boolean checkUsername(String username) throws Exception;
	public boolean createUser(SignupReqDto1 signupReqDto1) throws Exception;
	public void getUser() throws Exception;
	public boolean updateUser() throws Exception;
	public boolean deleleUser() throws Exception;
	
	public User1 loadUser(String username, String password) throws Exception;
}
