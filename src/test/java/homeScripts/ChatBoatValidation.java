package homeScripts;

import java.util.Set;

import org.testng.annotations.Test;

import action.ActionClass;
import base.CrossBrowserTesting;
import pageObjectModel.HomePOM;

public class ChatBoatValidation extends CrossBrowserTesting
{
 @Test
 public void chatBoatValidation()
 {
	 HomePOM hp = new HomePOM(driver);
	 
	 String parent = driver.getWindowHandle();
	 Set<String> child = driver.getWindowHandles();
	 child.remove(parent);
	 for(String str: child)
	 {
		 driver.switchTo().window(str);
		 hp.chatBoat.click();
		 hp.enterSearchText.sendKeys("kajal");
		 ActionClass.waitUptoVisible(hp.send_button);
		 hp.send_button.click();
		 hp.minChatBoat();
	 }
		 
	 
 }
}
