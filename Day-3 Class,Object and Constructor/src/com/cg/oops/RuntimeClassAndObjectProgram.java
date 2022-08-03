package com.cg.oops;

import java.util.Scanner;

class Day
{
	public int a;
	void display()
	{
		System.out.println("Welcome! Today is great day... ");
	}
}

public class RuntimeClassAndObjectProgram {

	public static void main(String[] args) {
		Day d1=new Day();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a:");
		d1.a=s1.nextInt();
		d1.display();
		System.out.println(d1.a);
		s1.close();
	}

}
