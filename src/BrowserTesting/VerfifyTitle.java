package BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerfifyTitle {
	
	WebDriver driver;
	
	
	@Test
	@Parameters("Browser")
	public void VerifypageTitle( String browserName){
		
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\Selenium\\selenium driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("http:www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	

}
