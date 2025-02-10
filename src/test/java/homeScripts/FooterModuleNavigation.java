package homeScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ActionClass;
import action.ScrollDown;
import base.CrossBrowserTesting;
import fileUtility.GetExcelData;
import pageObjectModel.HomePOM;
@Listeners(listeners.ListenersClass.class)
public class FooterModuleNavigation extends CrossBrowserTesting
{
   

 
  @Test(enabled=true)
  public void quickLinkNavigation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);

	    String parentWindow = driver.getWindowHandle(); // Get the parent window handle

	    for (int i = 0; i < hp.quickLinks.size(); i++) 
	    {
	        Actions act = new Actions(driver);

	        // Scroll down to make the quick links visible
             ScrollDown.scrollPage(hp.email);
            
	       WebElement links = hp.quickLinks.get(i); 
	       ActionClass.applyBorder(links, "white");
	       Thread.sleep(4000);
	       links.click();// Click on the quick link
	        Thread.sleep(3000); // Wait for the page or new tab to load
	        ActionClass.applyBorder(links, "green");
	        if (i <= 3) 
	        { // Links that open in the same tab
	            switch (i) 
	            {
	                case 0:
	                    assertTrue(hp.AboutUsVerify.isDisplayed());
	                    Reporter.log("About Us navigates to the correct destination", true);
	                    break;
	                case 1:
	                    assertTrue(hp.servicesVerify.isDisplayed());
	                    Reporter.log("Services navigate to the correct destination", true);
	                    break;
	                case 2:
	                    assertTrue(hp.solutionsVerify.isDisplayed());
	                    Reporter.log("Solutions quick link navigates to the correct destination", true);
	                    break;
	                case 3:
	                    assertTrue(hp.contactUsVerify.isDisplayed());
	                    Reporter.log("Contact Us navigates to the correct destination", true);
	                    break;
	            }
	            driver.navigate().back(); // Navigate back to the parent page
	        } 
	        else 
	        { // Links that open in new tabs
	            Set<String> allWindows = driver.getWindowHandles();
	            for (String window : allWindows) 
	            {
	                if (!window.equals(parentWindow)) 
	                {
	                    driver.switchTo().window(window); // Switch to the new tab

	                    switch (i) 
	                    {
	                        case 4:
	                            assertTrue(hp.blogVerify.isDisplayed());
	                            Reporter.log("Blog link navigates to the correct page", true);
	                            break;
	                        case 5: 
	                            assertTrue(hp.eventsVerify.isDisplayed());
	                            Reporter.log("Event link navigates to the correct page", true);
	                            break;
	                        case 6:
	                            assertTrue(hp.news.isDisplayed());
	                            Reporter.log("News link navigates to the correct page", true);
	                            break;
	                        case 7:
	                            assertTrue(hp.glossary.isDisplayed());
	                            Reporter.log("Glossary link navigates to the correct page", true);
	                            break;
	                    }

	                    driver.close(); // Close the new tab
	                }
	            }
	            driver.switchTo().window(parentWindow); // Switch back to the parent window
	        }

	        Thread.sleep(3000); // Wait to ensure smooth navigation
	    }
  
	  
  }
  
  @Test(enabled=false)
  public void socialLinksNavigation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);

	    String parentWindow = driver.getWindowHandle(); // Get the parent window handle

	    for (int i = 0; i < hp.quickLinks.size(); i++) 
	    {
	        Actions act = new Actions(driver);

	        // Scroll down to make the Social links visible
            ScrollDown.scrollPage(hp.email);
	        Thread.sleep(3000);

	        hp.socialLinks.get(i).click(); // Click on the Social links
	        Thread.sleep(3000); // Wait for the page or new tab to load
	        Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) 
            {
                if (!window.equals(parentWindow)) 
                {
                    driver.switchTo().window(window); // Switch to the new tab

                    switch (i) 
                    {
                        case 0:
                            assertTrue(driver.getCurrentUrl().contains("facebook"));
                            Reporter.log("Facebook navigate to the correct page", true);
                            break;
                        case 1: 
                            assertTrue(driver.getCurrentUrl().contains("x.com"));
                            Reporter.log("twitter navigates to the correct page", true);
                            break;
                        case 2:
                            assertTrue(driver.getCurrentUrl().contains("linkedin.com"));
                            Reporter.log("LinkedIn navigates to the correct page", true);
                            break;
                        case 3:
                            assertTrue(driver.getCurrentUrl().contains("blog.metapercept.com"));
                            Reporter.log("blogs navigates to the correct page", true);
                            break;
                    }

                    driver.close(); // Close the new tab
                }
            }
            driver.switchTo().window(parentWindow); // Switch back to the parent window
        }

        Thread.sleep(3000); // Wait to ensure smooth navigation
    
  }
 
}
