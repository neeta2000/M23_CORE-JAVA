package com.cg.exceptionhandling;

public class ThrowDemo 
{
	//throws keyword is used to 
	public static void display(int age,int weight) throws Exception
	{
		if(age>18 && weight>45)
			System.out.println("Eligible to donate the blood");
		else
		{
			throw new Exception("Exception Caught");
		}
	}

	public static void main(String[] args) throws Exception
	{
		try
		{
			display(20,46);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
