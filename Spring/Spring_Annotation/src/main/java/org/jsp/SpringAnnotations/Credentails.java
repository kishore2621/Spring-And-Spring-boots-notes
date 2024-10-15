package org.jsp.SpringAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Credentails 
{
	@Value(value = "${jdbc.user.name}")
	private String username;
	@Value(value = "${jdbc.user.password}")
	private String password;
	
	
	
	@Override
	public String toString() {
		return "Credentails [username=" + username + ", password=" + password + "]";
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
