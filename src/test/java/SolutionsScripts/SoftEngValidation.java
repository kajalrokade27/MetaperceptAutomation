package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.SolutionsPOM;

public class SoftEngValidation extends CrossBrowserTesting
{
  @Test()
  public void softEngValidation() throws InterruptedException
  {
	  SolutionsPOM sp = new SolutionsPOM(driver);
	  Actions act = new Actions(driver);
	  act.moveToElement(sp.solutions).build().perform();;
	  Thread.sleep(2000);
	  sp.softEng.click();
	  assertTrue(sp.softEngPage.isDisplayed());
	  Reporter.log("Software engineering is navigated to correct page",true);
 
	  for(int i=1; i<sp.DevElements.size(); i++)
	  {
		 ScrollDown.scrollPage(sp.DevElements.get(i));
		 Thread.sleep(4000);
		 sp.DevElements.get(i).click();
		 Thread.sleep(4000);
		 
		 if(i==1)
		 {
			 assertTrue(sp.learnOLData.isDisplayed());
			 Reporter.log("LearnOL is showing right content",true);
			 
		 }
		 else if(i==2)
		 {
			 assertTrue(sp.webApplicationData.isDisplayed());
			 Reporter.log("Web Applications is showing right content",true); 
		 }
		 else if(i==3)
		 {
			 assertTrue(sp.customSoftData.isDisplayed());
			 Reporter.log("Custom Software  is showing right content",true);
		 }
		 else if(i==4)
		 {
			 assertTrue(sp.applDevData.isDisplayed());
			 Reporter.log("Application Development is showing right content",true);
		 }
		 else if(i==5)
		 {
			 assertTrue(sp.platEvalData.isDisplayed());
			 Reporter.log("Platform evaluation is showing right content",true);
		 }
		 else if(i==6)
		 {
			 assertTrue(sp.applDeployData.isDisplayed());
			 Reporter.log("Application Deployment is showing right content",true);
		 }
		 else if(i==7)
		 {
			 assertTrue(sp.servDelData.isDisplayed());
			 Reporter.log("Service delivery is showing right content",true);
		 }
		
	  }
	  
	  for(int i=0; i<sp.mServNDocOps.size(); i++)
	  {
		  ScrollDown.scrollPage(sp.mServNDocOps.get(i));
		  Thread.sleep(4000);
		  sp.mServNDocOps.get(i).click();
		  Thread.sleep(4000);
		  
		  if(i==0)
		  {
			  assertTrue(sp.userInterfaceData.isDisplayed());
			  Reporter.log(" User Interface is showing right content",true);
		  }
		  else if(i==1)
		  {
			  assertTrue(sp.businessLogicData.isDisplayed());
			  Reporter.log("Business Logic is showing right content",true);
		  }
		  else if(i==2)
		  {
			  assertTrue(sp.aPIManageData.isDisplayed());
			  Reporter.log("API Management is showing right content",true);
		  }
		  else if(i==3)
		  {
			  assertTrue(sp.databaseData.isDisplayed());
			  Reporter.log("Database is showing right content",true);
		  }
		  else if(i==4)
		  {
			  assertTrue(sp.strtgPlanningData.isDisplayed());
			  Reporter.log("Strategic planning is showing right content",true);
		  }
		  else if(i==5)
		  {
			  assertTrue(sp.docManageData.isDisplayed());
			  Reporter.log("Document management is showing right content",true);
		  }
		  else if(i==6)
		  {
			  assertTrue(sp.projectCollData.isDisplayed());
			  Reporter.log("Project Collaboration is showing right content",true);
		  }
		  else if(i==7)
		  {
			  assertTrue(sp.knowledgeManageData.isDisplayed());
			  Reporter.log("Knowledge management is showing right content",true);
		  }
		  
		  
	  }
  }
  
}
