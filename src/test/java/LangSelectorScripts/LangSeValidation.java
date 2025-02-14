package LangSelectorScripts;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.CrossBrowserTesting;
import pageObjectModel.languageSelector;

public class LangSeValidation  extends CrossBrowserTesting
{
   @Test
   public void langValidation() throws InterruptedException
   {
	   languageSelector ls = new languageSelector(driver);
	  
	   
	   for(int i = 0 ; i<ls.all_languages.size(); )
	   {
		   ls.langdropdown.click();
		   Thread.sleep(4000);
		   String text  = ls.all_languages.get(i).getText();
		   ls.all_languages.get(i).click();
		   Thread.sleep(6000);
		   assertTrue(ls.langdropdown.getText().equals(text));
		   Reporter.log(text +" language is selected successfully",true);
		   i++;
	   }
   }
}
