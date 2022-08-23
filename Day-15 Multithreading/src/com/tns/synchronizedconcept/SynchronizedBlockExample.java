package com.tns.synchronizedconcept;

class A
{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1;i<=2;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

class B extends Thread
{
	A a1;
	B(A a1) {
	}
	{
		this.a1=a1;
	}
	public void run()
	{
		a1.print(50);
	}
}
public class SynchronizedBlockExample
{

	public static void main(String[] args)
	{
		A a=new A();
		B t1=new B(a);
		B t2=new B(a);
		t1.start();
		t2.start();

	}

}
