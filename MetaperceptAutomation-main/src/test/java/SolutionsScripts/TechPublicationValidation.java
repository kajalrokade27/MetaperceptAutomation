package SolutionsScripts;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import pageObjectModel.SolutionsPOM;
@Listeners(listeners.ListenersClass.class)
public class TechPublicationValidation extends BaseClass
{
	  @Test()
	    public void techPublicationValidation1() throws InterruptedException {
	        SolutionsPOM sp = new SolutionsPOM(driver);
	        Actions act = new Actions(driver);
	        
	        act.moveToElement(sp.solutions).build().perform();
	        Thread.sleep(4000);
	        sp.techPub.click();
	        Thread.sleep(4000);
	        
	        assertTrue(sp.techPubPage.isDisplayed(), "Technical publication page is not displayed");
	        Reporter.log("Technical publication is navigated to correct page", true);
	        
	        validateSection(sp.leftElements, new String[]{
	            "Content Analysis", "Topic based authoring", "Element Definition", "Content Reuse",
	            "Content Audit", "Content Management", "Content Structuring", "Content Optimization"
	        }, new WebElement[]{
	            sp.contentAnalysisData, sp.topicAuthoringContent, sp.elementDefContent, sp.contentReuseData,
	            sp.contentAuditData, sp.contentManageData, sp.contentStructuringData, sp.contentOptData
	        });
	        
	        validateSection(sp.rightElements, new String[]{
	            "Content Compatibility", "Content Tuning", "Content Transformation", "Unified Authoring",
	            "Migration Analysis", "Information Distribution", "Content Cleanup", "Output Distribution"
	        }, new WebElement[]{
	            sp.contentCompData, sp.contentTuningData, sp.contentTransformData, sp.unifiedAuthContent,
	            sp.migrAnalData, sp.informDistrData, sp.contentClenData, sp.opDistriData
	        });
	    }
	    
	    private void validateSection(List<WebElement> elements, String[] messages,WebElement[] validationElements) throws InterruptedException 
	    {
	        for (int i = 0; i < elements.size(); i++)
	        {
	            ScrollDown.scrollPage(elements.get(i));
	            Thread.sleep(4000);
	            elements.get(i).click();
	            Thread.sleep(4000);
	            assertTrue(validationElements[i].isDisplayed(), messages[i] + " content is not displayed correctly");
	            Reporter.log(messages[i] + " is showing the right content", true);
	        }
	    }
}
