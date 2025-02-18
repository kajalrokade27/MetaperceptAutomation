package pageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.ActionClass;
import base.CrossBrowserTesting;

public class HomePOM extends CrossBrowserTesting
{
   public HomePOM(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public @FindBy(xpath="//nav[@id='mobile-menu']//a[normalize-space()='Home']")
   WebElement home2;
   
   public @FindBy(xpath="//i[@class=\"material-icons\"]")
   WebElement search_button;
   
   public @FindBy(xpath="//input[@placeholder=\"What you are looking for ?\"]")
   WebElement search_field;
   
   private @FindBy(xpath="//div[@id=\"min_window\"]")
   WebElement min_chatboat;
   
   public @FindBy(id="siqiframe")
   WebElement chatIframe;
   
   public @FindBy(xpath="(//a[@class=\"tp-white-btn\"])[1]")
   WebElement get_in_touch1;
   public @FindBy(xpath="(//a[@class=\"tp-white-btn\"])[2]")
   WebElement get_in_touch2;
   public @FindBy(xpath="(//a[@class=\"tp-white-btn\"])[3]")
   WebElement get_in_touch3;
   
   public @FindBy(css="h1[class=\"jsx-643036caf1458463 breadcrumb__title mb-10\"]")
   WebElement contact_page_title;
   
   public @FindBy(xpath="//button[@id=\"rcc-confirm-button\"]")
   WebElement acceptAll;
   
   public @FindBy(xpath="//button[@id='rcc-decline-button']")
   WebElement reject_all;
   
   public @FindBy(xpath="//a[@class='subscribe-link']")
   WebElement subscribe_BodySection;
   
   public @FindBy(xpath="//em[@id='zsiq_agtpic']")
   WebElement chatBoat;
   
   public @FindBy(xpath="//em[@id='zsiq_agtpic']")
   WebElement enterSearchText;
   
   public @FindBy(xpath="//em[@id='zsiq_agtpic']")
   WebElement send_button;
   
   public @FindBy(xpath="//h1[@class=\"jsx-643036caf1458463 breadcrumb__title mb-10\"]")
   WebElement softwareDevTitle;
   
   public @FindBy(xpath="(//h2[@class=\"jsx-2b8dbe08890aa52f ca-service__item-title mb-10 \"])[1]")
   WebElement softwareDev;
   
   private @FindBy(xpath="(//p[@class=\"jsx-2b8dbe08890aa52f mb-0\"])[2]")
   WebElement techWriter;
   
   public @FindBy(xpath="//h1[@class=\"jsx-643036caf1458463 breadcrumb__title mb-10\"]")
   WebElement techWriterTitle;
   
   public @FindBy(xpath="(//*[@class=\"tp-section__title\"])[1]")
   WebElement singleCard1;
   public @FindBy(xpath="(//*[@class=\"tp-section__title\"])[2]")
   WebElement singleCard2;
   public @FindBy(xpath="(//*[@class=\"tp-section__title\"])[3]")
   WebElement singleCard3;
   public @FindBy(xpath="(//*[@class=\"tp-section__title\"])[4]")
   WebElement singleCard4;
   
   public @FindBy(css="img[alt=\"Metapercept_logo\"]")
   WebElement metaLogo;
   
   public @FindBy(xpath="//a[text()='solutions']")
   WebElement solutions;
   
   public @FindBy(xpath="(//a[text()='Home'])[1]")
   WebElement home;
   
   public @FindBy(xpath="//button[@class=\"active\"]")
   WebElement informArch;
   
   public @FindBy(xpath="//button[@class='active']")
   WebElement techPublication;
   
   public @FindBy(xpath="//button[@class='active']")
   WebElement webDev;
   
   public @FindBy(xpath="//button[@class='active']")
   WebElement applIntegration;
   
   public @FindBy(xpath="//div[@class=\"jsx-7775ae9b2b1d08f2 app-feature__info\"]")
   List<WebElement> weProvide;
   
   public @FindBy(xpath="//h2[@class='tp-section__title mb-10 mainTitle']")
   WebElement solPageVerify;
   
   public @FindBy(xpath="//h1[contains(@class,'jsx-643036caf1458463 breadcrumb__title mb-10')]")
   WebElement softEngPageVerify;
   
   public @FindBy(xpath="//h2[normalize-space()='Structured Authoring']")
   WebElement techPubVerify;
   
   public @FindBy(xpath="//h2[contains(text(),'Drive Success with Optimized Information Architect')]")
   WebElement informArchVerify;
   
   public @FindBy(xpath="//h2[normalize-space()='Content Migration']")
   WebElement contentMigrVerify;
   
   public @FindBy(xpath="//h2[contains(text(),'Streamline Your IT Hiring Process with On-Demand S')]")
   WebElement staffAugVerify;
   
   public @FindBy(xpath="//div[@class=\"jsx-2b9bbeab701600c1 tp-bs-sv-icon mb-25\"]")
   List<WebElement> offerServices;
   
   public @FindBy(xpath="//button[normalize-space()='Automobile']")
   WebElement finTechVerify;
   
   public @FindBy(xpath="//p[contains(@class,'jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20')]")
   WebElement cloudComputing;
   
   public @FindBy(xpath="//p[@class='jsx-6b05680bce022abf wow tpfadeUp solutionDesc mt-lg-0 mt-20 mb-20']")
   WebElement storageVis;
   
   public @FindBy(xpath="//div[@class=\"jsx-58b7c5694f5c9b27 fix\"]")
   List<WebElement> latest_posts;
   
   public @FindBy(xpath="//h2[contains(text(),'🌍 Metapercept at DITA Europe 2025!')]")
   WebElement ditaEurope;
   
   public @FindBy(xpath="//h2[contains(text(),'Accelerate Your DITA Adoption with a Pre-CCMS Migr')]")
   WebElement pre_CCMSPost;
   
   public @FindBy(xpath="//h2[contains(text(),'Tackling Medical Device Documentation Challenges H')]")
   WebElement tackleMedicalDevicePost;
   
   
  
 
   public void minChatBoat()
   {
	   min_chatboat.click();
	   ActionClass.applyBorder(min_chatboat, "green");
   }
   public void ClickGetInTouch1()
   {
	   get_in_touch1.click();
	   
   }
   public void ClickGetInTouch2()
   {
	   get_in_touch2.click();
   }
   public void ClickGetInTouch3()
   {
	   get_in_touch3.click();
   }
   public void acceptCookies()
   {
 	 acceptAll.click();
   }
   public void ClickSoftDev()
   {
	  softwareDev.click();
   }
   public void clickTechWriter()
   {
	   techWriter.click();
   }
   public void clickSingleCard1()
   {
	   singleCard1.click();
	  
   }
   public void clickSingleCard2()
   {
	   singleCard2.click();
   }
   public void clickSingleCard3()
   {
	   singleCard3.click();
   }
   public void clickSingleCard4()
   {
	   singleCard4.click();
   }
   
   
   
   
//   public void clickSingleCard() throws InterruptedException, AWTException
//   {
//   for(int i=0; i<singleCard.size(); i++)
//	{
//		singleCard.get(i).click();
//		Thread.sleep(2000);
//		solutions.click();
//		
//		//metaLogo.click();
//		 Robot rb = new Robot();
//	     rb.keyPress(KeyEvent.VK_PAGE_DOWN); 
//	     rb.keyRelease(KeyEvent.VK_PAGE_DOWN); 
//	     rb.keyPress(KeyEvent.VK_PAGE_DOWN); 
//	     rb.keyRelease(KeyEvent.VK_PAGE_DOWN); 
//		Thread.sleep(2000);
//	}
//   }
   
   public void clickHome()
   {
	   home.click();
   }
   
   
   
   //Body modules
   public @FindBy(id="EMAIL")
   WebElement email;
   
   public @FindBy(xpath="//button[@aria-label='subscribe']")
   WebElement subscribe;
   
   public @FindBy(xpath="//p[contains(text(),'Thank you for subscribing! ')]")
   WebElement thankUPage;
   
   public @FindBy(xpath="//a[@class=\"font-12\"]")
   List<WebElement> quickLinks;
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement AboutUsVerify;
   
   public @FindBy(xpath="//p[@class='mb-0']")
   WebElement servicesVerify;
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement solutionsVerify;
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement contactUsVerify;
   
   public @FindBy(xpath="//h3[@class='breadcrumb__title']")
   WebElement blogVerify;
   
   public @FindBy(xpath="//h2[normalize-space()='Category/Events']")
   WebElement eventsVerify;
   
   public @FindBy(xpath="//h2[normalize-space()='Category/News']")
   WebElement news;
   
   public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
   WebElement glossary;
   
   
   //footer modules Social links
   public @FindBy(xpath="//a[@class=\"jsx-35cb58e8c8a8618a\"]")
   List<WebElement> socialLinks;
   
   public @FindBy(xpath="(//a[@class=\"font-12\"])[8]")
   WebElement glossary_footer;
   
   public @FindBy(xpath="//input[@class=\"jsx-a4829e4f91684617\"]")
   List<WebElement> filters;
   
   public @FindBy(xpath="//li[@class=\"me-0\"]")
   List<WebElement> footer_modules;
   
   
   
   
   //emails
   public @FindBy(id="errorSubscribeEmail")
   WebElement errorMail;
   
   //Scroll up icon
   
   public @FindBy(xpath="//button[@aria-label='Go Top']")
   WebElement scroll_up_icon;
   
   
   
}
