package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private static float creditLimit;

	//constructor
	@SuppressWarnings("static-access")
	public CurrentAcc(int accno, String accname, float accbal,float creditLimit) {
		super(accno, accname, accbal);
		this.creditLimit=creditLimit;
		
	}
	
	

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=100]";
	}

	public void withdraw(float withdraw)	
	{
		if(withdraw>=creditLimit)
			
		{
			System.out.println("Your credit limit is "+creditLimit);
			System.out.println("Account No-"+this.getAccno()+"\nAccount Name-"+this.getAccname()+"\nAccount Balance-"+(Accbal-withdraw));
		}
		else
		{
	
		System.out.println("Account Balance is:0");
	    }

     }	
}