package blog;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import fileUtility.GetExcelData;
import pageObjectModel.PreCCMSBlog;

public class FormValidation extends CrossBrowserTesting
{
	@DataProvider(name = "excelData")
	public Object[][] getData() throws IOException 
	{
		int row = GetExcelData.getRows("Sheet1");
		System.out.println(row);
		int column = GetExcelData.getCells("Sheet1");
		System.out.println(column);
      Object[][]obj=new Object[row][column];
      for(int i=0; i<row; i++)
      {
    	  for(int j=0; j<column; j++)
    	  {
    	 obj[i][j]= GetExcelData.Exceldata("Sheet1", i, j); 
    	  }
      }
      return obj;
      
      }
  @Test(dataProvider = "excelData")
  public void validateFields(String data1, String data2) throws InterruptedException
  {
	  PreCCMSBlog pb = new PreCCMSBlog(driver);
	  ScrollDown.scrollPage(pb.preccms_blog);
	  Thread.sleep(4000);
	  pb.preccms_blog.click();
	  
	  String parent = driver.getWindowHandle();
	  Set<String> child = driver.getWindowHandles();
	  child.remove(parent);
	  
	  for(String str: child)
	  {
		driver.switchTo().window(str);
	  for(int i=0; i<pb.fields.size(); i++)
	  {
		 WebElement txt_field =  pb.fields.get(i);
		 if(i==0)
		 {
		 txt_field.sendKeys(data2);
		 }
		 else if(i==1)
		 {
		 txt_field.sendKeys(data2);
		 }
		 else if(i==2)
		 {
		 txt_field.sendKeys(data2);
		 }
		 else if(i==3)
		 {
		 txt_field.sendKeys(data2);
		 }
		 else if(i==4)
		 {
		 txt_field.sendKeys(data2);
		 }
		
		 
	  }
	     pb.checkbox.click();
		 pb.submit_buton.click();
		 Thread.sleep(4000);
		 
		 
		 
	  }
	  
	  
  }
}
