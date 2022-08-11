package com.cg.interfacedemo;
interface Father
{
	void property();
}

interface Mother
{
	void love();
}
class Daughter implements Father,Mother
{
	public void property()
	{
		System.out.println("Father gives property to child");
	}
	public void love()
	{
		System.out.println("Mother gives love to child");
	}
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d1=new Daughter();
		d1.property();
		d1.love();

	}

}
