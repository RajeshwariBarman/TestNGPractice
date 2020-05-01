package Framework;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	{
//		Assert.fail();
		System.out.println("In the Inisilaisation block");
	}

	
	// priority does not matter in TestNG for before /after methods, executing alphabatically
	// also if provide after/befor method with test they will be considered as TC 
	
	@BeforeMethod
	@BeforeTest
	@AfterMethod
	@Test(priority = 1)
	void connect()
	{
		//Assert.fail();
		System.out.println("DB connection open");
		
	}
	
	@AfterTest
	@Test
	void dbclose()
	{
//		Assert.fail();
		System.out.println("DB connection close");
	}
	
	
	@BeforeMethod
//	@Test(priority = 5)
	void Login2()
	{
		System.out.println("i am in first before");
	}
	
	@BeforeMethod
	@Test(priority = 2)
	void Login3()
	{
		//assertFalse(true);
//		Assert.fail();
		System.out.println("i am in second before");
	}
	
	
	@Test(priority = -10)
	void Login()
	{
		//assertFalse(true);
//	    Assert.fail();
		System.out.println("i am in 1");
	}
	
	@Test()
	void abc()
	{
		//assertFalse(true);
//	    Assert.fail();
		System.out.println("i am in abc");
	}
	
	@Test(priority = -300000000)
	void Login1()
	{
		System.out.println("i am in 2");
	}
	
	@AfterMethod
	void Login8()
	{
//		Assert.fail();
		//assertFalse(true);
		System.out.println("i am in first after");
	}
	
	@AfterMethod
	int Login5()
	{
//		Assert.fail();
		System.out.println("i am in second after");
		return 1;
	}

}
