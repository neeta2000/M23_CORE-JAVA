package com.cg.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//array declaration
		int a[]=new int[x];
		System.out.println("Enter the values:");
		//to enter the element in the array
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the "+i+" index:");
			a[i]=s.nextInt();
		}
		//to print the element in the array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			a[i]=s.nextInt();
		}

	}

}
