package com.tns.multithreading;

class Test2
{
	//public synchronized void display()
	public static synchronized void display()
	{
		System.out.println("Current thread "+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"i-"+i);
			try
			{
				Thread.sleep(30);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Valueof implements Runnable
{
	Thread t;
	Test2 val;
	Valueof(Test2 val)
	{
		this.val=val;
		t=new Thread(this);
		t.start();
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		val.display();
	}
}
public class Without_Static_Synchronization {

	public static void main(String[] args) {
		Test2 t2=new Test2();
		Test2 t22=new Test2();
		Valueof v1=new Valueof(t2);
		Valueof v2=new Valueof(t22);

	}

}
