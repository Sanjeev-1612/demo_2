package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.newUi;

public class Bedroom_NewArrivals {

	WebDriver driver; 

	public Bedroom_NewArrivals(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@SuppressWarnings("deprecation")
	public void newArrival() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(newUi.bed).click();
		driver.findElement(newUi.Allnew).click();
		driver.findElement(newUi.close).click();
		
		if(driver.getPageSource().contains("All New Arrivals")) {
			System.out.println("text is verified");
		}
			
		
	}
}
