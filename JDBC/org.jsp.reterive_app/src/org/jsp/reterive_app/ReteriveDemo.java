package org.jsp.reterive_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ReteriveDemo 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs = null;
		String ret="select * from btm.students";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			stmt =con.createStatement();
			rs=stmt.executeQuery(ret);
			System.out.println("reterive the record");
			 while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                double perc=rs.getDouble("perc");
               System.out.println("ID: " + id + ", Name: " + name +" , perc:  " +perc);
	            }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
			if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
