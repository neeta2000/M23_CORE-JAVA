package com.tns.strings;

public class StringBuilderExample {

	public static void main(String[] args) 
	{
		//StringBuilder s=new StringBuilder("");
		//System.out.println(s); //No Output
		
		//StringBuilder s=new StringBuilder("Independance Day");
		//System.out.println(s);   //Output-Independance Day
		
		//String s="Monday";
		//StringBuilder sb=new StringBuilder(s.length());
		//System.out.println(sb.capacity()); //Output-6
		
		//StringBuilder sb=new StringBuilder("Today");
		//sb.append("Monday");
		//System.out.println(sb); //Output-TodayMonday
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity()); //Output-16
		sb.append("Sun");
		System.out.println(sb.capacity()); //Output-16
		sb.append("Today is Independence day");
		System.out.println(sb.capacity()); //Output-34

	}

}
