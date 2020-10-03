package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Pagebase {

protected WebDriver driver;	
public JavascriptExecutor jse;
public Actions builder;
public Select select;
	

	public Pagebase(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void senddata(WebElement ele ,String txt)
	{
		ele.sendKeys(txt);
		
	}
	public void press(WebElement ele )
	{
		ele.click();;
		
	}
	
	
	public void scrolldown()
	{
		 jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	
	
}
