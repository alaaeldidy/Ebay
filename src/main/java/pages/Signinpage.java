package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Signinpage extends Pagebase {

	public Signinpage(WebDriver driver) {
		super(driver);
		
		builder=new Actions(driver);
	}

	@FindBy(id ="userid")
	WebElement username;
	
	
	@FindBy(id ="signin-continue-btn")
	WebElement contbtn;
	
	
	@FindBy(id ="pass")
	WebElement passbtn;
	
	
	@FindBy(id ="sgnBt")
	WebElement signinbtn;
	
	@FindBy(css ="div.geetest_wait")
	WebElement captha;
	
	@FindBy(css ="canvas.geetest_canvas_bg geetest_absolute")
	WebElement canvas;
	
	@FindBy(css ="div.geetest_slider_button")
	WebElement slidebtn;
	
	@FindBy(css ="canvas.geetest_canvas_fullbg.geetest_fade.geetest_absolute")
	WebElement fadeitem;
	
	@FindBy(css ="#gh-ug > b")
	public WebElement successreg;
	
	public void usersignin(String first,String pass) throws InterruptedException
	{
		senddata(username, first);
		press(contbtn);
		senddata(passbtn, pass);
		press(signinbtn);
		press(captha);
		Thread.sleep(3000);
		builder.clickAndHold(slidebtn).moveToElement(fadeitem).build().perform();
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	
}
