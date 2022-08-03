package com.cg.oops;
//demo on how to use the class and object
class Car
{
	//variable
	int a;
	void display()
	{
		System.out.println("Welcome to M23 Batch");
	}
}

public class ProgramOnClassAndObject
{
	public static void main(String[] args) {
		//Object creation
		Car obj=new Car();
		//accessing the car class method
		obj.display();
		obj.a=50;  //access variable
		System.out.println(obj.a);

	}

}
