package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Categorypage;

public class Categorytest extends Testbase {

	
	Categorypage  Categoryobj;
	
	
	@Test
	public void usercategorytestit() throws InterruptedException
	{
		Categoryobj = new Categorypage(driver);
		Categoryobj.usercategorypage();
		Thread.sleep(2000);
		Assert.assertEquals("Art",Categoryobj.successcategort.getText());
		Thread.sleep(2000);
	}
	
	
	
}
