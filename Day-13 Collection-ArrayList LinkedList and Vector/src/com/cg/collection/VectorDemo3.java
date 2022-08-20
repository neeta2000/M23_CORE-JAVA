package com.cg.collection;
// both vector are equal or not
import java.util.Vector;

public class VectorDemo3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add("Animals");
		v.add("Plants");
		v.add("Birds");
		v.add(3);
		@SuppressWarnings("rawtypes")
		Vector v_2nd=new Vector();
		v_2nd.add(1);
		v.add(2);
		v.add("Animals");
		v.add("Plants");
		v.add("Birds");
		v.add(3);
		if (v.equals(v_2nd))
			System.out.println("Both vectors are equal");
		else
			System.out.println("Both vectors are not equal");

	}

}
