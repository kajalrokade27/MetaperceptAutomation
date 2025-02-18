
//Validate the glossary present in footer page and verifying the filters works as expected 

package homeScripts;
import org.testng.Reporter;
import org.testng.annotations.Test;
import action.ActionClass;
import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;

public class GlossaryValidation extends CrossBrowserTesting
{
  @Test
  public void glossaryValition() throws InterruptedException
  {
	  HomePOM hp = new HomePOM(driver);
	 
	  ScrollDown.scrollPage(hp.glossary_footer);
	  ActionClass.waitUptoClickable(hp.glossary_footer);
	 Thread.sleep(4000);
	  hp.glossary_footer.click();
	 
		 
		  for(int i=0; i<hp.filters.size(); i++)
		  {
			  Thread.sleep(4000);
			  hp.filters.get(i).click();
			  
			  if(i==hp.filters.size()-1)
			  {
				  hp.filters.get(i).sendKeys("kajal");
			  }
			  Thread.sleep(4000);
		 }
		  Reporter.log("Glossary is validated successfully",true);
  }
}
