package pageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CrossBrowserTesting;

public class HomePOM extends CrossBrowserTesting
{
   public HomePOM(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   private @FindBy(id="min_window")
   WebElement min_chatboat;
   
   public @FindBy(xpath="(//a[@class=\"tp-white-btn\"])[1]")
   WebElement get_in_touch1;
   public @FindBy(xpath="(//a[@class=\"tp-white-btn\"])[2]")
   WebElement get_in_touch2;
   public @FindBy(xpath="(//a[@class=\"tp-white-btn\"])[3]")
   WebElement get_in_touch3;
   
   public @FindBy(css="h1[class=\"jsx-643036caf1458463 breadcrumb__title mb-10\"]")
   WebElement contact_page_title;
   
   private @FindBy(xpath="//button[@id=\"rcc-confirm-button\"]")
   WebElement acceptAll;
   
   public @FindBy(xpath="//h1[@class=\"jsx-643036caf1458463 breadcrumb__title mb-10\"]")
   WebElement softwareDevTitle;
   
   private @FindBy(xpath="(//h2[@class=\"jsx-2b8dbe08890aa52f ca-service__item-title mb-10 \"])[1]")
   WebElement softwareDev;
   
   private @FindBy(xpath="(//p[@class=\"jsx-2b8dbe08890aa52f mb-0\"])[2]")
   WebElement techWriter;
   
   public @FindBy(xpath="//h1[@class=\"jsx-643036caf1458463 breadcrumb__title mb-10\"]")
   WebElement techWriterTitle;
   
   public @FindBy(xpath="//*[@class=\"tp-section__title\"]")
   List<WebElement> singleCard;
   
   public @FindBy(css="img[alt=\"Metapercept_logo\"]")
   WebElement metaLogo;
   
   public @FindBy(xpath="//a[text()='solutions']")
   WebElement solutions;
   
   private @FindBy(xpath="(//a[text()='Home'])[1]")
   WebElement home;
   
   public void minChatBoat()
   {
	   min_chatboat.click();
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
   
}
