package com.tns.strings;

import java.util.Scanner;
public class StringExample2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=new String(s.nextLine());
		//String str=new String("Hello Everyone");
		System.out.println(str);
		s.close();

	}

}
