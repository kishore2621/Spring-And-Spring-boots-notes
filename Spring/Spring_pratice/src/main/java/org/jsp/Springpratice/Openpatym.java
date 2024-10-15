package org.jsp.Springpratice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Openpatym 
{
	public static void main(String[] args) {
		Resource r;
		r=new ClassPathResource("Spring-bean.xml");
		BeanFactory b =new XmlBeanFactory(r);
		Patym p1;
//		p1= (Patym) b.getBean("patym");
//		p1=b.getBean(Patym.class);
		p1=b.getBean("patym",Patym.class );
		p1.open();
		
	}

}
