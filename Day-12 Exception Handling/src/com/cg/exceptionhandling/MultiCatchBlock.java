package com.cg.exceptionhandling;

public class MultiCatchBlock {

	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			System.out.println("a= "+a);
			int b=54/a;
			int arr[]= {12};
			arr[3]=65;
	    }
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}

}
}
