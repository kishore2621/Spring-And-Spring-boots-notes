package org.jsp.propertyFile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo 
{
	
	

	public static void main(String[] args) 
	{
		Properties p1 = new Properties();
		p1.setProperty("fqn", "com.mysql.jdbc.Driver");
		p1.setProperty("url", "jdbc:mysql://localhost:3306");
		p1.setProperty("user", "root");
		p1.setProperty("password", "admin");
		
		try {
			p1.store(new FileOutputStream("D:\\DBConnection"),"db") ;
			
			System.out.println("stored");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		
		//-------------------------------------------------------//
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs = null;
		String ret="select * from btm.students";
		try {
			p1.load(new FileInputStream("D:\\DBConnection"));
				
			Class.forName(p1.getProperty("fqn"));
			con=DriverManager.getConnection(p1.getProperty("url"),p1);
			stmt =con.createStatement();
			rs=stmt.executeQuery(ret);
			System.out.println("reterive the record");
			 while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                double perc=rs.getDouble("perc");
               System.out.println("ID: " + id + ", Name: " + name +" , perc:  " +perc);
	            }
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
