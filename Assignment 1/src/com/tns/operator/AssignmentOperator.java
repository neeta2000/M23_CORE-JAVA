package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//int res=(x+=y);
		//int res=(x*=y);
		int res=(x%=y);
		System.out.println(res);
		s.close();

	}

}
