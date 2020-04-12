package com.caching.cacheExample;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="first")
@Cacheable
@Cache (usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student 

{	
    @Id
	private int rollno;
	//private int id;
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
}
