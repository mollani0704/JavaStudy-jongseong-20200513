package service;

import web.dto.SignupReqDto1;

public interface UserService1 {
	public boolean createUser(SignupReqDto1 signupReqDto1) throws Exception;
	public void getUser() throws Exception;
	public boolean updateUser() throws Exception;
	public boolean deleleUser() throws Exception;
}
