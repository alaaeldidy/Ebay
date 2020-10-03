package pages;


import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shippage extends Pagebase {

	public Shippage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css ="button.gh-eb-li-a.gh-icon")
	WebElement shiplink;
	
	@FindBy(css ="div.shipto__country-list")
	WebElement countrytxt;
	
	@FindBy(css ="button.shipto__close-btn")
	WebElement done;
	
	@FindBy(className  ="menu-button__item")
	List<WebElement> clists;
	public void userchangeship() throws InterruptedException
	{
		press(shiplink);
        Thread.sleep(2000);
		press(countrytxt);
		System.out.println(clists.size());
		for(WebElement clist:clists)
		{
			if(clist.getText().equals("United Arab Emirates"))
			{
				
				clist.click();
				Thread.sleep(2000);
			}
		}
	
       press(done);
		
		
	}
	
	
	
	
	
}
