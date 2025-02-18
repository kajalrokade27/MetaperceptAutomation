
//To verify the subscribe button in body section is clickable and redirected to subscribe section in body section

package homeScripts;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import action.ActionClass;
import action.ScrollDown;
import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;
@Listeners(listeners.ListenersClass.class)
public class SubscribeLinkValidation extends CrossBrowserTesting
{
   @Test
   public void subscribeRedirectionValidation()
   {
	   HomePOM hp = new HomePOM(driver);
	   ScrollDown.scrollPage(hp.subscribe_BodySection);
	   ActionClass.applyBorder(hp.subscribe_BodySection, "green");
	   hp.subscribe_BodySection.click();
	   assertTrue(hp.subscribe.isDisplayed());
	   Reporter.log("Subscribe is redirected to subscribe section in footer page", true);
   }
}
