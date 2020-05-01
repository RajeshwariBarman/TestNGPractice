package Framework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	void assertionTest()
	{
		SoftAssert softassert = new SoftAssert();   
		System.out.println("Title Validations");
		softassert.assertEquals("hello", "hello", "passed");
		System.out.println("Imange Validations");
		//softassert.assertAll();
		softassert.assertEquals(true, false, "failed");
		System.out.println("Checkbox Validation");
		softassert.assertEquals(true, false, "failed");
		softassert.assertAll();
		
	}

}
