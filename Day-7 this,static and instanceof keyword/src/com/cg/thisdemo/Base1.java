package com.cg.thisdemo;

public abstract class Base1 {
	Base1()
	{
		this(50);
		System.out.println("Default constructor for Base1");
	}
	Base1(int i)
	{
		System.out.println("Parameterized constructor for base1:"+i);
	}

}
