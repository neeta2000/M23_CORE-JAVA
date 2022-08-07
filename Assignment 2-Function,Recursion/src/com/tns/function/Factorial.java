package com.tns.function;

import java.util.Scanner;
public class Factorial {
	static int factorial(int n) //function definition
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return(fact);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the n value:");
		int n=s.nextInt();
		System.out.print(factorial(n));  //function call
		s.close();

	}

}
