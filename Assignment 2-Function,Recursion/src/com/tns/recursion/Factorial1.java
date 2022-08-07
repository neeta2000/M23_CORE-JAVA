package com.tns.recursion;

import java.util.Scanner;

public class Factorial1 {
	static int factorial(int n) //function definition
	{
		if(n==1)
		{
			return 1;
		}
		else
			return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the n value:");
		int n=s.nextInt();
		System.out.print(factorial(n));  //function call
		s.close();
	}


}
