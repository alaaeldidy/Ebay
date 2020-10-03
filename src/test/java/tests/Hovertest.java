package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Hoverpage;

public class Hovertest extends Testbase {


	Hoverpage  Hoverobj;

	@Test
	public void userhovertest() throws InterruptedException
	{
		Hoverobj= new Hoverpage(driver);
		Hoverobj.userhover();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("Watches-Parts-Accessories"));
		Thread.sleep(5000);



	}
}
