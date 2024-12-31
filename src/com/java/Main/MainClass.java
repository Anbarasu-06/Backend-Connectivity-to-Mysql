package com.java.Main;

import java.sql.Connection;

import com.java.Connection.Connections;
import com.java.Controller.Controller;

public class MainClass {
	public static void main(String[] args) {
		
		Connections con = new Connections();
		Connection connect = con.loadDriver();
		Controller cont = new Controller(connect);
		cont.fetchData();
//		con.CloseConnection();
		
		
		
	}
}
