package org.jsp.MydataResource;

import java.util.*;

public class MysessionFactory 
{
	private MyDataSource datasource;
	private List<String> mappingresource;
	private Properties hibernateproperties;
	
	
	
	@Override
	public String toString() {
		return "MysessionFactory [datasource=" + datasource + ", mappingresource=" + mappingresource
				+ ", hibernateproperties=" + hibernateproperties + "]";
	}
	public MyDataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(MyDataSource datasource) {
		this.datasource = datasource;
	}
	public List<String> getMappingresource() {
		return mappingresource;
	}
	public void setMappingresource(List<String> mappingresource) {
		this.mappingresource = mappingresource;
	}
	public Properties getHibernateproperties() {
		return hibernateproperties;
	}
	public void setHibernateproperties(Properties hibernateproperties) {
		this.hibernateproperties = hibernateproperties;
	}
	

}
