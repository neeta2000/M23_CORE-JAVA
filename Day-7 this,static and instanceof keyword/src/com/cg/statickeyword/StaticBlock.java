package com.cg.statickeyword;

public class StaticBlock
{
	static int num;
	static String str;
	//static block :if you want to intialize the value without using constructor and object creation 
	//then use static block
	//and make the variable of the class as static
	static 
	{
		num=10;
		str="India";
	}
	/*//constructor
	StaticBlock()
	{
		num=10;
		str="India";
	}*/

	public static void main(String[] args) {
		//StaticBlock s1=new StaticBlock();
		//System.out.println(s1.num);
		//System.out.println(s1.str);
		System.out.println(num);
		System.out.println(str);

	}

}
