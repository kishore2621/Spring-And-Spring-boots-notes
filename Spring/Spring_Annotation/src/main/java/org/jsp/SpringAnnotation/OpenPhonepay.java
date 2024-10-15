package org.jsp.SpringAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPhonepay 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context .register(Phonepay.class);
		context.scan("org.jsp.SpringAnnotation");
		context.refresh();
		Phonepay p= context.getBean(Phonepay.class);
		p.open();
	}

}
