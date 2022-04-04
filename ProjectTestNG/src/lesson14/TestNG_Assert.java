package lesson14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assert {
	@Test
	public void hardTest1() {
		Assert.assertEquals("This", "This");
		System.out.println("Test1 passes");
	}
	
	@Test
	public void hardTest2() {
		Assert.assertFalse(5>6);
		  System.out.println("Test2 passes");
	}
	@Test
	  public void hardTest3() {
		  Assert.assertTrue(5>6);//Fail
		  System.out.println("Test3 fails");
	  }
	  @Test
	  public void hardTest4() {
		  Assert.assertEquals("TestNG", "TestNG", "TestNG is not good.");
		  System.out.println("Test4 passes");
	  }
}
