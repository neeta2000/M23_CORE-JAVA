package com.tns.strings;

public class StringBufferSetCharAtExample {

	public static void main(String[] args) 
	{
		/*StringBuffer sb=new StringBuffer("Pithon");
		System.out.println(sb); //Output-Pithon
		System.out.println(sb.charAt(1)); //Output-i
		sb.setCharAt(1, 'y');
		System.out.println(sb); //Output-Python
		System.out.println(sb.charAt(1)); //Output-y
		*/
		
		StringBuffer sb=new StringBuffer("India");
		System.out.println(sb); //Output-India
		sb.setCharAt(5, 'b');
		System.out.println(sb); //Output-Exception in thread

	}

}
