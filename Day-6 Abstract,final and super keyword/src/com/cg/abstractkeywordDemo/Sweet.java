package com.cg.abstractkeywordDemo;

public class Sweet extends Ice_Cream
{
	public Sweet()
	{
		System.out.println("I like Ice-Cream");
	}
	
	public String Taste()  //non abstract method
	{
		return "Sweet";
	}
	void print()
	{
		System.out.println("Sweet is Ice-Cream");
	}

}
