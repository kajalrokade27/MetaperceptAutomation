package homeScripts;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;
@Listeners(listeners.ListenersClass.class)
public class BodyModuleNavigation extends CrossBrowserTesting
{
  //To verify that user is on "metapercept web page"
  @Test(enabled = false, priority=0)
  public void verifyMetaWebpage() 
  {
	 String given_url = "https://metapercept.com/"; 
	 String current_url = driver.getCurrentUrl();
	 if(given_url.equals(current_url)) 
	 {
		Reporter.log("User is on the Metapercept homepage", true);
	 } 
  }
 
  //To verify that "Get In Touch" Element is navigate to correct page (contact page)
  //To verify that "Software Development " is navigate to respective page
  //To verify that "Technical writer" is navigate to correct page
  @Test(enabled=false, priority=1)
  public void verifyGetInTouchNavigation() throws InterruptedException, AWTException
  {
	  HomePOM hp = new HomePOM(driver);
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class=\"tp-white-btn\"])[3]")));
	
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
  }
	    @Test (enabled=false)
	    public void verifySoftDevNTechWriterNavigation() throws InterruptedException, AWTException
	    {
	    	HomePOM hp = new HomePOM(driver);
	    Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		 Thread.sleep(2000);
		 
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
	    }
		  
  
  
  //To verify that "Information architecture " card navigate is correct page
  @Test(enabled=false, priority=2)
  public void informArchitectureCardNavigation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);
	  hp.clickSingleCard1();
	  String parent = driver.getWindowHandle();
	  Set<String> child = driver.getWindowHandles();
	  child.remove(parent);
      for(String str: child)
	  {
		  driver.switchTo().window(str);
	  if(hp.informArch.isDisplayed())
	  {
		  System.out.println("Information architecture card navigate to correct page");
	  }
	  else
	  {
		  System.out.println("Information architecture card is not navigate to correct page");
	  }
	  }
	  
  }
  //To verify that "Technical Publication" card is navigate to correct page
  @Test(enabled=false, priority=3)
  public void techPublicationCardNavigation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);
	  hp.clickSingleCard2();
	  String parent = driver.getWindowHandle();
	  Set<String> child = driver.getWindowHandles();
	  child.remove(parent);
	  for(String str: child)
	  {
		  driver.switchTo().window(str);
	  if(hp.techPublication.isDisplayed())
	  {
		  System.out.println("Technical publication card navigate to correct page");
	  }
	  else
	  {
		  System.out.println("Technical publication card is not navigate to correct page");
	  }
	  }
	
  }
  //To verify that "Web Development" card is navigate to correct page
  @Test(enabled=true, priority=4)
  public void webDevCardNavigation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
