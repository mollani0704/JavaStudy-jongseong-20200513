package j16_인터페이스_활용;

import j16_인터페이스_활용.controller.APIController;
import j16_인터페이스_활용.service.OAuth2UserService;

public class Main {

	public static void main(String[] args) {
		
		APIController CompanyA = new APIController(new OAuth2UserService());
		CompanyA.addUser();
		CompanyA.getUser();
		CompanyA.modifiedUser();
		CompanyA.removeUser();
		
	}
}
