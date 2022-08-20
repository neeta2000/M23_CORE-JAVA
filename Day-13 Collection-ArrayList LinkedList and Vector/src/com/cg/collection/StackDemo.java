package com.cg.collection;
//push or pop operation in stack
import java.util.Stack;

public class StackDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.pop();
		System.out.println(s);

	}

}
