package com.tns.queue;

import java.util.PriorityQueue;
public class QueueDemo1 {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.offer(30);  //offer method is same as add method
		System.out.println(q);
		System.out.println(q.peek()); //peek method is used to get first element
		System.out.println(q.poll()); //poll method is used to remove the first element from queue
		System.out.print(q);
		

	}

}
