package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Loadproperties;
import pages.Searchpage;

public class Searchtest2 extends Testbase2 {

	String product = Loadproperties.userdata.getProperty("Product");
	Searchpage Searchobj;
	
	@Test
	public void usersearchtest()
	{
		Searchobj = new Searchpage(getDriver());
		Searchobj.usersearch(product);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("computers"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
