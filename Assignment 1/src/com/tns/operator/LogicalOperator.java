package com.tns.operator;

import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//boolean res=(a>b)&&(a>=b);
		//boolean res=(a==b)||(a>b);
		boolean res=!(a==b);
		System.out.println(res);
		s.close();

	}

}
