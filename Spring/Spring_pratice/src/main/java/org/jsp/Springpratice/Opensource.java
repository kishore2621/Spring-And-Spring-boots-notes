package org.jsp.Springpratice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Opensource 
{
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("Spring-bean.xml");
		Mydatasource s1=con.getBean(Mydatasource.class);
		System.out.println(s1);
	}

}
