package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	public static Connection getconnection()
	{
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_managment","root","N20y2m250x@");
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return conn;
	}

}
