package action;




import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;


import base.CrossBrowserTesting;

public class ActionClass extends CrossBrowserTesting
{
     
	public static void applyBorder(WebElement element, String color)
	{
			
			//Apply border
			String script = "arguments[0].style.border= '3px solid" + color+ " ' ";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(script, element);
//			Logger.info("Applied the border with color" + color + " to element: " + getElementDescription(by));
	}
	public String returnText(WebElement web)
	{
		String text = web.getText();
		return text;
	}
}
