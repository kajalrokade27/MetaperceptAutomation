package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPortfolio 
{
   public AboutUsPortfolio(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public @FindBy(xpath="//a[@class='headerA'][normalize-space()='About Us']")
   WebElement about_us;
   
   public @FindBy(xpath="//a[@target='_blank'][normalize-space()='Portfolio']")
   WebElement portfolio;
   
   public @FindBy(xpath="//h3[@class='breadcrumb__title']")
   WebElement portfolio_page;
   
   public @FindBy(xpath="//span[contains(text(),'Load More')]")
   WebElement load_more;
   
   public @FindBy(xpath="//div[@class=\"col-12\"]//a")
   List<WebElement> portBlocks;
   
   public @FindBy(xpath="//div[@class=\"pf-single-item \"]")
   List<WebElement> singleBlocks; 
   
   public @FindBy(xpath="//button[@class=\"back-btn\"]")
   WebElement back_button;
   
   public @FindBy(xpath="//span[@class=\"text-center button-space\"]")
   WebElement contact_us;
   
   public @FindBy(xpath="//button[normalize-space()='All']")
   WebElement all;
}
