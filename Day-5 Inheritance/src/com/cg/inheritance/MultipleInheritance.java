package com.cg.inheritance;
class Grammar
{
	void check()
	{
		System.out.println("English Grammar");
	}
}

class Tense extends Grammar
{
	void type()
	{
		System.out.println("\nThree main tense:-\n1.Present Tense \n2.Past tense \n3.Future Tense");
	}
}

class Sentence extends Tense
{
	public void print()
	{
		System.out.println("\nSentence:- India is My Country ");
	}

}
public class MultipleInheritance {

	public static void main(String[] args) {
		Sentence s1=new Sentence();
		s1.check();
		s1.type();
		s1.print();
		
	}

}
