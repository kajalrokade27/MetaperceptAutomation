package SolutionsScripts;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import pageObjectModel.SolutionsPOM;
@Listeners(listeners.ListenersClass.class)
public class SoftEngValidation extends BaseClass
{
  @Test
  public void softEngValidation1() throws InterruptedException {
      SolutionsPOM sp = new SolutionsPOM(driver);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      Actions act = new Actions(driver);

      act.moveToElement(sp.solutions).perform();
      wait.until(ExpectedConditions.elementToBeClickable(sp.softEng)).click();
      assertTrue(wait.until(ExpectedConditions.visibilityOf(sp.softEngPage)).isDisplayed(), 
                 "Software Engineering page did not load properly");
      Reporter.log("Software engineering navigated to correct page", true);
      Thread.sleep(3000);
      validateSections(sp.DevElements, new WebElement[]{
         sp.metR, sp.learnOLData, sp.webApplicationData, sp.customSoftData, sp.applDevData,
          sp.platEvalData, sp.applDeployData, sp.servDelData
      }, new String[]{
          "MetR", "LearnOL", "Web Applications", "Custom Software", "Application Development",
          "Platform Evaluation", "Application Deployment", "Service Delivery"
      });

      validateSections(sp.mServNDocOps, new WebElement[]{
          sp.userInterfaceData, sp.businessLogicData, sp.aPIManageData, sp.databaseData,
          sp.strtgPlanningData, sp.docManageData, sp.projectCollData, sp.knowledgeManageData
      }, new String[]{
          "User Interface", "Business Logic", "API Management", "Database",
          "Strategic Planning", "Document Management", "Project Collaboration", "Knowledge Management"
      });
  }


  private void validateSections(List<WebElement> elements, WebElement[] expectedData, String[] descriptions) throws InterruptedException {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      for (int i = 0; i < elements.size() ; i++) {
          ScrollDown.scrollPage(elements.get(i));
          Thread.sleep(4000);
          wait.until(ExpectedConditions.elementToBeClickable(elements.get(i))).click();
          assertTrue(wait.until(ExpectedConditions.visibilityOf(expectedData[i])).isDisplayed(),
                     descriptions[i] + " content is not displayed correctly");
          Reporter.log(descriptions[i] + " is showing the right content", true);
      }
  }
  
}
