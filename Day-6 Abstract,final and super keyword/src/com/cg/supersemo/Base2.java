package com.cg.supersemo;
public class Base2 extends Base1
{
	Base2()
	{
		super();
		System.out.println("Default constructor for base2");
	}
	Base2(int i)
	{
		super(i);
		System.out.println("Parameterized constructor for Base2:"+i);
	}
}

