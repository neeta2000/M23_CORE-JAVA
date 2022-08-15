package com.tns.strings;

import java.util.Scanner;

public class StringExample5 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter the string:");
		String str1=s.nextLine();
		String str2=s.nextLine();
		//System.out.println(str1.length());
		//System.out.println(str1.charAt(1));
		//System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.concat(str2));
		System.out.println(10+20+"hello"+"world"+10+20);
		s.close();

	}

}
