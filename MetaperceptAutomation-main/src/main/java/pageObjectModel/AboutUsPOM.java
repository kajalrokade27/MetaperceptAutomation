package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPOM 
{
 public AboutUsPOM(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 
 }
 public @FindBy(xpath="//a[@class='headerA'][normalize-space()='About Us']")
 WebElement aboutUs;
 
 public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
 WebElement aboutUsPage;
 
 public @FindBy(xpath="//a[@aria-label='read more']")
 WebElement aboutCompany;
 
 public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
 WebElement companyPage;
 
 public @FindBy(xpath="//p[@class=\"jsx-78d72a204cf6c7da m-0 text-center mb-3\"]")
 List<WebElement> portfolio;
 
 public @FindBy(xpath="//h3[@class='breadcrumb__title']")
 WebElement soft_devPage;
 
 public @FindBy(xpath="//div[@class='col-md-9 col-lg-7 col-xxl-6 col-sm-12 bg-panel-glass side-content']")
 WebElement technicalwriting_page;
 
 public @FindBy(xpath="//div[@class='breadcrumb__area theme-bg']//p[1]")
 WebElement applIntPage;
 
 public @FindBy(xpath="//img[contains(@alt,'Metapercept_logo')]")
 WebElement meta_logo;
 
 
}
