package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import helper.Loadproperties;
import pages.Contactpage;
import pages.Homepage;

public class Contacttest extends Testbase {

String pass=Loadproperties.userdata.getProperty("Password");	
String mail=Loadproperties.userdata.getProperty("Email");	

 	Contactpage	Contactobj;
 	Homepage Homeobj;
	
@Test
public void usercontactustest() throws InterruptedException
{
	Homeobj = new Homepage(driver);
	Homeobj.userpressoncontactus();
	Thread.sleep(6000);
	Contactobj = new Contactpage(driver);
	Contactobj.usercontactus(mail,pass);
	Thread.sleep(3000);
	Assert.assertEquals("Cancel an order", Contactobj.sucesscontact.getText());
	Thread.sleep(3000);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
