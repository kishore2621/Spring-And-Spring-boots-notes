package org.jsp.jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conection 
{
	

	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement stmt = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connected");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			 System.out.println("established connection between java applicationn to database server");
			 stmt = con.creat;
			 System.out.println("create sql quries");
//			stmt.executeUpdate("insert into btm.students value(101,'kishore',69.70)");
//			stmt.executeUpdate("insert into btm.students value(102,'sumit',80.70)");
//			stmt.executeUpdate("insert into btm.students value(103,'rahul',75.70)");
//			stmt.executeUpdate("insert into btm.students value(104,'uday',79.70)");
			System.out.println("isert");
			stmt.executeUpdate("insert into btm.student values (?, ?, ? )");
			stmt.setInt
			
			System.out.println("deleted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
