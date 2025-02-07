package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.SolutionsPOM;

public class TechPublicationValidation extends CrossBrowserTesting
{

	  @Test()
	  public void techPublicationValidation() throws InterruptedException
	  {
		  SolutionsPOM sp = new SolutionsPOM(driver);
		  Actions act = new Actions(driver);
		  act.moveToElement(sp.solutions).build().perform();
		  Thread.sleep(2000);
		  sp.techPub.click();
		  Thread.sleep(4000);
		  assertTrue(sp.techPubPage.isDisplayed());
		  Reporter.log("Technical publication is navigated to correct page",true);
		  
		for(int i=0; i<sp.leftElements.size(); i++)
		{
			ScrollDown.scrollPage(sp.leftElements.get(i));
			Thread.sleep(2000);
			sp.leftElements.get(i).click();
			Thread.sleep(2000);
			
			if(i==0)
			{
				assertTrue(sp.contentAnalysisData.isDisplayed());
				Reporter.log("Content Analysis is showing the right content",true);
			}
			else if(i==1)
			{
				assertTrue(sp.topicAuthoringContent.isDisplayed());
				Reporter.log("Topic based authoring is showing the right content", true);
			}
			else if(i==2)
			{
				assertTrue(sp.elementDefContent.isDisplayed());
				Reporter.log("Element Definition is showing the right content", true);
			}
			else if(i==3)
			{
				assertTrue(sp.contentReuseData.isDisplayed());
				Reporter.log("Content Reuse is showing the right content", true);
			}
			else if(i==4)
			{
				assertTrue(sp.contentAuditData.isDisplayed());
				Reporter.log("Content Audit is showing the right content", true);
			}
			else if(i==5)
			{
				assertTrue(sp.contentManageData.isDisplayed());
				Reporter.log("Content Management is showing the right content", true);
			}
			else if(i==6)
			{
				assertTrue(sp.contentStructuringData.isDisplayed());
				Reporter.log("Content Structuring is showing the right content", true);
			}
			else if(i==7)
			{
				assertTrue(sp.contentOptData.isDisplayed());
				Reporter.log("Content Optimization is showing the right content", true);
			}
		}
		
		for(int i=0; i<sp.rightElements.size(); i++)
		{
			ScrollDown.scrollPage(sp.rightElements.get(i));
			Thread.sleep(2000);
			sp.rightElements.get(i).click();
			Thread.sleep(2000);
			
			if(i==0)
			{
				assertTrue(sp.contentCompData.isDisplayed());
				Reporter.log("content compatability is showing the right content",true);
			}
			else if(i==1)
			{
				assertTrue(sp.contentTuningData.isDisplayed());
				Reporter.log("Content Tunning is showing the right content", true);
			}
			else if(i==2)
			{
				assertTrue(sp.contentTransformData.isDisplayed());
				Reporter.log("Content transformation is showing the right content", true);
			}
			else if(i==3)
			{
				assertTrue(sp.unifiedAuthContent.isDisplayed());
				Reporter.log("Unified Authoring is showing the right content", true);
			}
			else if(i==4)
			{
				assertTrue(sp.migrAnalData.isDisplayed());
				Reporter.log("Migration Analysis is showing the right content", true);
			}
			else if(i==5)
			{
				assertTrue(sp.informDistrData.isDisplayed());
				Reporter.log("Information distribution is showing the right content", true);
			}
			else if(i==6)
			{
				assertTrue(sp.contentClenData.isDisplayed());
				Reporter.log("Content Cleanup is showing the right content", true);
			}
			else if(i==7)
			{
				assertTrue(sp.opDistriData.isDisplayed());
				Reporter.log("Output Distribution is showing the right content", true);
			}
		}
		  
		  
	  }
}
