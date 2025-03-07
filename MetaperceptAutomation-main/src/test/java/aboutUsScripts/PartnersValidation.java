package aboutUsScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import pageObjectModel.AboutUsPartners;
@Listeners(listeners.ListenersClass.class)
public class PartnersValidation extends BaseClass
{
  @Test
  public void partnersValidation() throws InterruptedException
  {
	  AboutUsPartners ap = new AboutUsPartners(driver);
	  Actions act = new Actions(driver);
	  act.moveToElement(ap.about_us).perform();
	  
	  ap.partners.click();
	  ap.all.click();
	  ScrollDown.scrollPage(ap.partnerslist.get(0));
	  
	  for(int i=0; i<ap.partnerslist.size(); i++)
	  {
		  ap.partnerslist.get(i).click();
		  Thread.sleep(2000);
	  }
	  Thread.sleep(4000);
	  ap.all2.click();
	  Thread.sleep(4000);
	  System.out.println(ap.allPartnersList.size());
	  for(int i=0; i<ap.allPartnersList.size(); i++)
	  {
		  ScrollDown.scrollPage(ap.allPartnersList.get(i));
		  Thread.sleep(4000);
		 // ap.allPartnersList.get(i).click();
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",ap.allPartnersList.get(i));
		  
		  Thread.sleep(4000);
		   driver.navigate().to("https://metapercept.com/aboutus/partners/");
		   Thread.sleep(6000);
	}
	  Reporter.log("All partners redirected to its destination", true);
	  
  }
}
