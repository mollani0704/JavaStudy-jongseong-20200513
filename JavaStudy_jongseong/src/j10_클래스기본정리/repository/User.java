package j10_클래스기본정리.repository;

/*
 * Entity(독립체) Class - 정보만 가지고 있는, 데이터를 담는 객체
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다. 
 * 
 */
public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본 생성자
	//전체 생성자
	//getter
	//setter
	//toString
	
	//기본 생성자
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	// 기본생성자는 생략이 가능하다
	// 기본생성자는 오버로딩되면 기본생성자는 비활성화 되어 버린다. 
	// 그렇기 때문에 위에 기본 생성자를 기본적으로 만들었다.
	

	//전체 생성자
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	//getter & setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
	
		
	
}
