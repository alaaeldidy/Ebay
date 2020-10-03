package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Hoverpage extends Pagebase {


	public Hoverpage(WebDriver driver) {
		super(driver);
		
		builder=new Actions(driver);

	}
	@FindBy(linkText ="Fashion")
	WebElement fashion;

	@FindBy(css ="span.b-breadcrumb__text.b-link--tertiary.truncate")
	public WebElement successhover;



	public void userhover() throws InterruptedException
	{

		  builder.moveToElement(fashion).build().perform();
		  Thread.sleep(2000);
	      WebElement Fashionsss = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[1]/ul"));
	      List< WebElement> fashlist = Fashionsss.findElements(By.className("hl-cat-nav__js-link"));
		
         System.out.println(fashlist.size()); 
         for(WebElement fasf:fashlist)
         {
		  if(fasf.getText().equals("Watches, Parts & Accessories"))
		  { 
			  fasf.click();
		  Thread.sleep(4000);
		  break;
		 }
		 
         }

	}







}



