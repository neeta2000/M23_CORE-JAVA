package com.tns.multithreading;

public class ThreadingExample extends Thread
{ 
	public void run()
	{
		System.out.println("Thread is going to run");
	}
	

	public static void main(String[] args)
	{
		ThreadingExample t1=new ThreadingExample();
		t1.start();

	}

}
