package com.cg.collection;
//using addAll() method to the vector to display arraylist
import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList arr =new ArrayList();
		arr.add(10);
		arr.add("Vector");
		arr.add("Stack");
		arr.add(20);
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		v.addAll(arr);
		System.out.println(v);
		

	}

}
