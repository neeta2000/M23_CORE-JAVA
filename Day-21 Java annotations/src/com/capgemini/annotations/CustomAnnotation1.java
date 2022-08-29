package com.capgemini.annotations;
//custom annotations
@interface Custom
{
	//abstract method
	//any custom annotation that contains the single method is called single-value annotation
	//here we use multiple method so it is called as multi-value annotations
	String print() default "Maharashtra";
	String address() default "Pune";
	float percent() default 88f;
	
}

class B
{
	@Custom (print="Hello Friends",address="Nashik", percent=80f)
	public void display()
	{
		System.out.println("Today is Holiday");
	}
}
public class CustomAnnotation1 {

	public static void main(String[] args) {
		B b=new B();
		b.display();
		
		
		
		
		

	}

}
