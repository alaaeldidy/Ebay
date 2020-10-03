package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Loadproperties;
import pages.Searchpage;

public class Searchtest extends Testbase {

	String product = Loadproperties.userdata.getProperty("Product");
	Searchpage Searchobj;
	
	@Test
	public void usersearchtest()
	{
		Searchobj = new Searchpage(driver);
		Searchobj.usersearch(product);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
