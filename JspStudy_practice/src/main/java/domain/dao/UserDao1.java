package domain.dao;

import domain.entity.User1;

public interface UserDao1 {
	public int save(User1 user1) throws Exception;
	public int modify(int user_code) throws Exception;
	public int remove(int user_code) throws Exception;
}
