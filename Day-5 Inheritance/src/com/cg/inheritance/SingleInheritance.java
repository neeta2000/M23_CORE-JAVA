package com.cg.inheritance;
class Bird
{
	void display()
	{
		System.out.println("There are many bird in the world!!!!");
	}
}

class Peacock extends Bird
{
	void print(String a)
	{
		System.out.println(a+ ":Is a Bird");
	}
}
public class SingleInheritance {

	public static void main(String[] args) 
	{
		Peacock p=new Peacock();
		p.display();
		p.print("Sparrow");
	}

}
