package com.example.demo;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Placement
{
	@Id
	private int id;
	private String name;
	private String qualification;
	private String college;
	private int year;
	public Placement(int id, String name, String qualification,String college,int year)
	{
		
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.college=college;
		this.year=year;
		
	}
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getqualification() {
		return qualification;
	}

	public void setqualification(String qualification) {
		this.qualification = qualification;
	}
	public String getcollege() {
		return college;
	}

	public void setcollege(String college) {
		this.college = college;
	}
	public int getyear() {
		return year;
	}

	public void setyear(int year) {
		this.year=year;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", qualification=" + qualification + ", college=" + college + ", year=" + year + "]";
	}



	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
