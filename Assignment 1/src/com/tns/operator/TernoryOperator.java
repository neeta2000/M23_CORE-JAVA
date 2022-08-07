package com.tns.operator;

import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//int b=s.nextInt();
	    //boolean res=(a!=b)?true:false;
	    String res=(a%2==0)?"Even":"Odd";
		System.out.println(res);
		s.close();

	}

}
