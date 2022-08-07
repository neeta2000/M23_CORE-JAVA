package com.tns.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=1;
		while(a<=10)
		{
			System.out.print(a+" ");
			//System.out.println(a);
			a++;
		}
		s.close();

	}

}
