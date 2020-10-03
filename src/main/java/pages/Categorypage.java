package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categorypage extends Pagebase{

	public Categorypage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id ="gh-shop")
	WebElement categorybtn;



	@FindBy(xpath ="//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[1]")
	WebElement ul;

	@FindBy(css ="span.b-pageheader__text")
	public WebElement successcategort;

	public void usercategorypage() throws InterruptedException
	{
		press(categorybtn);
		List<WebElement> smalllist = ul.findElements(By.className("scnd"));
		System.out.println(smalllist.size());
		for (WebElement element : smalllist)
		{
			System.out.println(element.getText());
			if(element.getText().equals("Art"))
			{
				element.click();
				Thread.sleep(2000);
			     break;
				
			}
		}
        

	}

}
