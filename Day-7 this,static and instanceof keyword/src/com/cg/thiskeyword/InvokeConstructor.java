package com.cg.thiskeyword;
//this() :to invoke current class constructor
class Z
{
	public int x;
	Z()
	{
		this(30);
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	Z(int x)
	{
		System.out.println("Value is:"+x);
	}
}
public class InvokeConstructor {

	public static void main(String[] args) {
		Z obj=new Z();

	}

}
