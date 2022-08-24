package com.cg.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertExample 
{
	@Test
	public void display()
	{
		int res=10;
		int expected=10;
		//it will check the value is equals or not  ,if it is equal 
		assertEquals(res,expected);
		
	}

}
