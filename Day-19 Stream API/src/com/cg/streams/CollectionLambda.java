package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
		Set <Integer>obj=new HashSet<>();
		obj.add(45);
		obj.add(34);
		obj.add(23);
		obj.add(76);
		System.out.println(obj);
		/*if i want to extract this set value we can go ahead with iterator,while loop
		 * for loop but using stream API-forEach() method 
		 */
		//extracting the values from set
		obj.forEach(System.out::println);

	}

}
