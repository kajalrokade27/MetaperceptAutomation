package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsBlogs 
{
   public AboutUsBlogs(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public @FindBy(xpath="//a[@class='headerA'][normalize-space()='About Us']")
   WebElement about_us;
   
   public @FindBy(xpath="//a[@target='_blank'][normalize-space()='Blog']")
   WebElement blog;
   
   public @FindBy(xpath="//h3[@class='breadcrumb__title']")
  WebElement blog_page;
   
   public @FindBy(xpath="//span[contains(text(),'Load More')]")
   WebElement load_more;
   
   public @FindBy(xpath="//div[@class=\"col-lg-6 p-3\"]")
   List<WebElement> blog_list;
   
   public @FindBy(xpath="//div[@class=\"widget category-widget\"]//ul//li")
   List<WebElement> post_categories;
   
  
   
}
