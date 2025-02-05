package servicesScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.ServicesPOM;

public class SoftwareDevValidation extends CrossBrowserTesting
{
   @Test
   public void SoftDeValidation() throws InterruptedException
   {
	   ServicesPOM sp = new ServicesPOM(driver);
	   Actions act = new Actions(driver);
	   act.moveToElement(sp.services).build().perform();;
	   Thread.sleep(2000);
	   sp.softDev.click();
	   
	   assertTrue(sp.softDevPageTitle.isDisplayed());
	   Reporter.log("Software Developement is navigated to destination", true);
	   
	   
	  
	   
	   for(int i=0; i<sp.block_elements.size(); i++)
	   {
		   ScrollDown.scrollPage(sp.block_elements.get(0));
		   Thread.sleep(3000);
		   sp.block_elements.get(i).click();
		   Thread.sleep(3000);
		   driver.navigate().back();
	   }
   }
   
}
