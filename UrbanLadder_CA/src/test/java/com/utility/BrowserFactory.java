package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startApp(WebDriver driver,String browserName,String appURL) {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("browser not found");
		}
		
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
