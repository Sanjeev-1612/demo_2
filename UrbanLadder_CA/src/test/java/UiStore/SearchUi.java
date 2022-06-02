package UiStore;

import org.openqa.selenium.By;

public class SearchUi {

	public static By input=By.xpath("//input[@id='search']");
	public static By click=By.xpath("//span[@class='search-icon icofont-search']");
	public static By like=By.xpath("//span[@class='icofont icofont-heart_outline_thick dwishicon authentication_popup login-link' and @data-price='6623']");
	public static By email=By.xpath("//form//div//input[@id='spree_user_email']");
	public static By pass=By.xpath("//input[@placeholder='Password']");
	public static By login=By.xpath("//input[@class='button primary']");
}
