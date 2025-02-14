package homeScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;
@Listeners(listeners.ListenersClass.class)
public class SearchFieldValidation extends CrossBrowserTesting
{
  @Test
  public void positiveTesting() throws AWTException
  
  {
	  HomePOM hp = new HomePOM(driver);
	  hp.search_button.click();
	  hp.search_field.sendKeys("metapercept");
	  Robot rb = new Robot();
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
  }
  
  @Test
  public void negativeTesting() throws AWTException
  {
	  HomePOM hp = new HomePOM(driver);
	  hp.search_button.click();
	  hp.search_field.sendKeys("robot");
	  Robot rb = new Robot();
	  rb.keyPress(KeyEvent.VK_ENTER);
  }
}
