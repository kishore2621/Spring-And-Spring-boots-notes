package org.jsp.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Spring-bean.xml");
		Car c= con.getBean(Car.class);
		c.start();
	}

}
