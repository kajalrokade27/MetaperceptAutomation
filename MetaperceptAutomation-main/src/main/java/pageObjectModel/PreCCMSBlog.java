package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreCCMSBlog 
{
  public PreCCMSBlog(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public @FindBy(xpath="//input[@class=\"form-control \"]")
  List<WebElement> fields;
  
  public @FindBy(xpath="//img[@alt='Accelerate Your DITA Adoption with a Pre-CCMS Migration Framework']")
  WebElement preccms_blog;
  
 public @FindBy(xpath="//input[@id='privacy']")
 WebElement checkbox;
 
 public @FindBy(xpath="//button[normalize-space()='Submit']")
 WebElement submit_buton;
 
 public @FindBy(xpath="//a[normalize-space()='Download White Paper']")
 WebElement download_paper;
 
 public String preccms_url = "https://blog.metapercept.com/highlight-single/accelerate-your-dita-adoption-with-a-pre-ccms-migration-framework";
}
