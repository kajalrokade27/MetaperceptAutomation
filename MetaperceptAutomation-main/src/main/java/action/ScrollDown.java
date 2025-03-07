package action;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import base.BaseClass;


public class ScrollDown extends BaseClass
{
    public static void scrollPage(WebElement element)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});",element);
    }
}
