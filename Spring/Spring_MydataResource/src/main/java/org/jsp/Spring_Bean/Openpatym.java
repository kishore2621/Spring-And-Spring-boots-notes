package org.jsp.Spring_Bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Openpatym 
{
	public static void main(String[] args) 
	{
		Resource resource;
		resource= new ClassPathResource("spring-bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Patym pay;
		pay=(Patym) factory.getBean("patym");
		Patym pay1=factory.getBean(Patym.class);
		Patym pay2=factory.getBean("patym",Patym.class);
		pay.Open();
		pay1.Open();
		pay2.Open();
		
	}
}
