package com.lib.obj;

public class objectone 
{
	public static void main(String[] args) 
	{
     	objectone obj =new objectone();
		
		objectone obj1= new objectone();
	//   class  Fully qualified  class name
		System.out.println(obj.getClass()); 
	//unique integer value based on given address of object
		System.out.println(obj.hashCode()); 
	//Given string representation 
		System.out.println(obj1.toString());
	// compare hashcode value of given object
		System.out.println(obj.equals(obj1));
	// clone object
		try {
			System.out.println(obj.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
