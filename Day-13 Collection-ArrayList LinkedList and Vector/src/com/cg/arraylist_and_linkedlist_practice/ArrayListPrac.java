package com.cg.arraylist_and_linkedlist_practice;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class ArrayListPrac {

	public static void main(String[] args)
	{
		/*List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		System.out.println("ArrayList  :"+list);
		*/
		
		/*ArrayList<Integer>l=new ArrayList<Integer>(5);
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		System.out.println(l);
		*/
		
		ArrayList<String>l=new ArrayList<String>(5);
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thrusday");
		l.add("Friday");
		System.out.println(l);
		System.out.println(l.indexOf("Wednesday"));
		System.out.println(l.lastIndexOf("Wednesday"));
		System.out.println(l.get(3));
		System.out.println(l.isEmpty());
		System.out.println(l.size());

	}

}
