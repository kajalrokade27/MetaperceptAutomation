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
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement WebDevPage;
   
   public @FindBy(xpath="//p[@class='mb-0']")
   WebElement customEngPage;
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement applIntPage;
   
   public @FindBy(xpath="//div[@class='jsx-643036caf1458463 col-md-9 col-lg-8 col-xxl-6 col-sm-12 bg-panel-glass side-content grayTheme']")
   WebElement docOpsPage;
   
   
   //Technical writing
   public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Technical Writing']")
   WebElement techWriting;
   
   public @FindBy(xpath="//p[@class=\"jsx-f34b4beb70c6346 mb-0 applyZIndex\"]")
   List<WebElement> servicesBlock;
   
   //professional training
   public @FindBy(xpath="//a[@target='_blank'][normalize-space()='Professional Training']")
   WebElement proTraining;
   
   
   
   
}
