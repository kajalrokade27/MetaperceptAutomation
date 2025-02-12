package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsCareers 
{
  public AboutUsCareers(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public @FindBy(xpath="//a[@class='headerA'][normalize-space()='About Us']")
  WebElement about_us;
  
  public @FindBy(xpath="//a[@target='_blank'][normalize-space()='Careers']")
  WebElement careers;
  
  public @FindBy(xpath="//h2[normalize-space()='Are you looking for a dream job?']")
  WebElement career_page;
  
  public @FindBy(xpath="//div[contains(@class,'col-lg-6 d-flex align-items-center')]//span[contains(text(),'Apply now')]")
  WebElement apply_now;
  
  public @FindBy(xpath="//h3[contains(@class,'breadcrumb__title')]")
  WebElement apply_now_page;
  
  public @FindBy(xpath="//span[@class='text-center button-space']//span[contains(text(),'Apply now')]")
  WebElement  applyNow_bottom;
  
  
  
}
