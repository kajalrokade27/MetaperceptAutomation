package homeScripts;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ActionClass;
import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;

public class ScrollIconValidation extends CrossBrowserTesting
{
  @Test
  public void scrollIconValidation() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	  ScrollDown.scrollPage(hp.email);
	  ActionClass.waitUptoVisible(hp.scroll_up_icon);
	  ActionClass.applyBorder(hp.scroll_up_icon, "green");
	 
	  ActionClass.jsClick(hp.scroll_up_icon);
	  ActionClass.waitUptoVisible(hp.get_in_touch3);
	  assertTrue(hp.get_in_touch3.isDisplayed());
	  Reporter.log("Scroll up button is working",true);
	  
  }
}
