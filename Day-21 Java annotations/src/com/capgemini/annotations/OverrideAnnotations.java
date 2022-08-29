package com.capgemini.annotations;
//@Override annotations is giving extra information about the method
class Car
{
	void speed(int i)
	{
		System.out.println("Speed is: "+i+"km/hr");
	}
}

class BMW extends Car
{
	@Override
	void speed(int imp) 
	{
		System.out.println("Speed is: "+imp+"km/hr");
	}
}
public class OverrideAnnotations
{
	public static void main(String[] args)
	{
		BMW b1=new BMW();
		b1.speed(100);
	}

}
