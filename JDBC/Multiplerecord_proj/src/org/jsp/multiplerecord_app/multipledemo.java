package org.jsp.multiplerecord_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class multipledemo {
	
	public static void main(String[] args) {
		
		
		Connection con= null;
		PreparedStatement ps=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			ps=con.prepareStatement("insert into btm.students value(?,?,?)");
			ps.setInt(1, 101);
			ps.setString(2, "guru");
			ps.setDouble(3,80.00);
			ps.executeUpdate();
			ps.setInt(1, 105);
			ps.setString(2, "raj");
			ps.setDouble(3,67.90);
			ps.executeUpdate();
			System.out.println("inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
finally {
	try
	{
	
    if (ps != null) ps.close();
    if (con != null) con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	}

}
