package dbutil;
import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
public class SQLConnection {
	private static String DRIVER_URL = "com.mysql.jdbc.Driver";
	private static String CONNECTION_URL = "jdbc:mysql://localhost:3306/TEST?autoReconnect=true&useSSL=false";
	private static String USERNAME = "root";
	private static String PASSWORD = "Kirubs@1234";

	public static Connection getConnection() throws ServletException, IOException{
		try {
			Class.forName(DRIVER_URL); 
			return DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
		}
		catch(Exception ex) {
			return null;
		}
	}
}
