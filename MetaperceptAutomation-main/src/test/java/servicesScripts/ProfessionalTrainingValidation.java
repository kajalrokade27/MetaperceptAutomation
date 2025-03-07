package servicesScripts;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;

import pageObjectModel.ServicesPOM;
@Listeners(listeners.ListenersClass.class)
public class ProfessionalTrainingValidation extends BaseClass
{
	@Test
	   public void PTValidation() throws InterruptedException
	   {
		   ServicesPOM sp = new ServicesPOM(driver);
		   Actions act = new Actions(driver);
		   act.moveToElement(sp.services).build().perform();
		   Thread.sleep(2000);
		   sp.proTraining.click();
		   Thread.sleep(2000);
		   String parent = driver.getWindowHandle();
		   Set<String> child = driver.getWindowHandles();
		   child.remove(parent);
		   for(String str: child)
		   {
		   driver.switchTo().window(str);
		   System.out.println(driver.getCurrentUrl());
		   assertTrue(driver.getCurrentUrl().equals("https://training.metapercept.com/"));
		   Reporter.log("Professional training page is navigated to correct page", true);
		   }
	   }
}
