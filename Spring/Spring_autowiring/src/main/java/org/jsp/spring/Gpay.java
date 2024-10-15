package org.jsp.spring;

public class Gpay 
{
	private bankaccount acc;

	public bankaccount getAcc() {
		return acc;
	}

	public void setAcc(bankaccount acc) {
		this.acc = acc;
	}

	public Gpay(bankaccount acc) {
		super();
		this.acc = acc;
	}
	public Gpay() {
		// TODO Auto-generated constructor stub
	}

}
