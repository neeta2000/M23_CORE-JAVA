package com.cg.enums;

import java.util.Scanner;

enum Movie
{
	//enums constants
	KGF2,BRAHMASHTRA,PUSHPA,MAJOR;
}
public class EnumWithSwitchCase 
{
	//enum var
	Movie movie;	//constructor for the "EnumWithSwitchCase"
	public EnumWithSwitchCase(Movie movie)
	{
		//as Enum var and constructor arguments var is same-"use this keyword"
		this.movie=movie;
	}
	
	//using switch to display the actor name of the constant (movie)
	public void display()
	{
		switch(movie)
		{
		case KGF2:
			System.out.println("Yash and Srinidhi Shetty");
			break;
		case BRAHMASHTRA:
			System.out.println("Ranbir Kappor and Alia Bhatt");
			break;
		case PUSHPA:
			System.out.println("Allu Arjun and Rashmika");
		case MAJOR:
			System.out.println("Adivi Sesh and Saiee Manjrekar");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie name:");
		String str=s.nextLine();
		//valueOf():-to get the constant whose value is passed as an argument while calling this keyword
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();

	}

}
