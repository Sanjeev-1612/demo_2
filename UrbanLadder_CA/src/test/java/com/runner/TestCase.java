package com.runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Bedroom_NewArrivals;
import com.PageObject.CollectionPage;
import com.PageObject.FooterPage;
import com.PageObject.GiftCardPage;
import com.PageObject.KidsRoomPage;
import com.PageObject.LivingPage;
import com.PageObject.SearchPage;
import com.PageObject.StudyPage;
import com.PageObject.TvUnitsPage;
import com.PageObject.Verify_sofa_TextPage;
import com.utility.BaseClass;
import com.utility.Log4j;

public class TestCase extends BaseClass {
		
	@Test(priority=1)
	public void page1() {
		
		logger=report.createTest("Bedroom-AllNewArrivals");
		Bedroom_NewArrivals page=PageFactory.initElements(driver,Bedroom_NewArrivals.class);
		logger.info("Verifying 'AllNewArrivals'under bedroom page");
		page.newArrival();
		logger.pass("success");
	}
	
	@Test(priority=2)
	public void page2() throws InterruptedException {
		
		logger=report.createTest("Footer-We Accept");
		FooterPage page=PageFactory.initElements(driver,FooterPage.class);
		logger.info("searching 'We Accept' text in the footer page test");
		page.footer();
		logger.pass("success");
	}
	
	@Test(priority=3)
	public void page3() {
		
		logger=report.createTest("Gift-STARTS AT");
		GiftCardPage page=PageFactory.initElements(driver,GiftCardPage.class);
		logger.info("verify 'STARTS AT' text in giftcard page test");
		page.gift();
		logger.pass("text verified");
	}
	
	@Test(priority=4)
	public void page4() {
		
		logger=report.createTest("KidsRoom-KidsPlay Tables");
		KidsRoomPage page=PageFactory.initElements(driver,KidsRoomPage.class);
		logger.info("verify 'KidsPlay Tables' text in result page test");
		page.kid();
		logger.pass("text verified");
		
	}
	
	@Test(priority=5)
	public void page5() {
		
		logger=report.createTest("living-323 Products");
		LivingPage page=PageFactory.initElements(driver,LivingPage.class);
		logger.info("verify '323 Products' text under the top of heading test");
		page.room();
		logger.pass("text verified");
		
	}
	
	@Test(priority=6)
	public void page6() {
		
		logger=report.createTest("Search-Showcases");
		SearchPage page=PageFactory.initElements(driver,SearchPage.class);
		logger.info("verify the result of Showcases is opened ");
		page.search();
		logger.pass("text verified");
		
	}
	
	@Test(priority=7)
	public void page7() {
		
		logger=report.createTest("Study-Tablecolor");
		StudyPage page=PageFactory.initElements(driver,StudyPage.class);
		logger.info("verify 'Orange' text is displayed");
		page.study();
		logger.pass("text verified");
		
	}
	
	@Test(priority=8)
	public void page8() throws InterruptedException {
		
		logger=report.createTest("TvUnits-searchbox");
		TvUnitsPage page=PageFactory.initElements(driver,TvUnitsPage.class);
		logger.info("verify 'Tv unit' text is displayed in heading test");
		page.tvUnits();
		logger.pass("text verified");
		
	}
	
	@Test(priority=9)
	public void page9() throws InterruptedException {
		
		logger=report.createTest("sale-sofa");
		Verify_sofa_TextPage page=PageFactory.initElements(driver,Verify_sofa_TextPage.class);
		logger.info("verify 'Kowloon' text is present in the high price sofa test");
		page.sofa();
		logger.pass("text verified");
	}
	
	@Test(priority=10)
	public void page10() {
		
		logger=report.createTest("Collections-exclusive");
		CollectionPage page=PageFactory.initElements(driver,CollectionPage.class);
		logger.info("verify 'UL Picks' text is present in the page");
		page.collection();
		logger.pass("text verified");
		Log4j.createLog();
	}
	
	
}
