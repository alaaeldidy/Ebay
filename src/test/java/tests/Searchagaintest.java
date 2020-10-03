package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import helper.Loadproperties;
import pages.Serachagainpage;

public class Searchagaintest extends Testbase{

	
	String item= Loadproperties .userdata.getProperty("Item");
	
	Serachagainpage  Serachagainobj;	
	
	
	
	
@Test
public void usersearchagaintest() throws InterruptedException
{
	Serachagainobj = new Serachagainpage(driver);
	Serachagainobj.usersearchagain(item);
	Thread.sleep(3000);
	System.out.println(Serachagainobj.successsearchagain.getText());
	Assert.assertEquals("book",Serachagainobj.successsearchagain.getText() );
	Thread.sleep(3000);
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
