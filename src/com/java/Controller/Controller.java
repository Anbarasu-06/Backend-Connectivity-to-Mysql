package com.java.Controller;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import com.java.Connection.Connections;
import com.java.Entity.Entity;
import com.java.Query.Queries;

public class Controller {
	
	Entity person = new Entity();
	Connections c = new Connections();
	
	private Connection con;
	
	public Controller(Connection con) {
		this.con = con;
	}
	
	public void fetchData() {
		if(c.loadDriver()!= null) {
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(Queries.FETCH);
				while (rs.next()) {
					person.setID(rs.getInt("ID"));
					person.setName(rs.getString("Name"));
					person.setCity(rs.getString("City"));
					person.setEmail(rs.getString("Email"));
					person.setPassword(rs.getNString("Password"));
				    System.out.println(person);
					}
				
				
			}
			catch (Exception e) {
				System.out.println(e);
			}
		
		}
		else {
			System.out.println("Driver is not Loaded");
		}
	}	

}
