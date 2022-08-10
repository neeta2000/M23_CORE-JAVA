package com.cg.abstractkeyword;

abstract class Flower
{
	abstract void print();//abstract method
	void accept()//non-abstract method
	{
		System.out.println("Demo on Abtract keyword");
	}
}

class Lotus extends Flower
{
	void print()
	{
		System.out.println("Lotus is a national flower");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Lotus l=new Lotus();
		l.print();
		l.accept();

	}

}
