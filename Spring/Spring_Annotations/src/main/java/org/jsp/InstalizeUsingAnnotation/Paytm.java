package org.jsp.InstalizeUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Paytm 
{
	@Autowired
	@Qualifier(value = "SBI")
	private BanckAccount account;

	public BanckAccount getAccount() {
		return account;
	}

	public void setAccount(BanckAccount account) {
		this.account = account;
	}
	
	

}
