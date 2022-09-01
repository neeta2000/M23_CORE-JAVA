package com.cg.entities;

public class Employee
{
	private int ID;
	private String Ename;
	public int getID() {
		return ID;
	}
	//parameterized constructor
	public Employee(int iD, String ename) {
		super();
		ID = iD;
		Ename = ename;
		
	}
	
	//default constructor
	public Employee() {
		super();
		
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Ename=" + Ename + "]";
	}

}
