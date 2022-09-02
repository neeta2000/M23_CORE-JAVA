package com.cg.customer;

import com.cg.bankapplication.MMCurrentAcc;
import com.cg.bankapplication.MMSavingAcc;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Customer {

	public static void main(String[] args) {
		SavingAcc s=new MMSavingAcc(101,"Hrushikesh",1000,true);
		CurrentAcc c=new MMCurrentAcc(102,"Vaishnavi",2000,100);
		System.out.println("Saving Account:-");
		s.withdraw(100);
		
		System.out.println("Current Account:-");
		c.withdraw(500);
		
		System.out.println(s);
		System.out.println(c);
		

	}

}
