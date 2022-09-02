package com.cg.bankapplication;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc( accno,accname, accbal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getCurrentAcc(int accno, String accname, float accbal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accno,accname,accbal, creditLimit);
		return c;
	}

}