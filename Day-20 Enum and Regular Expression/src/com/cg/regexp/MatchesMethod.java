package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchesMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String pattern="S$K#Z";
		System.out.print("Enter Pattern:");
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();

	}

}
