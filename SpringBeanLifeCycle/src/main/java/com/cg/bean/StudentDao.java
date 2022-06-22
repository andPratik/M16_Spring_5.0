package com.cg.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao 
{
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/CG1";
	private String usr = "root";
	private String pwd = "pass1221";
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		//load a driver 
		Class.forName("driver");
		
		Connection cnn = DriverManager.getConnection(url,usr,pwd);
		Statement stm = cnn.createStatement();
		ResultSet r = stm.executeQuery(null)
		
		while(r.next())
		{
			int id=r.getInt(1);
			String title=r.getString(2);
			String author=r.getString(3);
			double price=r.getDouble(4);
			System.out.println("Author ID: "+id+" title "+title+" Author name is: "+author
					+" price: "+price);
		}
		}
	}
}
