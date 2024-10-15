package org.jsp.BeanAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department 
{
	@Autowired
	private List<String> empnames;
	@Autowired
	private List<String >managernames;
	public List<String> getEmpnames() {
		return empnames;
	}
	public void setEmpnames(List<String> empnames) {
		this.empnames = empnames;
	}
	public List<String> getManagernames() {
		return managernames;
	}
	public void setManagernames(List<String> managernames) {
		this.managernames = managernames;
	}

}
