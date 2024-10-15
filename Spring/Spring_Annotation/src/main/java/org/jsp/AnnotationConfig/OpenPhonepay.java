package org.jsp.AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPhonepay 
{
	public static void main(String[] args) {
		ApplicationContext con =new AnnotationConfigApplicationContext(MyConfig.class);
	
		Phonepay p= con.getBean(Phonepay.class);
		p.open();
	}

}
