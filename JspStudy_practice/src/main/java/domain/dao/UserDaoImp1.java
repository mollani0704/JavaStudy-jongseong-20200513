package domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, user1.getName());
			pstmt.setString(2, user1.getEmail());
			pstmt.setString(3, user1.getUsername());
			pstmt.setString(4, user1.getPassword());
			pstmt.setString(5,  user1.getRoles());
			pstmt.setString(6, user1.getProvider());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);;
		}
		return result;
	}
	

	@Override
	public User1 findUserByUsername(String username) throws Exception {
		User1 user1 = null;
		
		sql = "SELECT \r\n"
				+ "	um.user_code,\r\n"
				+ "	um.name,\r\n"
				+ "	um.email,\r\n"
				+ "	um.username,\r\n"
				+ "	um.password,\r\n"
				+ "	um.roles,\r\n"
				+ "	um.provider,\r\n"
				+ "	ud.user_profile_img,\r\n"
				+ "	ud.user_address,\r\n"
				+ "	ud.user_phone,\r\n"
				+ "	ud.user_gender\r\n"
				+ "FROM\r\n"
				+ "	user_mst um\r\n"
				+ "	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)\r\n"
				+ "WHERE\r\n"
				+ "	um.username = ?;";
		
		con = pool.getConnection();
		
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user1 = User1.builder()
						.user_code(rs.getInt(1))
						.name(rs.getString(2))
						.email(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.roles(rs.getString(6))
						.provider(rs.getString(7))
						.user_profile_img(rs.getString(8))
						.user_address(rs.getString(9))
						.user_phone(rs.getString(10))
						.user_gender(rs.getInt(11))
						.build();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user1;
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
