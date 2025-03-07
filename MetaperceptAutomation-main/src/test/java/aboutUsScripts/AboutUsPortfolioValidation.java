package aboutUsScripts;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import pageObjectModel.AboutUsPortfolio;
@Listeners(listeners.ListenersClass.class)
public class AboutUsPortfolioValidation  extends BaseClass
{
   @Test
   public void aboutUsPortfolioValidation() throws InterruptedException
   {
	   AboutUsPortfolio ap = new AboutUsPortfolio(driver);
	   Actions act = new Actions(driver);
	   act.moveToElement(ap.about_us).build().perform();
	   ap.portfolio.click();
	   
	   String parent = driver.getWindowHandle();
	   Set<String> child = driver.getWindowHandles();
	   child.remove(parent);
	   for(String str: child)
	   {
		   driver.switchTo().window(str);
	   for(int i =0; i<ap.portBlocks.size(); i++)
	   {
		   ScrollDown.scrollPage(ap.portBlocks.get(i));
		   Thread.sleep(3000);
		   ap.portBlocks.get(i).click();
		   Thread.sleep(3000);
		  }
	   }
	   Reporter.log("All portfolio blocks are redirected to correct page",true);
	   ap.all.click();
	   
	   
	   for(int i=0; i<ap.singleBlocks.size(); i++)
	   {
		   ScrollDown.scrollPage(ap.load_more);
		   Thread.sleep(3000);
		   ap.load_more.click();
		   
		   ScrollDown.scrollPage(ap.singleBlocks.get(i));
		   Thread.sleep(3000);
		   ap.singleBlocks.get(i).click();
		   ap.back_button.click();
		}
	   Reporter.log("All blocks are redirecting to correct page",true);
	   
   }
}
