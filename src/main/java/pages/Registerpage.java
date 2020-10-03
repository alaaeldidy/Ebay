package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Pagebase {

	public Registerpage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id ="firstname")
	WebElement fnametxt;
		
	@FindBy(id ="lastname")
	WebElement lnametxt;
	
	@FindBy(id ="email")
	WebElement mailtxt;
	
	@FindBy(id ="PASSWORD")
	WebElement passtxt;
	

	@FindBy(id ="ppaFormSbtBtn")
	WebElement createacct;
	
	

	@FindBy(css ="#gh-ug > b")
	public WebElement successreg;
	
	public void userregister(String first,String Last,String mail,String pass) throws InterruptedException
	{
		senddata(fnametxt, first);
		senddata(lnametxt, Last);
		senddata(mailtxt, mail);
		senddata(passtxt, pass);
		Thread.sleep(2000);
		createacct.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
