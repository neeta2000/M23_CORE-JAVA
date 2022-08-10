package com.cg.finalkeyword;
//Program on final variable
public class FinalVariable
{
	final int FIN_VAR=55;
	void print()
	{
		//if variable declare as final we can't change value of that variable
		//FIN_VAR=66;
	}

	public static void main(String[] args) 
	{		
		FinalVariable f1=new FinalVariable();
		System.out.println(f1.FIN_VAR);
		
	}

}
