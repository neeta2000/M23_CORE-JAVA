package com.tns.synchronizedconcept;

class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("Sleep/Work");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Handled"+e);
		}
		System.out.println("thread is running");
	}
}
public class InterruptMethodConcept {

	public static void main(String[] args) {
		Thread2 t1=new Thread2();
		t1.start();
		t1.interrupt();

	}

}
