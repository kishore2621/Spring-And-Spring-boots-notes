package org.jsp.MydataResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("datasource.xml");
		MysessionFactory msf=con.getBean(MysessionFactory.class);
		System.out.println(msf);
	}

}
