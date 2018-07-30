package register;
import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/register")
public class Register extends HttpServlet{
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 try {
		 if (request.getParameter("register_btn") != null) {    
	         String user=request.getParameter("email"); 
	         String fname=request.getParameter("fname"); 
	         String lname=request.getParameter("lname"); 
	         String cemail=request.getParameter("cemail"); 
	         String pwd=request.getParameter("pwd"); 
	         String cpwd=request.getParameter("cpwd"); 
	         String email=request.getParameter("email"); 
	         if(cemail != email){
//	        	 test("Email id mismatch"); //No need to put java script code inside scriptlet
	         }
	         if(pwd != cpwd){
//	        	 test("Password mismatch"); //No need to put java script code inside scriptlet
	         }else{
	         Class.forName("com.mysql.jdbc.Driver"); 
	         java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST?autoReconnect=true&useSSL=false",
	         "root","Kirubs@1234"); 
	         Statement st= con.createStatement(); 
	         ResultSet rs; 
	         int i=st.executeUpdate("insert into USER (username,password,firstname,lastname,email) values ('"+user+"','"+pwd+"','"+ fname +"','"+lname +"','"+ email +"')"); 
	         response.sendRedirect("welcome.jsp");
	         return;
	         }
	        } else if (request.getParameter("login_btn") != null) {
	        	response.sendRedirect("login.jsp");
	  
	        } else {
	            
	        }
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	 }catch(Exception ex) {
		 
	 }
	}
}
	