//	  Actions act = new Actions(driver);
//	  act.keyDown(Keys.PAGE_DOWN).build().perform();
//	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	  ScrollDown.scrollPage(hp.singleCard3);
	  Thread.sleep(2000);
	  hp.clickSingleCard3();
	  String parent = driver.getWindowHandle();
	  Set<String> child = driver.getWindowHandles();
	  child.remove(parent);
	  for(String str: child)
	  {
		  driver.switchTo().window(str);
	  if(hp.webDev.isDisplayed())
	  {
		  System.out.println("Web Development card navigate to correct page");
	  }
	  else
	  {
		  System.out.println("Web Development card is not navigate to correct page");
	  }
	  }
	
  }
  //To verify that the "Application Integration" card is navigate to correct page
  @Test(enabled=false, priority=5)
  public void applIntegrationCardNavigation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);
	  hp.clickSingleCard4();
	  String parent = driver.getWindowHandle();
	  Set<String> child = driver.getWindowHandles();
	  child.remove(parent);
	  for(String str: child)
	  {
		  driver.switchTo().window(str);
	  if(hp.applIntegration.isDisplayed())
	  {
		  System.out.println("Application Integration card navigate to correct page");
	  }
	  else
	  {
		  System.out.println("Application Integration card is not navigate to correct page");
	  }
	  }
	
  }
  
  @Test(enabled = false)
  public void weProvideElementsVerify() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	
	  Thread.sleep(2000);
	  for(int i=0; i<hp.weProvide.size(); i++)
	  {
		  hp.weProvide.get(i).click();
		  Thread.sleep(5000);
		 if(i==0)
		 {
		 assertTrue(hp.solPageVerify.isDisplayed());
	     Reporter.log("Technology services navigated to correct page", true);
		 }
	     
		 else if(i==1)
		 {
		assertTrue(hp.softEngPageVerify.isDisplayed());
		Reporter.log("Software engineering navigated to correct page", true);
		 }
		 else if(i==2)
		 {
			 assertTrue(hp.techPubVerify.isDisplayed());
				Reporter.log("Technical publication navigated to correct page", true);
		 }
		 else if(i==3)
		 {
			 assertTrue(hp.informArchVerify.isDisplayed());
				Reporter.log("Information Architecture navigated to correct page", true);
		 }
		 else if(i==4)
		 {
			 assertTrue(hp.contentMigrVerify.isDisplayed());
				Reporter.log("Content migration navigated to correct page", true);
		 }
		 else if(i==5)
		 {
			    assertTrue(hp.staffAugVerify.isDisplayed());
				Reporter.log("Staff Augmentation navigated to correct page", true);
		 }
		 
		  driver.navigate().back();
		  Thread.sleep(6000);
	  }
  }
  
  @Test(enabled=false)
  public void offerServicesVerify() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	 
	 
	  Thread.sleep(5000); 
	  System.out.println(hp.offerServices.size());
	  for(int i=0; i<hp.offerServices.size(); i++)
	  {
		  
		  hp.offerServices.get(i).click();
		  Thread.sleep(5000);
		 if(i==0)
		 {
		 assertTrue(hp.finTechVerify.isDisplayed());
	     Reporter.log("Fin Tech navigated to correct page", true);
		 }
	     
		 else if(i==1)
		 {
			 assertTrue(hp.finTechVerify.isDisplayed());
		     Reporter.log("Cloud computing is navigated to correct page", true);
		 }
		 else if(i==2)
		 {
			 assertTrue(hp.finTechVerify.isDisplayed());
		     Reporter.log("Storage visualization is navigated to correct page", true);
		 }
		 else if(i==3)
		 {
			 assertTrue(hp.finTechVerify.isDisplayed());
		     Reporter.log("AI & machine learning navigated to correct page", true);
		 }
		 else if(i==4)
		 {
			 assertTrue(hp.finTechVerify.isDisplayed());
		     Reporter.log("Automation & aerospace is navigated to correct page", true);
		 }
		  driver.navigate().back();
		  Thread.sleep(5000); 
	  }
	  
	
	  
  }
	
	@Test(enabled=false)
	public void latestPostNavigation() throws InterruptedException, TimeoutException
	{
		
		HomePOM hp = new HomePOM(driver);
		Actions act = new Actions(driver);

		// Using WebDriverWait instead of Thread.sleep
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		for (int i = 0; i < hp.latest_posts.size(); i++) 
		{
		    // Scrolling down to load the next set of posts
		    for (int j = 0; j < 4; j++) 
		    {
		        act.sendKeys(Keys.PAGE_DOWN).perform();
		        try 
		        {
		            Thread.sleep(1000); // Allow time for the page to scroll down
		        }
		        catch (InterruptedException e) 
		        {
		            Thread.currentThread().interrupt();
		        }
		    }

		    String given_title = "Metapercept Technology Services LLP";
		    String parentWindowHandle = driver.getWindowHandle();
		    
		    // Collect current window handles before clicking
		    Set<String> parentHandles = driver.getWindowHandles();

		    // Clicking on the current post link
		    hp.latest_posts.get(i).click();

		    // Wait for the new window or tab to load
		    wait.until(ExpectedConditions.numberOfWindowsToBe(parentHandles.size() + 1));

		    // Get all window handles again after the click
		    Set<String> allWindowHandles = driver.getWindowHandles();
		    allWindowHandles.removeAll(parentHandles);  // Get the child window handle
		    String childWindowHandle = allWindowHandles.iterator().next(); // Get the first (and only) child handle

		    driver.switchTo().window(childWindowHandle);

		   

		    // Verify the title of the new page
		    String current_title = driver.getTitle();
		    if (given_title.equals(current_title)) 
		    {
		    	
		        switch (i) 
		        {
		            case 0:
		                assertTrue(hp.ditaEurope.isDisplayed());
		                Reporter.log("DITA Europe post navigated to the correct page", true);
		                break;
		            case 1:
		                assertTrue(hp.pre_CCMSPost.isDisplayed());
		                Reporter.log("pre-CCMS post navigated to the correct page", true);
		                break;
		            case 2:
		                assertTrue(hp.tackleMedicalDevicePost.isDisplayed());
		                Reporter.log("Tackle Medical Device post navigated to the correct page", true);
		                break;
		            default:
		                break;
		        }
		    }

		    // Close the child window and switch back to the parent window
		    driver.close();
		    driver.switchTo().window(parentWindowHandle);
		}
	}

}
  
   

