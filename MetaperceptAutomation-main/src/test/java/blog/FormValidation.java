package blog;

import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.logging.LogManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.BaseClass;

import fileUtility.GetExcelData;
import pageObjectModel.PreCCMSBlog;
@Listeners(listeners.ListenersClass.class)
public class FormValidation extends BaseClass
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
  public void validateFields(String data1, String data2) throws InterruptedException, IOException
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
         
		
		    LocalDateTime date = LocalDateTime.now();
			String current_date = date.toString().replace(":", "-");
		    TakesScreenshot ts = (TakesScreenshot)driver;
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File("C:\\Users\\Admin\\eclipse-workspace\\com.crm.metapercept\\BlogFormScreenshots\\failedScreenshot"+current_date+".png");
		    FileHandler.copy(from, to);
		   Reporter.log("Fields acccepts invalid input" ,true);
		   
		
		    
		 
	  }
	  
	  
  }
}
