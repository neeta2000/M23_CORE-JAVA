package com.tns.queue;

import java.util.Queue;
import java.util.PriorityQueue;
@SuppressWarnings("unused")
public class QueueDemo2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue q=new PriorityQueue();
		for(int i=5;i>0;i--)
		{
			q.add(i);
		}
		System.out.println(q);

	}

}
