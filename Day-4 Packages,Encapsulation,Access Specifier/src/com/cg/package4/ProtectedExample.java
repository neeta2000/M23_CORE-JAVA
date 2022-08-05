package com.cg.package4;
class Fruit
{
	//if any variable or method is protected we can access inside in child class
	protected void print()
	{
		System.out.println("Fruits are Sweet");
	}
}
class Mango extends Fruit
{
	//mango class is accessing properties of fruit class
}
public class ProtectedExample 
{

	public static void main(String[] args)
	{
		Mango m1=new Mango();
		m1.print();
	}
		
}

    
