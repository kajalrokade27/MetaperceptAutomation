package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class languageSelector 
{
  public languageSelector(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public @FindBy(xpath="(//div[@class=\"dropdown-toggle\"])[1]")
  WebElement langdropdown;
  
  public @FindBy(xpath="//div[@class=\"dropdownCustom d-none d-xl-block\"]//div//span")
  List<WebElement> all_languages;
}
