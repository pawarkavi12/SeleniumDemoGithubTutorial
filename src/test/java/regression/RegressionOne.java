package regression;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegressionOne {
	
	
	@BeforeTest
	@Test
	void regrOne()
	{
		System.out.println("Run Regression One method");
	}
	@AfterTest
	void regrOne1()
	{
		System.out.println("Run Regression One -1 method");
	}

}
