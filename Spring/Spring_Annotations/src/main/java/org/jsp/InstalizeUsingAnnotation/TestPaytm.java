package org.jsp.InstalizeUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPaytm 
{
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Myconfig.class);
		Paytm p = con.getBean(Paytm.class);
		p.getAccount().display();
	}

}
