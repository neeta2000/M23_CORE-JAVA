package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("and");
		System.out.println("Enter the string:");
		Matcher m=p.matcher(s.nextLine());
		//Matcher m=p.matcher("Java is Good Language to learn and earn money");
		//it will check "and" location until last and it will print
		while(m.find())
		{
			System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
		}
		s.close();
		
		
		

	}

}
