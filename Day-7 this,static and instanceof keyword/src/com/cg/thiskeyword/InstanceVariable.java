package com.cg.thiskeyword;
class X
{
	int m1,m2;
	public void print(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void display()
	{
		System.out.println("Addition of m1 and m2="+(m1+m2));
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		X x1=new X();
		x1.print(10,20);
		x1.display();

	}

}
