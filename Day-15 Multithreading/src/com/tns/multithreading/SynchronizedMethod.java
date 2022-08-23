package com.tns.multithreading;

import java.lang.*;
@SuppressWarnings("unused")
class Test1
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread
{
	Test1 t;
	Thread1(Test1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class Thread2 extends Thread
{
	Test1 t;
	Thread2(Test1 t)
	{
	this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
	
}
public class SynchronizedMethod
{

	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();

	}

}
