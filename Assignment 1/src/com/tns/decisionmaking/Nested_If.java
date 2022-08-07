package com.tns.decisionmaking;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int wt=s.nextInt();
		if(age>=18)
		{
			if(wt>=35)
			{
				if(wt<=100)
				{
					System.out.println("You are eligible to donate the blood");
				}
				else
				{
				System.out.println("Extra weight is there");
				}
			}
			else
			{
			System.out.println("Weight is less");
			}
		}
		else
		{
			System.out.println("You are not eligible");
		}
		s.close();
		
	}

}
