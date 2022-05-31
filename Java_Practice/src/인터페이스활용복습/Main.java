package 인터페이스활용복습;

import 인터페이스활용복습.controller.APIController;
import 인터페이스활용복습.service.OAuth2UserService;

public class Main {
	
	public static void main(String[] args) {
		APIController CompanyA = new APIController(new OAuth2UserService());
		
		CompanyA.addUser();
	}
}
