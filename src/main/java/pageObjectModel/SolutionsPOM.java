package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsPOM 
{
  public SolutionsPOM(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }
  
  public @FindBy(xpath="//a[@class='headerA'][normalize-space()='solutions']")
  WebElement solutions;
  
  //software engineering
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Software Engineering']")
  WebElement softEng;
  
  public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
  WebElement softEngPage;
  
  
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Technical Publication']")
  WebElement techPub;
  
  
  
}
