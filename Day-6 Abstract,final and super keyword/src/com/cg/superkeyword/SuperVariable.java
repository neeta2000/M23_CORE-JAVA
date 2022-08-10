package com.cg.superkeyword;
class Color
{
	public String name="Orange";
}

class Green extends Color
{
	public String name="Green";
	public void display()
	{
		System.out.println(name);
		//super keyword is used to refer the parent class variable
		System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Green g=new Green();
		g.display();

	}

}
