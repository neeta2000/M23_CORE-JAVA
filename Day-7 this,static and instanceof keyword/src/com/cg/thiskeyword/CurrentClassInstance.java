package com.cg.thiskeyword;
class Main
{
	public int x,y;
	Main()
	{
		x=10;
		y=20;
	}
	Main get()
	{
		return this;
	}
	public void display()
	{
		System.out.println("Multiplicatin of x and y:"+(x*y));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		Main m=new Main();
		m.get().display();

	}

}
