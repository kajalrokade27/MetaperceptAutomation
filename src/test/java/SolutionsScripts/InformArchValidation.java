package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.CrossBrowserTesting;
import pageObjectModel.SolutionsPOM;

public class InformArchValidation extends CrossBrowserTesting
{
  @Test
  public void informArchValidation() throws InterruptedException
  {
	  SolutionsPOM sp = new SolutionsPOM(driver);
	  Actions act = new Actions(driver);
	  act.moveToElement(sp.solutions).build().perform();;
	  Thread.sleep(2000);
	  sp.informArch.click();
	  Thread.sleep(2000);
	 assertTrue(sp.informArchPage.isDisplayed());
	 Reporter.log("Information architecture is navigating to correct page", true);
	 
  }
}
