package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.CollectionUi;

public class CollectionPage {

	WebDriver driver; 

	public CollectionPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@SuppressWarnings("deprecation")
	public void collection() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(CollectionUi.coll).click();
		driver.findElement(CollectionUi.ul).click();
		
		if(driver.getPageSource().contains("UL Picks")) {
			System.out.println("text is verified");
		}
			
		
	}
	
}
