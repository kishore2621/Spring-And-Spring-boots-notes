package org.jsp.MydataResource;

public class MyDataSource {

	private String url, username, driverclassname,password;
	
	

	@Override
	public String toString() {
		return "MyDataSource [url=" + url + ", username=" + username + ", driverclassname=" + driverclassname
				+ ", password=" + password + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDriverclassname() {
		return driverclassname;
	}

	public void setDriverclassname(String driverclassname) {
		this.driverclassname = driverclassname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
