package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.CrossBrowserTesting;
import pageObjectModel.SolutionsPOM;

public class SoftEngValidation extends CrossBrowserTesting
{
  @Test
  public void softEngValidation() throws InterruptedException
  {
	  SolutionsPOM sp = new SolutionsPOM(driver);
	  Actions act = new Actions(driver);
	  act.moveToElement(sp.solutions).build().perform();;
	  Thread.sleep(2000);
	  sp.softEng.click();
	  assertTrue(sp.softEngPage.isDisplayed());
	  Reporter.log("Software engineering is navigated to correct page",true);
	  
	 
  }
}
