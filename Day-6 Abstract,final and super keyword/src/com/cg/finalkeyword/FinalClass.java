package com.cg.finalkeyword;

final class Fruit
{
	Fruit()
	{
		System.out.println("Constructor");
	}
	public void accept()
	{
		System.out.println("Parent class");
	}
}
class Apple extends A
{
	public void accept()
	{
		System.out.println("Parent class");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.accept();

	}

}
