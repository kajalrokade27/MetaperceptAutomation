package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPOM  
{
   public ServicesPOM(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   public @FindBy(xpath="//a[@class='headerA'][normalize-space()='services']")
   WebElement services;
   
   
   
   
   
   //Software development
   public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Software Development']")
   WebElement softDev;
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement softDevPageTitle;
   
   public @FindBy(xpath="//img[@class=\"jsx-578c3cb307331748 sectionLogoImg\"]")
   List<WebElement> block_elements;
   
   
}
