package com.tns.synchronizedconcept;
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("work");
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException("Thread inerrupted"+e);
		}
	}
}
public class InterruptMethod {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		try
		{
			t1.interrupt();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}

	}

}
