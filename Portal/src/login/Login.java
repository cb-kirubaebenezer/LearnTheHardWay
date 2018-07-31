package login;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dbutil.SQLConnection;
@WebServlet("/login")
public class Login extends HttpServlet{
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 try {
			 if (request.getParameter("login_btn") != null) {
		        	String userid=request.getParameter("usr"); 
		            String pwd=request.getParameter("pwd"); 
		            Connection con = SQLConnection.getConnection();
		            Statement st= con.createStatement(); 
		            ResultSet rs=st.executeQuery("select username,password from USER where username='"+userid.trim()+"'"); 
		            if(rs.next()) 
		            { 
		            	if(rs.getString("password").equals(pwd) && rs.getString("username").equals(userid)) 
		            	{ 
		            		request.getSession(true).setAttribute("userid", userid);
		            		response.sendRedirect("welcome.jsp");
		            		return;
		            	} 
		            	else 
		            	{ 
		            		request.setAttribute("errMsg", "username and password are incorrect");
		             	    RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		             	    rd.forward(request, response); 
		             	    return;
		            	} 
		            } 
		            else{
		            	return;
		            }
		        } else if (request.getParameter("forgot_password_btn") != null) {
		  
		        } else if (request.getParameter("register_btn") != null) {
		        	response.sendRedirect("register.jsp");
		        } else {
		            
		        }
		        request.getRequestDispatcher("login.jsp").forward(request, response);
		 }catch(Exception ex) {
			
		 }
	 }
}
