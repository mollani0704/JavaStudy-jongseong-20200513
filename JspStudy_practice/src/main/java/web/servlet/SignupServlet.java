package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService1;
import service.UserServiceImp1;
import web.dto.SignupReqDto1;

@WebServlet("/signup1")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final UserService1 userService1;
 
    public SignupServlet() {
      userService1 = new UserServiceImp1();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/signup1.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("회원가입 요청");
		
		SignupReqDto1 signupReqDto1 = SignupReqDto1.builder()
				.name(request.getParameter("name"))
				.email(request.getParameter("email"))
				.username(request.getParameter("username"))
				.password(request.getParameter("password"))
				.build();
		
		try {
			PrintWriter out = response.getWriter();
			
			if(userService1.createUser(signupReqDto1)) {
				System.out.println("회원가입 성공");
				out.print(true);
			} else {
				System.out.println("회원가입 실패");
				out.print(false);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
