package com.capjemini.introduction;

import java.util.Scanner;

//String input
public class StringInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x:-");
		//String x=s.next();     //next()-take first word
		String x=s.nextLine();   //nextLine-take full sentence
		System.out.println("the value of x:-"+x);
	}

}
