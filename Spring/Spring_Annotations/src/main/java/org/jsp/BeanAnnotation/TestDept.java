package org.jsp.BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDept 
{
	public static void main(String[] args) {
		
		ApplicationContext con= new AnnotationConfigApplicationContext(Myconfig.class);
		Department d= con.getBean(Department.class);
		System.out.println("Employee Name:"+ d.getEmpnames());
		System.out.println("Manager Name:"+ d.getManagernames());
	}

}
