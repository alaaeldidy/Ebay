package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends Pagebase {

	public Searchpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id ="gh-ac")
	WebElement searchtxt;
	
	
	public void usersearch(String product)
	{
		senddata(searchtxt, product);
		searchtxt.submit();
		
	}
	
	
	
	
	
	
}
