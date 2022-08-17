package com.cg.exceptionhandling;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		@SuppressWarnings("unused")
		int a=10,res=0;
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		//try block contains exception and non-exception code
		try 
		{
			 res=a/b;
		}
		//handling the exception using catch block
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
		}
		
		s.close();

	}

}
