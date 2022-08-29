package com.capgemini.annotations;

class Birds
{
	Birds()
	{
		System.out.println("Sparrow");
	}
	public void print()
	{
		System.out.println("Peacock");
	}
}
public class SuppessWarningAnnotations {

	public static void main(String[] args) {
		@SuppressWarnings("unused") //will remove the compiler warning
		Birds b=new Birds();
		
	}

}
