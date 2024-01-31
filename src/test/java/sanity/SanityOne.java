package sanity;

import org.testng.annotations.Test;

public class SanityOne {
	
	@Test
	void saniOne()
	{
		System.out.println("Run saniOne method");
	}
	@Test(dependsOnMethods= {"rTest"})
	void aTest()
	{
		System.out.println("Run aTest method");
	}
	@Test  
	void rTest()
	{
		System.out.println("Run rtest method");
	}


}
