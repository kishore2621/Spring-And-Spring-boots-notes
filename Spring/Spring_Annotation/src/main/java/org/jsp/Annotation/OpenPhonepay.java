package org.jsp.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPhonepay 
{
	public static void main(String[] args) {
		ApplicationContext con =new AnnotationConfigApplicationContext("org.jsp.Annotation");
	
		Phonepay p= con.getBean(Phonepay.class);
		p.open();
	}

}
