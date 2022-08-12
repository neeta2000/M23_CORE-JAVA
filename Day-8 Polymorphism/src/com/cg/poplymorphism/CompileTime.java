package com.cg.poplymorphism;
class A
{
	//by having different types of arguments
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}
public class CompileTime {

	public static void main(String[] args) {
		A a=new A();
		a.add(10,20);
		a.add(3.2f,4.5f);

	}

}
