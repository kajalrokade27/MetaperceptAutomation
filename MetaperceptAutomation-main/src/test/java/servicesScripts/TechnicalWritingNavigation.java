package servicesScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import pageObjectModel.ServicesPOM;
@Listeners(listeners.ListenersClass.class)
public class TechnicalWritingNavigation extends BaseClass
{
   @Test
   public void servicesBlocksNavigation() throws InterruptedException
   {
	   ServicesPOM sp = new ServicesPOM(driver);
	   Actions act = new Actions(driver);
	   act.moveToElement(sp.services).build().perform();;
	   Thread.sleep(2000);
	   sp.techWriting.click();
	   
	   assertTrue(driver.getCurrentUrl().contains("technicalwriting"));
	   Reporter.log("Technical writing is navigated to destination", true);
	   
	   
	  
	   
	   for(int i=0; i<sp.block_elements.size(); i++)
	   {
		   ScrollDown.scrollPage(sp.block_elements.get(0));
		   Thread.sleep(3000);
		   sp.servicesBlock.get(i).click();
		   if(i==0)
		   {
			   assertTrue(driver.getCurrentUrl().contains("document-migration"));
			   Reporter.log("Document migration block is navigated to correct page",true);
		   }
		   if(i==1)
		   {
			   assertTrue(driver.getCurrentUrl().contains("structured-authoring"));
			   Reporter.log("Structured authoring  block is navigated to correct page",true);
		   }
		   if(i==2)
		   {
			   assertTrue(driver.getCurrentUrl().contains("contentconversion"));
			   Reporter.log("Content conversion block is navigated to correct page",true);
		   }
		   if(i==3)
		   {
			   assertTrue(driver.getCurrentUrl().contains("editing-and-proofreading"));
			   Reporter.log("Editing and profreading block is navigated to correct page",true);
		   }
		   if(i==4)
		   {
			   assertTrue(driver.getCurrentUrl().contains("docs-as-code"));
			   Reporter.log("Docs-as-Code block is navigated to correct page",true);
		   }
		   if(i==5)
		   {
			   assertTrue(driver.getCurrentUrl().contains("knowledge-management-system"));
			   Reporter.log("DocOps blog is navigated to correct page",true);
		   }
		   Thread.sleep(3000);
		   driver.navigate().back();
	   }
   }
   
}
