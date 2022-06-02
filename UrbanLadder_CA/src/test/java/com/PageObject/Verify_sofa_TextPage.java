package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.SaleUi;

public class Verify_sofa_TextPage {

	WebDriver driver; 

	public Verify_sofa_TextPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void sofa() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(SaleUi.sale).click();
	driver.findElement(SaleUi.sofa).click();
	driver.findElement(SaleUi.price).click();
	driver.findElement(SaleUi.high).click();
	 
	Thread.sleep(2000);
	
	if(driver.getPageSource().contains("Kowloon"))
	{
		System.out.println("text verified");
	}
	
	}
}