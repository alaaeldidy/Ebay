package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Loadproperties;
import pages.Homepage;

import pages.Signinpage;

public class Signintest extends Testbase {

	Homepage Homeobj;
	Signinpage Signinobj;
	 String email=Loadproperties.userdata.getProperty("Email");
	 String Pass=Loadproperties.userdata.getProperty("Password");

	
	@Test
	
	public void usertestsignin() throws InterruptedException
	{
		
		Homeobj = new Homepage(driver);
		Homeobj.userpressonsignin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Signinobj = new Signinpage(driver);
		Signinobj.usersignin(email, Pass);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		Assert.assertEquals("Alhgfaa",Signinobj.successreg.getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



	}
	
	
	
	
	
}
