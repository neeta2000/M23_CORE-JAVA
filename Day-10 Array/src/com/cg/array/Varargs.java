package com.cg.array;

public class Varargs 
{
	//variable arguments  ...(ellipse)=>
	static void print(int a,int b,String... s)
	{
		System.out.println(a+","+b);
		//To print varargs
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		//function call
		print(10,20,"Java","Python","C++","C");

	}

}
