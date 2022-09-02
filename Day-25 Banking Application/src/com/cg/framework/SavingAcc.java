package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
   @SuppressWarnings("unused")
private static final float MINBAL=500;
   

	
public SavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
	super(accno, accname, accbal);
	this.isSalaried = isSalaried;
}

public void withdraw(float withdraw)

{
	if(Accbal<MINBAL)
	{
		System.out.println("Account Balance Minimum Limit "+MINBAL);
	}
	else
	{
		System.out.println("Account No-"+this.getAccno()+"\nAccount Name-"+this.getAccname()+"\nAccount Balance-"+(Accbal-withdraw));
}}
@Override
public String toString() {
	return String.format("SavingAcc [isSalaried=%s]", isSalaried);
}
	
	
}