package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import action.ActionClass;
import fileUtility.GetPropertyData;
import pageObjectModel.HomePOM;

public class CrossBrowserTesting 
{
public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition() throws IOException, InterruptedException
	{
		String browser = GetPropertyData.propData("mt_browser");
		String web_url = GetPropertyData.propData("mt_url");
				
		
		if(browser.equals("chrome"))
		{
			//open the browser
			driver= new ChromeDriver();
			
		}
		if(browser.equals("edge"))
		{
		 driver = new EdgeDriver();
		}
		if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		//maximize the window
       driver.manage().window().maximize();
       //implicit waiting condition
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //Enter into web application
       driver.navigate().to(web_url);
	
		 HomePOM hp = new HomePOM(driver);
		 
		  hp.acceptCookies();
		  Thread.sleep(5000);
		  driver.switchTo().frame(hp.chatIframe);
		 hp.minChatBoat();
		 driver.switchTo().parentFrame();
	}
//	@AfterClass
//	public void postCondition()
//	{
//		driver.close();
//	}
}
