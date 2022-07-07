package domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.entity.User1;
import domain.jdbc1.DBConnectionMgr;

public class UserDaoImp1 implements UserDao1{
	private DBConnectionMgr pool;
	
	private String sql;
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDaoImp1() {
		pool = DBConnectionMgr.getInstance();
	}
	

	@Override
	public int save(User1 user1) throws Exception {
		int result = 0;
		
		sql = "INSERT INTO\r\n"
				+ "	user_mst\r\n"
				+ "VALUES(\r\n"
				+ "	0, \r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	NOW(),\r\n"
				+ "	NOW()\r\n"
				+ ");";
		
		con = pool.getConnection();
		
		pstmt = con.prepareStatement(sql);
		
		return 0;
	}

	@Override
	public int modify(int user_code) throws Exception {
		
		return 0;
	}

	@Override
	public int remove(int user_code) throws Exception {
		
		return 0;
	}

}
