package com.tns.operator;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
	    //int res=a&b;
	    //int res=a|b;
		//int res=a>>b;
		//int res=a^b;
		int res=a<<b;
		System.out.println(res);
		s.close();

	}

}
