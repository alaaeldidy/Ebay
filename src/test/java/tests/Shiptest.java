package tests;




import org.testng.annotations.Test;
import pages.Shippage;

public class Shiptest extends Testbase {

	
	
	Shippage Shipobj;	
	
@Test
public void usershiptest() throws InterruptedException
{
	Shipobj = new Shippage (driver);
	Shipobj.userchangeship();
	
}
	
	
	
}
