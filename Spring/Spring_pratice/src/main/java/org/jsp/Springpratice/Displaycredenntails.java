package org.jsp.Springpratice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Displaycredenntails 
{
	public static void main(String[] args) {
		Resource r1;
		r1= new ClassPathResource("Spring-bean.xml");
		BeanFactory b1 =new XmlBeanFactory(r1);
		Credentials c1;
		c1= b1.getBean(Credentials.class);
		c1.setUsername("Gautam");
		c1.setPassword("@1234");
		
		
		
	}

}
