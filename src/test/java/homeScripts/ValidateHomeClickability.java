package homeScripts;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ActionClass;
import base.CrossBrowserTesting;
import pageObjectModel.AboutUsCareers;
import pageObjectModel.HomePOM;

public class ValidateHomeClickability extends CrossBrowserTesting
{
   @Test
   public void validateHomeClickability()
   {
	   HomePOM hp = new HomePOM(driver);
	   AboutUsCareers ac = new AboutUsCareers(driver);
	   ActionClass.applyBorder(ac.about_us, "green");
	   ac.about_us.click();
	   ActionClass.applyBorder(ac.careers, "green");
	   ac.careers.click();
	   String parent = driver.getWindowHandle();
	   Set<String> child = driver.getWindowHandles();
	   child.remove(parent);
	   System.out.println(child);
	   for(String str: child)
	   {
	   driver.switchTo().window(str);
	   try 
	   {
		action.ActionClass.waitUptoClickable(hp.home2);
		hp.home2.click();
		assertTrue(hp.get_in_touch1.isDisplayed());
	    } 
	   catch (Exception e) 
	   {
		Reporter.log("After clicking on home user is not navigated to home page", true);	   
		
	   }
	   }
	   
   }
   
}
