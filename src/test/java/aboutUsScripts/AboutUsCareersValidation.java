package aboutUsScripts;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.AboutUsCareers;
@Listeners(listeners.ListenersClass.class)
public class AboutUsCareersValidation extends CrossBrowserTesting
{
   @Test
   public void aboutUsCareerValidation() throws InterruptedException
   {
	   AboutUsCareers ac = new AboutUsCareers(driver);
	   Actions act = new Actions(driver);
	   act.moveToElement(ac.about_us).perform();
	   ac.careers.click();
	   String parent = driver.getWindowHandle();
	   Set<String> child = driver.getWindowHandles();
	   child.remove(parent);
	   System.out.println(child);
	   for(String str: child)
	   {
	   driver.switchTo().window(str);
	   assertTrue(ac.career_page.isDisplayed());
	   Reporter.log("Career is navigated to the correct page", true);
	   ac.apply_now.click();
	   assertTrue(ac.apply_now_page.isDisplayed());
	   Reporter.log("Apply now is redirecting to correct page",true);
	   driver.navigate().back();
	   ScrollDown.scrollPage(ac.applyNow_bottom);
	   Thread.sleep(2000);
	   ac.applyNow_bottom.click();
	   assertTrue(ac.apply_now_page.isDisplayed());
	   Reporter.log("Bottom apply now button is redirecting to correct page",true);
   }
   }
}
