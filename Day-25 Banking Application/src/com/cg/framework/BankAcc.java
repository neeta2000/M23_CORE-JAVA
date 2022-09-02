package com.cg.framework;

public abstract class BankAcc {
	private int AccNo;
	private String AccNm;
   protected float Accbal;
	public BankAcc(int accno, String accnm, float accbal) {
		super();
		AccNo = accno;
		AccNm = accnm;
		Accbal = accbal;
	}
	
	public int getAccno() {
		return AccNo;
	}
	public void setAccno(int accno) {
		AccNo = accno;
	}
	public String getAccname() {
		return AccNm;
	}
	public void setAccname(String accnm) {
		AccNm = accnm;
	}
	public float getAccbal() {
		return Accbal;
	}
	public void setAccbal(float accbal) {
		Accbal = accbal;
	}
     
	public  void withraw(float Accbal)
	{
		
	}
	public void deposite(float Accbal) 
	{
	
	}	
	@Override
	public String toString() {
		return String.format("BankAcc [AccNo=%s, AccNm=%s, Accbal=%s]", AccNo, AccNm, Accbal);
	}
	



}