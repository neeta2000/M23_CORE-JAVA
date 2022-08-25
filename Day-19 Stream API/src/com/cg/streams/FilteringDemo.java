package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(11,22,33,44,55,11);
		//filter(predicate)method
		obj.stream().filter(i->i>30).forEach((i)->System.out.print(i+ " "));
		System.out.println();
		System.out.println("The distinct elements are:");
		obj.stream().distinct().forEach((i)->System.out.print(i+ " "));
		System.out.println();
		System.out.println("The limit is:");
		obj.stream().limit(4).forEach((i)->System.out.print(i+ " "));
		System.out.println();
		System.out.println("The discarded element is:");
		obj.stream().skip(2).forEach((i)->System.out.print(i+ " "));
		

	}

}
