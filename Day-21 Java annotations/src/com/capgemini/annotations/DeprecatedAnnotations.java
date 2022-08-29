package com.capgemini.annotations;

class A
{
	//it allows any element no longer to be used
	@Deprecated
	public void print()
	{
		System.out.println("Welcome Ganapati Bappa");
	}
}
public class DeprecatedAnnotations {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}
