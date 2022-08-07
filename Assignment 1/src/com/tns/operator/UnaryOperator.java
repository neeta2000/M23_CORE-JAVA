package com.tns.operator;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
	    //int res=a++;  //a
	    //int res=++a;  //a+1
		//int res=--a;  //a-1
		int res=a--;    //a
		System.out.println(res);
		s.close();

	}

}
