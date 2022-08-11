package com.cg.interfacedemo;

interface A
{
	//abstract method by default
	void print();
	void display();
}
class B implements A
{
	public void print()
	{
		System.out.println("India is My Country");
	}
	public void display()
	{
		System.out.println("Today is RakshaBandhan");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		B b=new B();
		b.print();
		b.display();

	}

}
