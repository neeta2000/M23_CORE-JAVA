package com.tns.recursion;

import java.util.Scanner;
public class Sum_of_digit {
	static int sum_digit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
			return sum_digit(n%10)+sum_digit(n/10);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=s.nextInt();
		int res=sum_digit(n);
		System.out.print("Sum of Digit="+res);
		s.close();
		
	}

}
