package welcome;
import java.io.IOException;
import java.sql.*;
import dbutil.SQLConnection;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.User;
@WebServlet("/welcome")
public class Welcome extends HttpServlet{
	public User getUser(String userid) {
		User user = new User();
		try {
			Connection con = SQLConnection.getConnection();
			Statement st= con.createStatement(); 
            ResultSet rs=st.executeQuery("select firstname,lastname,email from USER where username='"+userid.trim()+"'"); 
            if(rs.next()) 
            { 
            	user.setUsername(rs.getString("firstname") +" " + rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
            } 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
