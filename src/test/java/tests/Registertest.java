package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import helper.Loadproperties;
import pages.Homepage;
import pages.Registerpage;

public class Registertest extends Testbase {

	Registerpage Registerobj;
	Homepage Homeobj;
	/*
	 * String Fname=Loadproperties.userdata.getProperty("Firstname"); String
	 * Lname=Loadproperties.userdata.getProperty("Lastname"); String
	 * email=Loadproperties.userdata.getProperty("Email"); String
	 * Pass=Loadproperties.userdata.getProperty("Password");
	 */

	
@Test
public void usertestregister() throws InterruptedException
{
	
	String Pass=Loadproperties.userdata.getProperty("Password");
	Faker fakedata = new Faker();
	String Fname=fakedata.name().firstName();
	String Lname=fakedata.name().lastName();
	String email=fakedata.internet().emailAddress();
	
	Homeobj = new Homepage(driver);
	Homeobj.userpressonregister();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Registerobj = new Registerpage(driver);
	Registerobj.userregister(Fname,Lname,email,Pass);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	



}
	
	
	
	
	
	
	
	
	
	
	
}
