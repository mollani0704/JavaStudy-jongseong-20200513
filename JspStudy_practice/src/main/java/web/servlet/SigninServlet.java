package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.entity.User1;
import service.UserService1;
import service.UserServiceImp1;

@WebServlet("/signin1")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final UserService1 userService1;
       
    public SigninServlet() {
    	userService1 = new UserServiceImp1();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/signin1.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User1 user1 = null;
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			user1 = userService1.loadUser(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(user1 == null) {
				out.print(false);
			} else {
				HttpSession session = request.getSession();
				System.out.println("session id : " + session.getId());
				System.out.println("session CreationTime" + (new SimpleDateFormat("HH:mm:ss")).format(session.getCreationTime()));
				System.out.println("session " + (new SimpleDateFormat("HH:mm:ss")).format(session.getLastAccessedTime()));
				
				session.setAttribute("principal", user1);
				
				out.print(true);
			}
		}

	}

}
