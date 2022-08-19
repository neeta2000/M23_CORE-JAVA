package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<Integer>obj=new ArrayList<Integer>();
		LinkedList<Integer>obj=new LinkedList<Integer>();
		obj.add(12);
		obj.add(22);
		System.out.println(obj);
		System.out.println(obj.contains(12));
		System.out.println(obj.get(1));
		obj.set(0, 10);
		System.out.println(obj);
		//copying one list into another
		Object copy;
		copy=obj.clone();
		System.out.print(copy);
		obj.addFirst(9);
		obj.addLast(19);
		System.out.println(obj);
		
		

	}

}
