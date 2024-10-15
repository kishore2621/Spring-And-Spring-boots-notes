package org.jsp.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testcredentials 
{
	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(Myconfig.class);
		Credentails c= con.getBean("credentails",Credentails.class);
		System.out.println(c);
	}

}
