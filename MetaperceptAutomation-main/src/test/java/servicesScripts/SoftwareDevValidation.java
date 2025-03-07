package servicesScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import pageObjectModel.ServicesPOM;
@Listeners(listeners.ListenersClass.class)
public class SoftwareDevValidation extends BaseClass
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
		   if(i==0)
		   {
			   assertTrue(sp.WebDevPage.isDisplayed());
			   Reporter.log("Web Development blog is navigated to correct page",true);
		   }
		   if(i==1)
		   {
			   assertTrue(sp.customEngPage.isDisplayed());
			   Reporter.log("Custom Engineering  blog is navigated to correct page",true);
		   }
		   if(i==2)
		   {
			   assertTrue(sp.applIntPage.isDisplayed());
			   Reporter.log("Application integration blog is navigated to correct page",true);
		   }
		   if(i==3)
		   {
			   assertTrue(sp.docOpsPage.isDisplayed());
			   Reporter.log("DocOps blog is navigated to correct page",true);
		   }
		   Thread.sleep(3000);
		   driver.navigate().back();
	   }
   }
   
}
