package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Sun","Moon");
		//if assumptions is true the it will return otherwise not
		Assumptions.assumeTrue("Moon".equals(System.getProperty("Sun")));
		//System.out.println("Assumption is true");
		System.out.println("Assumption is false");
	}

}
