package com.cg.array;

import java.util.Arrays;

public class UsingArray {
	static void display(int...a)
	{
		//array.sort defines array is a class and sort is a method which sort the value
		//Arrays.sort(a);
		//display array list as it is
		Arrays.asList(a);
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
			
		}
	}

	public static void main(String[] args) {
		display(4,2,7,3,6,5,41);

	}

}
