package homeScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;
@Listeners(listeners.ListenersClass.class)
public class BasicScript extends CrossBrowserTesting
{
  @Test(enabled = false)
  public void verifyMetaWebpage() 
  {
	 String given_url = "https://metapercept.com/"; 
	 String current_url = driver.getCurrentUrl();
	 if(given_url.equals(current_url)) 
	 {
		Reporter.log("User is on the Metapercept homepage", true);
	 } 
  }
  @Test()
  public void verifyGetInTouchNavigation() throws InterruptedException, AWTException
  {
	  HomePOM hp = new HomePOM(driver);
	  hp.acceptCookies();
	//  Thread.sleep(2000);
	//  hp.minChatBoat();
	  if(hp.get_in_touch1.isDisplayed())
	  {
	  hp.ClickGetInTouch1();
	  }
	  else if(hp.get_in_touch2.isDisplayed())
	  {
		  hp.ClickGetInTouch2();
	  }
	  else if(hp.get_in_touch3.isDisplayed())
	  {
		  hp.ClickGetInTouch3();
	  }
	  if(hp.contact_page_title.isDisplayed())
	  {
		  Reporter.log("Get in touch navigate to correct page", true);
	  }
	  else
	  {
		  Reporter.log("Get in touch is not navigated to correct page", true);
	  }
	 driver.navigate().back();
	 
	    Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		hp.ClickSoftDev();
		if(hp.softwareDevTitle.isDisplayed())
		{
			Reporter.log("Software development navigate to correct page", true);
		}
		else
		{
			 Reporter.log("software development is not navigated to correct page", true);
		}
		driver.navigate().back();
		
		Thread.sleep(2000);
		hp.clickTechWriter();
		if(hp.techWriterTitle.isDisplayed())
		{
			Reporter.log("Technical writer navigate to correct page", true);
		}
		else
		{
			 Reporter.log("Technical writer  is not navigated to correct page", true);
		}
		driver.navigate().back();
		
		Thread.sleep(2000);
		System.out.println(hp.singleCard.size());
		for(int i=0; i<hp.singleCard.size(); i++)
		{
			hp.singleCard.get(i).click();
			Thread.sleep(6000);
			
			String given_title = "Metapercept Technology Services LLP";
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for(String str : child)
			{
				driver.switchTo().window(str);
				String current_title = driver.getTitle();
				if(given_title.equals(current_title))
				{
					hp.metaLogo.click();
					
					Thread.sleep(4000);
					if(i<2) {
						act.keyDown(Keys.PAGE_DOWN).build().perform();
						act.keyDown(Keys.PAGE_DOWN).build().perform();
					}
					if(i>=2) {
						driver.switchTo().window(parent);
				
						Thread.sleep(3000);
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					}
					
				}
				driver.switchTo().window(parent);
			
			  
		  
			}
			
		}
		   
			
			
			
			//metaLogo.click();
			 
			
			Thread.sleep(2000);
			System.out.println(hp.singleCard.size());
		}
		
	 
  }
   

