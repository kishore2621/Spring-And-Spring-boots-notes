package org.jsp.InstalizeUsingAnnotation;

import org.springframework.stereotype.Component;

@Component
public class SBI implements BanckAccount
{

	@Override
	public void display() {

		System.out.println("welcome to SBI");
		System.out.println("Your bank balance is 2500");
	}

}
