package com.tns.strings;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		StringBuffer buff=new StringBuffer("Internet of things");
		System.out.println(buff.capacity()); //output-34
		buff=new StringBuffer(" ");
		System.out.println(buff.capacity()); //output-17

	}

}
