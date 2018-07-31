package edit_user;
import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dbutil.SQLConnection;
@WebServlet("/edit_user")
public class EditUser extends HttpServlet {
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 try {
		 if (request.getParameter("submit_btn") != null) {
			    String userid = (String)request.getSession().getAttribute("userid");
				String fname = request.getParameter("fname");
				String lname = request.getParameter("lname");
				Connection con = SQLConnection.getConnection();
				Statement st = con.createStatement();
				String query = "UPDATE USER SET FIRSTNAME='"+ fname +"',LASTNAME='"+ lname +"' WHERE USERNAME='"+ userid +"';";
				st.executeUpdate(query);
				response.sendRedirect("welcome.jsp");
				return;
	        } else if (request.getParameter("discard_btn") != null){
	        	response.sendRedirect("welcome.jsp");
				return;
	        }
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	 }catch(Exception ex) {
		
	 }
 }
}
