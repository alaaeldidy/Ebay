package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	
	public Homepage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor )driver ;
	
	}

	@FindBy(linkText ="register")
	WebElement registerele;
	
	@FindBy(linkText ="Sign in")
	WebElement signinlink;
	

	@FindBy(linkText ="Contact us")
	WebElement contactuslink;
	
	public void userpressonregister()
	{
		press(registerele);
		
	}
	public void userpressonsignin()
	{
		press(signinlink);
		
	}
	
	public void userpressoncontactus() throws InterruptedException
	{
		Thread.sleep(3000);
		scrolldown();
		press(contactuslink);
		Thread.sleep(10000);

	}
	
	
	
	
	
	
}
