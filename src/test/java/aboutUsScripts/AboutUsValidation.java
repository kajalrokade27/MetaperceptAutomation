package aboutUsScripts;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.AboutUsPOM;
@Listeners(listeners.ListenersClass.class)
public class AboutUsValidation extends CrossBrowserTesting
{
  @Test
  public void aboutUsValidation() throws InterruptedException
  {
	 AboutUsPOM ap = new AboutUsPOM(driver);
	 ap.aboutUs.click();
	 Thread.sleep(2000);
	 assertTrue(ap.aboutUsPage.isDisplayed());
	 Reporter.log("About Us is navigated to correct page", true);
	 
	 ScrollDown.scrollPage(ap.aboutCompany);
	 Thread.sleep(2000);
	 ap.aboutCompany.click();
	 assertTrue(ap.companyPage.isDisplayed());
	 Reporter.log("About Company is navigated to correct page", true);
	 driver.navigate().back();
	 
//	 ap.aboutUs.click();
	 ScrollDown.scrollPage(ap.portfolio.get(0));
	 Thread.sleep(3000);
	 
	 for(int i=0; i<ap.portfolio.size(); i++)
	 {
		 ap.portfolio.get(i).click();
		 
		 String parent = driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		 child.remove(parent);
		 for(String str: child)
		 {
			 
		 driver.switchTo().window(str);
	      
		
		 if(driver.getCurrentUrl().contains("portfolio"))
		 {
			 Reporter.log("All three portfolio blocks are navigated to correct page", true);
		 }
		 Thread.sleep(4000);
		 ap.meta_logo.click();
		 
		 }
		 driver.switchTo().window(parent);
		 Thread.sleep(2000);
		 ap.aboutUs.click();
		 ScrollDown.scrollPage(ap.portfolio.get(0));
		 Thread.sleep(4000);
	 }
  }
}
