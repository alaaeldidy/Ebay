package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Serachagainpage extends Pagebase {

	public Serachagainpage(WebDriver driver) {
		super(driver);
		
		
	}
	
	@FindBy(id ="gh-cat-box")
	WebElement searchlistbtn;
	
	@FindBy(id ="gh-cat")
	WebElement searchlist;
	
	@FindBy(id ="gh-ac")
	WebElement searchtxt;
	
	@FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[2]")
	 public WebElement successsearchagain;
	
public void usersearchagain(String product)
{
	 press(searchlistbtn);
	 Select select = new Select(searchlist);
	 select.selectByVisibleText("Books");
	 senddata(searchtxt, product);
	 searchtxt.submit();
		
	 
	 
	


}
	
	
	
	

}
