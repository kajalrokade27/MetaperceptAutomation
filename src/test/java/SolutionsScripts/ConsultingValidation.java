package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.SolutionsPOM;

public class ConsultingValidation extends CrossBrowserTesting
{
	@Test
	  public void informArchValidation() throws InterruptedException
	  {
		  SolutionsPOM sp = new SolutionsPOM(driver);
		  Actions act = new Actions(driver);
		  act.moveToElement(sp.solutions).build().perform();
		  Thread.sleep(2000);
		  sp.consulting.click();
		  Thread.sleep(2000);
		  assertTrue(sp.consultingPage.isDisplayed());
		  Reporter.log("Consulting  is navigating to correct page", true);
		 
		 for(int i=0; i<sp.readMore.size(); i++)
		 {
			 ScrollDown.scrollPage(sp.readMore.get(i));
			 Thread.sleep(2000);
			 sp.readMore.get(i).click();
			 Thread.sleep(2000);
			 
			 
			 if(i==0)
			 {
				 assertTrue(sp.informArchPage.isDisplayed());
				 Reporter.log("Read more button of information architecture navigated to its destination",true);
			 }
			 else if(i==1)
			 {
				 assertTrue(sp.migrAnalData.isDisplayed());
				 Reporter.log("Read more button of content migration is navigated to its destination",true);
			 }
			 else if(i==2)
			 {
				 assertTrue(sp.contentAuditData.isDisplayed());
				 Reporter.log("Read more button of content strategy navigated to its destination",true);
			 }
			 else if(i==3)
			 {
				 assertTrue(sp.staffAugPage.isDisplayed());
				 Reporter.log("Read more button of staff augmentation is navigated to its destination",true);
			 }
			 driver.navigate().back();
			 Thread.sleep(2000);
		 }
		 
	  }
}
