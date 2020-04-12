package com.relhibe.FristHibrel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Laptop 
{
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofman() {
		return dateofman;
	}
	public void setDateofman(String dateofman) {
		this.dateofman = dateofman;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	@Id
	private int lid;
	private String name;
	private String dateofman;
	//@ManyToOne
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
}
