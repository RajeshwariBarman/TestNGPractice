package Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test()
	public void test3()
	{
		System.out.println("In the test3 depends on Method");
	}
	
	@Test()
	public void test2()
	{
		Assert.assertEquals(true, true);
		System.out.println("In the test2 depends on Method");
	}
	
	
	@Test(priority = 10 , dependsOnMethods = "test3")
	public void test1()
	{
		System.out.println("In the test1 depends on Method");
	}
	
//	@Test(priority = 5 , dependsOnMethods = "test3")
//	public void test4()
//	{
//		System.out.println("In the test4 depends on Method");
//	}

}
