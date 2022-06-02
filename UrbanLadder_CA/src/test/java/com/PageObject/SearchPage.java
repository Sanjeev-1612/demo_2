package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.utility.ExcelDataProvider;

import UiStore.SearchUi;

public class SearchPage {

	WebDriver driver; 

	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void search() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	ExcelDataProvider excel=new ExcelDataProvider();
	String data=excel.getStringData("Input", 0, 0);
	
	driver.findElement(SearchUi.input).sendKeys(data);
	driver.findElement(SearchUi.click).click();
	//driver.findElement(SearchUi.like).click();
	//driver.findElement(SearchUi.email).sendKeys("sanjss0816@gmail.com");
	//driver.findElement(SearchUi.pass).sendKeys("appu@1612");
	//driver.findElement(SearchUi.login).click();
	//driver.findElement(SearchUi.like).click();
	
	}
}
