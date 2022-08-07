package com.tns.looping;

import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			//System.out.print(i+" ");
			System.out.println(i+" ");
		}
		s.close();

	}

}
