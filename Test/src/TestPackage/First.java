package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	
	
	@Test
	public void OpenBrowser()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\gmail.com");
	}

}
