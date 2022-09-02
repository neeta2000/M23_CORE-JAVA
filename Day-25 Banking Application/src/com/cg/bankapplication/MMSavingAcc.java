package com.cg.bankapplication;


import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int AccNo, String accNm, float MINBAL, boolean isSalaried) {
		super(AccNo, accNm,  MINBAL, isSalaried);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}

	
	
	
	
}