package com.cg.generics;
//demo on advantages of generics concept
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class GenericsAdvantageDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List obj=new LinkedList();
		obj.add(12);
		//obj.add("Augest");
		//obj.add(12.22);
		System.out.println(obj);
		//type casting is not required
		
		List <Integer>obj2=new ArrayList<>();
		obj2.add(15);
		//compiletime checking
		//obj2.add("15");
		
		Integer d=obj2.get(0);
		System.out.println(obj2);
		
		

	}

}
