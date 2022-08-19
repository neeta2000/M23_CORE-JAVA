package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List obj=new ArrayList<>();
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
		System.out.println(obj);
		

	}

}
