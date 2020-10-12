package tests;

import org.testng.annotations.AfterClass;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class Testbase {

 public WebDriver driver	;
 
 @Parameters("{browser}")
@BeforeClass
public void useropenurl(@Optional("chrome")String browsername )
{
	if(browsername.equalsIgnoreCase("chrome"))
	{
		String path=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}

	else if(browsername.equalsIgnoreCase("firefox"))
	{
		String path=System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("headless"))
	{
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		 caps.setCapability("takesScreenshot", true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,System.getProperty("user.dir")+"\\Drivers\\phantomjs.exe");
		String [] arg= {"--web-security=no","--ignore-errors=yes"};
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, arg);
		driver = new PhantomJSDriver(caps);
	}
	else if(browsername.equalsIgnoreCase("headlesschrome"))
	{
		
		String path=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("--windowsize=1920,1080");
		driver=new ChromeDriver(opt);
	}
	
       driver.manage().window().maximize();
       driver.navigate().to("https://www.ebay.com/");

}
@AfterMethod
public void userscreenshot(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	TakesScreenshot ts = (TakesScreenshot)	driver;
	File source=ts.getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(source,new File("./Screenshots/"+result.getName()+".png"));
	}
	

}



	
	@AfterClass
	public void userturnoffurl()
	{
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
}
