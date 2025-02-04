package homeScripts;



import java.io.IOException;

import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.CrossBrowserTesting;
import fileUtility.GetExcelData;
import pageObjectModel.HomePOM;

public class ValidateEmail extends CrossBrowserTesting
{
//	@DataProvider(name = "excelData")
//    public Object[][] getData() throws IOException {
//        // Provide the relative path to the Excel file in the resources folder
//        return GetExcelData.Exceldata("Sheet1", 0, 0);
//    }
	  @Test(enabled= true)
	  public void emailValidation() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  HomePOM hp = new HomePOM(driver);
		  Actions act = new Actions(driver);
		  for (int i = 0; i < 6; i++) 
		  {
	          act.sendKeys(Keys.PAGE_DOWN).perform();
	      }
		  
		  Thread.sleep(5000); 
		  hp.email.sendKeys(GetExcelData.Exceldata("Sheet1", 1, 0));
		  Thread.sleep(3000);
		  hp.subscribe.click();
		  
		    String given_title = "Metapercept Technology Services LLP";
			String parent = driver.getWindowHandle();
			
			Set<String> child = driver.getWindowHandles();
		
			Thread.sleep(4000);
			
			for(String str : child)
			{
				driver.switchTo().window(str);
				
				if(given_title.equals(driver.getTitle()))
				{
		       if(hp.thankUPage.isDisplayed())
		       {
			  Reporter.log("Email field accepts the valid email format",true);
		       }
			    }
		   }
	  }
	  
}
