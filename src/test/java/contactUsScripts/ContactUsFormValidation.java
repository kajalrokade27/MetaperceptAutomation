package contactUsScripts;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import fileUtility.GetExcelData;
import pageObjectModel.ContactUsPOM;

public class ContactUsFormValidation extends CrossBrowserTesting
{
	
  @Test()
  public void formValidation() throws InterruptedException
  {
	  ContactUsPOM cp = new ContactUsPOM(driver);
	  cp.contactUs.click();
	  
	 
		 
	  for(int i=1; i<cp.formFileds.size(); i++)
	  {
		  ScrollDown.scrollPage(cp.formFileds.get(i));
		  Thread.sleep(4000);
		  cp.formFileds.get(i).sendKeys("vishal");
		  Thread.sleep(2000);
	  }
	  
	  
  }
//  @DataProvider(name = "excelData")
//	public Object[][] getData() throws IOException 
//	{
//		int row = GetExcelData.getRows("Sheet1");
//		System.out.println(row);
//		int column = GetExcelData.getCells("Sheet1");
//		System.out.println(column);
//    Object[][]obj=new Object[row][column];
//    for(int i=0; i<row; i++)
//    {
//  	  for(int j=0; j<column; j++)
//  	  {
//  	 obj[i][j]= GetExcelData.Exceldata("Sheet1", i, j); 
//  	  }
//    }
//    return obj;
//    
 //   }
}
