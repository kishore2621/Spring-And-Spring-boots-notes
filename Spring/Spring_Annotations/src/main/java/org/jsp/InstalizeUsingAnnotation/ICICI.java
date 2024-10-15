package org.jsp.InstalizeUsingAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ICICI implements BanckAccount
{

	@Override
	public void display() {

		System.out.println("welcome to ICICI");
		System.out.println("your bank balance is 65000");
	}
	

}
