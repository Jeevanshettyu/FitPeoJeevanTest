package FitpeoFactory;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import FitpeoContext.webdrivercontext;
import FitpeoPages.BasePage;


public class PageInstanceFactory 
{
public static <T extends BasePage> T getInstance(Class<T> type)
{ 
	try
	{
	return type.getConstructor(WebDriver.class).newInstance(webdrivercontext.getDriver());
	}
	catch(IllegalAccessException | InstantiationException | IllegalArgumentException | InvocationTargetException 
			| NoSuchMethodException | SecurityException e)
	{
		e.printStackTrace();
		return null;
	}
	
}
}

