package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.KidsUi;

public class KidsRoomPage {

	WebDriver driver; 

	public KidsRoomPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void kid() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(KidsUi.kid).click();
	driver.findElement(KidsUi.play).click();
	
	if(driver.getPageSource().contains("Kids Tables")) {
		System.out.println("text is verified");
	}


	}
}