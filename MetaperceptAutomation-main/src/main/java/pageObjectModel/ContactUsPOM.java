package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPOM 
{
   public ContactUsPOM(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public @FindBy(xpath="//a[@class='headerA'][normalize-space()='Contact Us']")
   WebElement contactUs;
   
   public @FindBy(xpath="//input[@class=\"jsx-74fbd9796a6f9252\"]")
   List<WebElement> formFileds;
   
   public @FindBy(xpath="//textarea[@id=\"Description\"]")
   WebElement description;
   
   public @FindBy(xpath="//input[@id=\"privacyTool1832254000000780019\"]")
   WebElement checkbox;
   
   public @FindBy(xpath="//input[@id=\"formsubmit\"]")
   WebElement submit;
}
