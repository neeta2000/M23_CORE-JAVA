package com.cg.oops;
class Animal
{
	int x;
	Animal()
	{
		x=15;
	}
	void display()
	{
		System.out.println("Tiger"+" "+x);
	}
}
public class NonParameterizedConstructor {

	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.display();
	}

}
