package com.cg.exceptionhandling;

public class FinallyDemo
{
	
		public static void print(int[] arr) 
	    {
		   System.out.println(arr[3]);
		   System.out.println("Fourth element successfully displayed!");
	    }

		public static void main(String[] args)
		{
			System.out.println("First line");
		    System.out.println("Second line");
		    //finally block will not execute because of below line
		    System.exit(0);
		    try
		    {
		        int[] myIntArray = new int[]{1, 2, 3};
		        print(myIntArray);
		    }
		        
		    catch(Exception e)
		    {
		       System.out.println(e);
		    }
		    //if any statement is out of the try/catch block that will always executed
		    //finally block
		    finally
		    {
		    	System.out.println("Finally block is always excuted");
		    }
		    System.out.println("Third line");

	}
}


