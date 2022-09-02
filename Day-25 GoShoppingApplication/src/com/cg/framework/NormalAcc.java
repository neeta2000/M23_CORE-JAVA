package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
	@SuppressWarnings("unused")
	private final float deliveryCharges;

	//constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Account No:"+this.getAccNo()+"Account Name:"+this.getAccNm()+"Charges is:"+(charges+deliveryCharges));
		
	}
	

}
