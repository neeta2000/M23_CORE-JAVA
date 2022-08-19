package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class LinkedListExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List obj=new LinkedList<>();
		obj.add(11);
		obj.add("Neeta");
		obj.add(12.30);
		obj.add(30);
		obj.add(50);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(0);
		System.out.println(obj);
		System.out.println(obj.lastIndexOf(11));

	}

}
