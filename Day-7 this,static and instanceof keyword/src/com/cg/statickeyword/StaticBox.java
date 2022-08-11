package com.cg.statickeyword;

public class StaticBox 
{
	double width,height;
	static int count=1;
	public StaticBox(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Count is:"+cnt);
		count++;
		System.out.println("Count is:"+count);
	}

	public static void main(String[] args) {
		StaticBox s=new StaticBox(11,12);
		System.out.println(s.width);
		System.out.println(s.height);

	}

}
