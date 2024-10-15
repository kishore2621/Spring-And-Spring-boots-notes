package org.jsp.Springpratice;

public class Mydatasource 
{
	
	
	
	private String user;
	private String url;
	private String driverclass;
	private String password;
	
	
	
	public Mydatasource() {
		
	}
	
	
	public Mydatasource(String user, String url, String driverclass, String password) {
		
		this.user = user;
		this.url = url;
		this.driverclass = driverclass;
		this.password = password;
	}
	
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverclass() {
		return driverclass;
	}
	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Mydatasource [user=" + user + ", url=" + url + ", driverclass=" + driverclass + ", password=" + password
				+ "]";
	}
}
