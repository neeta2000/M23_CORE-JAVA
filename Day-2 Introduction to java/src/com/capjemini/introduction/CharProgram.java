package com.capjemini.introduction;
//Program for character input
import java.util.Scanner;
public class CharProgram {

	public static void main(String[] args) {
		//compile time input
		//char x='a';
		Scanner s=new Scanner(System.in);
		//runtime input
		System.out.println("Enter the value of x:-");
		char x=s.next().charAt(0);
		System.out.println("the character is:-"+x);
		
		

	}

}
