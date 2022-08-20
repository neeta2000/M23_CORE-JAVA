package com.cg.arraylist_and_linkedlist_practice;

import java.util.ArrayList;
public class ArrayListPrac3 {

	public static void main(String[] args) {
		ArrayList<Double>l=new ArrayList<Double>();
		l.add(4.5);
		l.add(5.5);
		l.add(2.5);
		l.add(6.6);
		l.add(3.3);
		l.add(1.1);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains(3.5));
		System.out.println(l.indexOf(1.1));
		System.out.println(l.lastIndexOf(3.3));
		System.out.println(l.get(4));
		l.set(2, 0.3);
		System.out.println(l);
		

	}

}
