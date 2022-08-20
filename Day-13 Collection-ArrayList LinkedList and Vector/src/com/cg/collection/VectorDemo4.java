package com.cg.collection;

import java.util.Vector;

public class VectorDemo4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		v.add(11);
		v.add(22);
		v.add("Toady");
		v.add("Tomorrow");
		v.add(5.8f);
		System.out.println(v);
		v.setElementAt(33,4);  //set the element 33 at 4th position
		System.out.println(v);

	}

}
