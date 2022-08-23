package com.tns.synchronizedconcept;

class Seller
{
	int value=10000;
	synchronized void cost(int Value)
	{
		System.out.println("Spend value");
		if(this.value<value)
		{
			System.out.println("Less Value");
			try
			{ 
				//wait();
			}
			catch(Exception e)
			{}
		}
		this.value=this.value-value;
		System.out.println("process completed");
	}
	synchronized void paid(int value)
	{
		System.out.println("get value");
		this.value=this.value+value;
		System.out.println("completed");
	}
}
public class SynchronizedBlockConcept2 
{

	public static void main(String[] args) 
	{
		Seller s=new Seller();
		new Thread()
		{
			public void run()
			{
				s.cost(20000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				s.paid(10000);
			}
			
		}.start();
	}

}


