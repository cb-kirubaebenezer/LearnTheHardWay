package com.chargebee.app.week3;
import java.sql.*;
import java.util.*;
import com.chargebee.app.week2.day12.phonedirectory.week2model.*;
import com.chargebee.app.week2.day12.Day12;
import com.chargebee.app.week2.util.*;

public class Week3App {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/TRAINING_SAMPLE?autoReconnect=true&useSSL=false";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "Kirubs@1234";

    public static void main(String[] args) {
        try {
            //doOperation();
            Day12 day12 = new Day12();
            insertData(day12.task3());
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        
    }
    public static void doOperation() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();  
            ResultSet rs = stmt.executeQuery("SELECT user_id, login_id, password FROM USER");           
            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                int login_id = rs.getInt("login_id");
                String password = rs.getString("password");
                System.out.print("ID: " + user_id);
                System.out.print(", Login ID: " + login_id);
                System.out.println(", Password: " + password);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        } 
        catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
    public static Connection getConnection(String connectionUrl,String username, String password) {
        Connection con;
        try {
            Driver dr = new com.mysql.cj.jdbc.Driver();
            Properties properties = new Properties();
            properties.put("user",username);
            properties.put("password",password);

            con = dr. connect(connectionUrl,properties);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void insertData(ArrayList<User> users){
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();  
            for (User user : users) {
                stmt.executeUpdate("INSERT INTO USER(id,name) values('" + user.getId() + "','" + user.getName() + "')");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {

        }
    }
}