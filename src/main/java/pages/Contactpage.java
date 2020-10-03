package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactpage extends Pagebase {

	
	public Contactpage(WebDriver driver) {
		super(driver);
		
	
	}
	@FindBy(id="userid")
	WebElement mail;
	
	@FindBy(id="signin-continue-btn")
	WebElement cont;
	
	
	@FindBy(id ="pass")
	WebElement passwordtxt;
	
	@FindBy(linkText ="div.password-box-wrapper")
	WebElement signinlink;
	
	@FindBy(css ="span.prompt")
	WebElement contactagain;
	
	@FindBy(xpath ="//*[@id=\"options\"]/div[1]/a[2]")
	WebElement buying;
	
	
	@FindBy(xpath ="//*[@id=\"options\"]/div[4]/a[2]/span")
	WebElement cancelorder;
	
	@FindBy(css ="h1.article_title")
	public WebElement sucesscontact;
	
	public void usercontactus(String txt,String pass) throws InterruptedException
	{
		senddata(mail, txt);
		Thread.sleep(3000);
	    press(cont);
		senddata(passwordtxt,pass);
		Thread.sleep(3000);
		press(signinlink);
		Thread.sleep(3000);
		press(contactagain);
		Thread.sleep(3000);
		press(buying);
		Thread.sleep(3000);
		press(cancelorder);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	

}
