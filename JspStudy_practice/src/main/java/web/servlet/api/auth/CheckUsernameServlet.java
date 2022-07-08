package web.servlet.api.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService1;
import service.UserServiceImp1;

@WebServlet("/check/username")
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private final UserService1 userService1;
   
    public CheckUsernameServlet() {
      userService1 = new UserServiceImp1();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		response.setContentType("text/plain;charset=UTF-8");
		try {
			response.getWriter().print(userService1.checkUsername(username));
			System.out.println(username);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
