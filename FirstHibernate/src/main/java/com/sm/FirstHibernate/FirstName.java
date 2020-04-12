package com.sm.FirstHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FirstName
{
	@Id
	private int empid;
	private String empname;
	private String empadd;
	private int Phone;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "FirstName [empid=" + empid + ", empname=" + empname + ", empadd=" + empadd + ", Phone=" + Phone + "]";
	}
	
}
