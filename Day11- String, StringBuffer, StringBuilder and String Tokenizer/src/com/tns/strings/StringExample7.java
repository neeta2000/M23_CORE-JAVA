package com.tns.strings;

public class StringExample7 {

	public static void main(String[] args)
	{
		//StringBuffer s=new StringBuffer("");
		//System.out.println(s.capacity()); // output-16
		
		//StringBuffer s=new StringBuffer("Pokemon");
		//System.out.println(s); // output-Pokemon
		
		String s="Today";
		StringBuffer sb=new StringBuffer(s.length());
		System.out.println(sb.capacity()); //output-5
		
		

	}

}
