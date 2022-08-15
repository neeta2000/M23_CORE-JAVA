package com.tns.strings;

import java.util.Scanner;

public class StringExample4 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str1="Dhoni";
		System.out.print("Enter the str2:");
		String str2=s.nextLine();
		if(str1.equals(str2))
		{
			System.out.print("String is Matched");
		}
		else
		{
			System.out.print("String is Not Matched");
		}
		/*System.out.print("Enter the string1:");
		String str1=s.nextLine();
		System.out.print("Enter the string2:");
		String str2=s.nextLine();
		System.out.println(str1==str2);
		System.out.print(str1.equals(str2));
		s.close();
		*/
		s.close();

	}

}
