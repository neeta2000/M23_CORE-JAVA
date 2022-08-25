package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(5,10,15,20,25,30);
		Optional<Integer>result=obj.stream().filter((i)->i>20).reduce((i,j)->i>j?i:j);
		if(result.isPresent()) 
		{
			System.out.print("Result is:"+result.get());
		}
	}

}
