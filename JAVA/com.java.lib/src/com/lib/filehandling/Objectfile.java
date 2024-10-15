package com.lib.filehandling;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class students implements Serializable
{
	String name;
   transient   int id;
	students( String n, int id)
	{
		this.name=n;
		this.id=id;
		
	}  
}

public class Objectfile 
{
	public static void main(String[] args) 
	{
		students s1= new students("sumit", 12);
		
		try {
			FileOutputStream f= new FileOutputStream("students.text");
			ObjectOutputStream ob1= new ObjectOutputStream(f);
			ob1.writeObject(s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream f1= new FileInputStream("students.text");
			ObjectInputStream ob= new ObjectInputStream(f1);
			students s2=(students)ob.readObject();
			System.out.println(s2.name);
			System.out.println(s2.id);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
