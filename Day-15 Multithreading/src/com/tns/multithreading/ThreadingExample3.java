package com.tns.multithreading;

public class ThreadingExample3 {

	public static void main(String[] args)
	{
		Thread t=new Thread();
		System.out.println("Current Threads:"+t);
		t.setName("Void");
		System.out.println("Current Threads:"+t);
		try
		{
			Thread.sleep(1);	
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
			
		}

	}

}
