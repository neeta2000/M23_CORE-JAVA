package com.tns.recursion;
 import java.util.Scanner;
public class FibonacciSeries 
{
	static int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1 ||n==2)
		{
			return 1;
		}
		else
			return fib(n-2)+fib(n-1);
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n value:");
		int x=s.nextInt();
		for(int i=0;i<=x;i++)
		{
			System.out.print(fib(i)+" ");
		}
		s.close();
	}

}
