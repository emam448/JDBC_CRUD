package com.task.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class EmployeeUtil {
	
	public static String url="jdbc:mysql://localhost:3306/employee";
	public static String username="root";
	public static String password="root";
	public static Connection conn=null;
	
	
	
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,username,password);
		return conn;
	}
	
	public static void getDBDestroyConnection() throws SQLException {
		conn.close();	
	}
}
