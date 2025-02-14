package contactUsScripts;



import org.openqa.selenium.WebElement;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;

import pageObjectModel.ContactUsPOM;
@Listeners(listeners.ListenersClass.class)
public class ContactUsFormValidation extends CrossBrowserTesting
{
	
  @Test()
  public void validationWithValidData() throws InterruptedException
  {
	  ContactUsPOM cp = new ContactUsPOM(driver);
	  cp.contactUs.click();
	  

	  for(int i=5; i<cp.formFileds.size()-2; i++)
	  {
		 
		  ScrollDown.scrollPage(cp.formFileds.get(i));
		  Thread.sleep(4000);
		  if(i==5)
		  {
		  cp.formFileds.get(i).sendKeys("vishal");
		  }
		  else if(i==6)
		  {
			  cp.formFileds.get(i).sendKeys("satpute");
		  }
		  else if(i==7)
		  {
			  cp.formFileds.get(i).sendKeys("9876543210");
		  }
		  else if(i==8)
		  {
			  cp.formFileds.get(i).sendKeys("kajal@gmail.com"); 
		  }
		  else if(i==9)
		  {
			  cp.formFileds.get(i).sendKeys("vishal");
		  }
		  else if(i==11)
		  {
			  ((WebElement) cp.formFileds).click();
		  }
		  
		  Thread.sleep(2000);
	  }
	  cp.description.sendKeys("Automation testing of metapercept application");
	  cp.checkbox.click();
	  cp.submit.click();
	  
	  
  }
  @Test()
  public void validationWithInValidData() throws InterruptedException
  {
	  ContactUsPOM cp = new ContactUsPOM(driver);
	  cp.contactUs.click();
	  

	  for(int i=5; i<cp.formFileds.size()-2; i++)
	  {
		 
		  ScrollDown.scrollPage(cp.formFileds.get(i));
		  Thread.sleep(4000);
		  if(i==5)
		  {
		  cp.formFileds.get(i).sendKeys("1234");
		  }
		  else if(i==6)
		  {
			  cp.formFileds.get(i).sendKeys("@#$%^");
		  }
		  else if(i==7)
		  {
			  cp.formFileds.get(i).sendKeys("          ");
		  }
		  else if(i==8)
		  {
			  cp.formFileds.get(i).sendKeys("kajal@gmail.com"); 
		  }
		  else if(i==9)
		  {
			  cp.formFileds.get(i).sendKeys("          ");
		  }
		  else if(i==11)
		  {
			  ((WebElement) cp.formFileds).click();
		  }
		  
		  Thread.sleep(2000);
	  }
	  cp.description.sendKeys("Automation testing of metapercept application");
	  cp.checkbox.click();
	  cp.submit.click();
	  
	  
  }


}
