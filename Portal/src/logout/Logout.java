package logout;
import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dbutil.SQLConnection;
@WebServlet("/logout")
public class Logout extends HttpServlet{
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 try {
		 if (request.getParameter("edit_btn") != null) {
			 response.sendRedirect("edit_user.jsp");
	        } else if (request.getParameter("logout_btn") != null) {
	        	request.getSession().invalidate();
	        	response.sendRedirect("login.jsp");
	        }else {
	            
	        }
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	 }catch(Exception ex) {
		
	 }
 }
}
