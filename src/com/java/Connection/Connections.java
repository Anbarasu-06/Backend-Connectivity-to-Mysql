package com.java.Connection;

import java.sql.*;

public class Connections {
	
	final static String URL = "jdbc:mysql://localhost:3306/Student";
	final static String USERNAME ="root";
	final static String PASSWORD = "Anbarasu@26";
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	   
	
	private Connection con;
	
	
	
	public Connection loadDriver() {
		try {
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	public void CloseConnection() {
		try{
			if(con != null && !con.isClosed()) {
				con.isClosed();
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
