package aboutUsScripts;


import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.AboutUsCompanyPOM;

public class CompanyMValidation extends CrossBrowserTesting
{
  @Test
  public void companyValidation() throws InterruptedException
  {
	 AboutUsCompanyPOM ap = new AboutUsCompanyPOM(driver);
     Actions act = new Actions(driver);
     act.moveToElement(ap.about_us).perform();
     ap.company.click();
     assertTrue(ap.company_page.isDisplayed());
     Reporter.log("Company is navigated to correct page", true);
     
     ScrollDown.scrollPage(ap.joinOurTeam);
     ap.joinOurTeam.click();
     
     String parent = driver.getWindowHandle();
     Set<String> child = driver.getWindowHandles();
     child.remove(parent);
     for(String str: child)
     {
    	 driver.switchTo().window(str);
    assertTrue( ap.careerPage.isDisplayed());
    Reporter.log("Join our team is navigated to correct page", true);
     }
     
     
     ap.meta_logo.click();
     driver.switchTo().window(parent);
    
     act.moveToElement(ap.about_us).perform();
     ap.company.click();
     
     
     for(int i=0; i<ap.membershipNindustries.size(); i++)
     {
    	 ScrollDown.scrollPage(ap.membershipNindustries.get(i));
    	 Thread.sleep(3000);
    	 ap.membershipNindustries.get(i).click();
    	 if(i==0)
    	 {
    		 assertTrue(ap.nasscom_text.isDisplayed());
    		 Reporter.log("NASSCOM is showing correct content", true);
  
    	 }
    	 else if(i==1)
    	 {
    		assertTrue(ap.iso2022_text.isDisplayed());
    		Reporter.log("ISO 2022 is showing correct content", true);
    	 }
    	 else if(i==2)
    	 {
    		assertTrue(ap.iso2017_text.isDisplayed());
    		Reporter.log("ISO 2015 is showing correct content", true);
    	 }
    	 else if(i==3)
    	 {
    		assertTrue(ap.automobile_text.isDisplayed());
    		Reporter.log("Automobile is showing correct content", true);
    	 }
    	 else if(i==4)
    	 {
    		assertTrue(ap.education_text.isDisplayed());
    		Reporter.log("Education is showing correct content", true);
    	 }
    	 else if(i==5)
    	 {
    		assertTrue(ap.healthcare_text.isDisplayed());
    		Reporter.log("Healthcare is showing correct content", true);
    	 }
    	 else if(i==6)
    	 {
    		assertTrue(ap.defense_text.isDisplayed());
    		Reporter.log("Defense is showing correct content", true);
    	 }
    	 else if(i==7)
    	 {
    		assertTrue(ap.aerospace_text.isDisplayed());
    		Reporter.log("Aerospace is showing correct content", true);
    	 }
    	 else if(i==8)
    	 {
    		assertTrue(ap.iTHardware_text.isDisplayed());
    		Reporter.log("IT Hardware is showing correct content", true);
    	 }
    	 else if(i==9)
    	 {
    		assertTrue(ap.heavyEng_text.isDisplayed());
    		Reporter.log("Heavy Engineering is showing correct content", true);
    	 }
    	 Thread.sleep(3000);
     }
     
    
  }
}
