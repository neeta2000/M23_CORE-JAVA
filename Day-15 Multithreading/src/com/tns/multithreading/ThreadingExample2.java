package com.tns.multithreading;

class Test extends Thread
{
	public void run()
	{
		System.out.println("Process Error");
	}
}
public class ThreadingExample2 
{
	public static void main(String[] args) {
		Test t2=new Test();
		t2.start();
		t2.start();
		//t2.run();
		//t2.run();
	}
}
