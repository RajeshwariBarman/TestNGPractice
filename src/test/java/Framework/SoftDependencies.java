package Framework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftDependencies {
	
	
	@BeforeMethod
	public void test5()
	{
		System.out.println("In the test5 before depends on Method");
	}
	
	@Test(alwaysRun = true )
	private void test1()
	{
		Assert.fail();
		System.out.println("In the test 1 depends on ");
	}
	
	@Test
	private void test3()
	{
		
		System.out.println("In the test 3 depends on");
	}
	
	@Test(dependsOnMethods = {"test3","test1"} , alwaysRun = false)
	void test2()
	{
		System.out.println("In the test 2 depends on");
	}

}
