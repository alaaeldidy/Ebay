package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Loadproperties;
import pages.Homepage;
import pages.Registerpage;

public class Registertest extends Testbase {

	Registerpage Registerobj;
	Homepage Homeobj;
	
	 String Fname=Loadproperties.userdata.getProperty("Firstname");
	 String Lname=Loadproperties.userdata.getProperty("Lastname");
	 String email=Loadproperties.userdata.getProperty("Email");
	 String Pass=Loadproperties.userdata.getProperty("Password");

	
@Test
public void usertestregister() throws InterruptedException
{
	
	Homeobj = new Homepage(driver);
	Homeobj.userpressonregister();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Registerobj = new Registerpage(driver);
	Registerobj.userregister(Fname,Lname,email,Pass);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Assert.assertEquals("Alhgfaa",Registerobj.successreg.getText());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



}
	
	
	
	
	
	
	
	
	
	
	
}
