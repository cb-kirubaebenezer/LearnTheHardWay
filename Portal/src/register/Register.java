package register;
import java.io.IOException;
import java.sql. * ;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http. * ;
import dbutil.SQLConnection;@WebServlet("/register")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException {
		try {
			if (request.getParameter("register_btn") != null) {
				String user = request.getParameter("email");
				String fname = request.getParameter("fname");
				String lname = request.getParameter("lname");
				String pwd = request.getParameter("pwd");
				Connection con = SQLConnection.getConnection();
				Statement st = con.createStatement();
				String query = "insert into USER(username,password,firstname,lastname,email) values('" + user + "','" + pwd + "','" + fname + "','" + lname + "','" + user + "')";
				st.executeUpdate(query);
				request.getSession(true).setAttribute("userid", user);
				response.sendRedirect("welcome.jsp");
				return;
			} else if (request.getParameter("login_btn") != null) {
				response.sendRedirect("login.jsp");

			} else {

			}
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} catch(Exception ex) {

		}
	}
}