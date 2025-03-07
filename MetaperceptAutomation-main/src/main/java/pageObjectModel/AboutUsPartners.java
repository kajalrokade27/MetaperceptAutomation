package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPartners 
{
  public AboutUsPartners(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public @FindBy(xpath="//a[@class='headerA'][normalize-space()='About Us']")
  WebElement about_us;
  
  public @FindBy(xpath="//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//nav[1]//ul[1]//li[4]//ul[1]//li[2]//a[1]")
  WebElement partners;
  
  public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
  WebElement our_partners;
  
  public @FindBy(xpath="//button[@class=\"jsx-1c6c7785d64eeb64 active\"]")
  WebElement all;
  
  public @FindBy(xpath="//button[normalize-space()='All']")
  WebElement all2;
  public @FindBy(xpath="//button[@class=\"jsx-1c6c7785d64eeb64 \"]")
  List<WebElement> partnerslist;
  
  public @FindBy(xpath="//img[@class=\"jsx-1c6c7785d64eeb64 \"]")
  List<WebElement> allPartnersList;
  
}
