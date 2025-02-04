package action;

import java.lang.System.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
