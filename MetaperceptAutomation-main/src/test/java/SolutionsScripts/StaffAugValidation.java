package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;

import pageObjectModel.SolutionsPOM;
@Listeners(listeners.ListenersClass.class)
public class StaffAugValidation extends BaseClass
{
 @Test
 public void staffAugValidation() throws InterruptedException
 {
	 SolutionsPOM sp = new SolutionsPOM(driver);
	  Actions act = new Actions(driver);
	  act.moveToElement(sp.solutions).build().perform();
	  Thread.sleep(2000);
	  sp.staffAug.click();
	  Thread.sleep(2000);
	 assertTrue(sp.staffAugPage.isDisplayed());
	 Reporter.log("Staff Augmentation is navigating to correct page", true);
 }
}
