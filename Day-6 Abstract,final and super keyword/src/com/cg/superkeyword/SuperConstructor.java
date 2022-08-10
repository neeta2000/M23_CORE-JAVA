package com.cg.superkeyword;
class Android
{
	
	Android()
	{
	System.out.println("Realme is Android Mobile");
    }
}

class Realme extends Android
{
	Realme()
	{
		super();
		System.out.println("Hello,hiiii");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		Realme r=new Realme();

	}

}
