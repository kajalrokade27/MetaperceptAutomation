package aboutUsScripts;

import static org.testng.Assert.assertTrue;


import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.AboutUsBlogs;
@Listeners(listeners.ListenersClass.class)
public class AboutUsBlogsValidation extends CrossBrowserTesting
{
 @Test(enabled=false)
 public void blogsValidation() throws InterruptedException
 {
	 AboutUsBlogs ab = new AboutUsBlogs(driver);
	 Actions act = new Actions(driver);
	 act.moveToElement(ab.about_us).perform();
	 ab.blog.click();
	 
	 String parent = driver.getWindowHandle();
	 Set<String> child = driver.getWindowHandles();
	 child.remove(parent);
	 for(String str: child)
	 {
		 driver.switchTo().window(str);
		 
		 assertTrue(((WebElement) ab.blog_page).isDisplayed());
		 Reporter.log("Blog is navigated to correct page", true);
//		 for(int i=0; i<4; i++)
//		 {
//			 ScrollDown.scrollPage(ab.load_more);
//			 Thread.sleep(3000);
//			 ab.load_more.click();
//			 Thread.sleep(4000);
//		 }
		 for(int i=0; i<ab.blog_list.size(); i++)
		 {
			 ScrollDown.scrollPage(ab.blog_list.get(i));
			 
			 Thread.sleep(6000);
			 ab.blog_list.get(i).click();
			 
			 Thread.sleep(6000);
			 driver.navigate().back();
			 Thread.sleep(6000);
		 }
	 }
 }
 @Test
 public void postCategoriesValidation() throws InterruptedException
 {
	 AboutUsBlogs ab = new AboutUsBlogs(driver);
	 Actions act = new Actions(driver);
	 act.moveToElement(ab.about_us).perform();
	 ab.blog.click();
	 String parent = driver.getWindowHandle();
	 Set<String> child = driver.getWindowHandles();
	 child.remove(parent);
	 for(String str: child)
	 {
		 driver.switchTo().window(str);
		 
		 assertTrue(ab.blog_page.isDisplayed());
		 Reporter.log("Blog is navigated to correct page", true);
		 
		 for(int i=0; i<ab.post_categories.size();i++)
		 {
		   ScrollDown.scrollPage(ab.post_categories.get(i));
		   ab.post_categories.get(i).click();
		   Thread.sleep(3000);
		 }
		 
	 }
	 
 }
}
 
