package com.cg.package4;

import com.cg.package3.*;
public class EncapsulationHDFC {

	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.setAmount(1000);
		System.out.println("The amount in my bank is:"+obj.getAmount());

	}

}
