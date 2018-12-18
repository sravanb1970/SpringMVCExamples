package com.Employee.bo;

public class EmpBO {

	private int eno;
	private String ename,ejob;
	private int esalary;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEjob() {
		return ejob;
	}
	public void setEjob(String ejob) {
		this.ejob = ejob;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "EmpBO [eno=" + eno + ", ename=" + ename + ", ejob=" + ejob + ", esalary=" + esalary + "]";
	}
	public EmpBO(int eno, String ename, String ejob, int esalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.ejob = ejob;
		this.esalary = esalary;
	}
	
}
