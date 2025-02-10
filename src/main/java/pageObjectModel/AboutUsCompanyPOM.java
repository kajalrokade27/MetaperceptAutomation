package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsCompanyPOM 
{
  public AboutUsCompanyPOM(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public @FindBy(xpath="//a[@class='headerA'][normalize-space()='About Us']")
  WebElement about_us;
  
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Company']")
  WebElement company;
  
  public @FindBy(xpath="//div[@class='jsx-643036caf1458463 col-md-9 col-lg-8 col-xxl-6 col-sm-12 bg-panel-glass side-content orangeTheme']")
  WebElement company_page;
  
  public @FindBy(xpath="//div[@id='affiliation']//i[1]")
  WebElement joinOurTeam;
  
  public @FindBy(xpath="//h2[normalize-space()='Are you looking for a dream job?']")
  WebElement careerPage;
  
  public @FindBy(xpath="//img[contains(@alt,'Metapercept_logo')]")
  WebElement meta_logo;
  
  public @FindBy(xpath="//button[normalize-space()='NASSCOM']")
  WebElement nasscom;
  
  public @FindBy(xpath="//p[contains(text(),'As proud members of NASSCOM, we align with the wor')]")
  WebElement nasscom_text;
  
  public @FindBy(xpath="//button[normalize-space()='ISO 27001:2022']")
  WebElement iso2022;
  
  public @FindBy(xpath="//p[contains(text(),'In adherence to international benchmarks, we metic')]")
  WebElement iso2022_text;
  
  public @FindBy(xpath="//button[normalize-space()='ISO 9001:2015']")
  WebElement iso2017;
  
  public @FindBy(xpath="//p[contains(text(),'Committed to the standards, our processes and syst')]")
  WebElement iso2017_text;
    
  public @FindBy(xpath="//li[@class=\"jsx-6b05680bce022abf nav-item\"]")
  List<WebElement> industries;
  
  public @FindBy(xpath="//p[contains(@class,'jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20')]")
  WebElement automobile_text;
  
 
  public @FindBy(xpath="//p[contains(@class,'jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20')]")
  WebElement education_text;

  public @FindBy(xpath="//p[contains(@class,'jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20')]")
  WebElement healthcare_text;
  
  public @FindBy(xpath="//p[contains(@class,'jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20')]")
  WebElement defense_text;
  
  public @FindBy(xpath="//p[@class='jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20']")
  WebElement aerospace_text;
  
  public @FindBy(xpath="//p[@class='jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20']")
  WebElement iTHardware_text;
  
  public @FindBy(xpath="//p[@class='jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20']")
  WebElement heavyEng_text;
  
  
  
  
  
}
