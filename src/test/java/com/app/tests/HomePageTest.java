package com.app.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;

public class HomePageTest {
	HomePageObjects homePage;
	BasePage basePage;
	public HomePageTest() {
		homePage = new HomePageObjects();
		basePage = new BasePage();
	}
	

	
	@Test
	public void verifyWomenTab() {
		Assert.assertTrue(homePage.getWomenTab().isDisplayed(),"Element not displayed");
	}
	
	@Test(priority = 1)
	public void verifyDressesTab() {
		Assert.assertTrue(homePage.getDressesTab().isDisplayed(),"Element not displayed");
	}
	
	@Test(priority = 2)
	public void verifyTshirtsTab() {
		Assert.assertTrue(homePage.getTshirtsTab().isDisplayed(),"Element not displayed");
	}
	
	@Test(priority = 3)
	public void verifyWomenPageNavigation() {
		homePage.clickWomen();
		Assert.assertTrue(homePage.getWomenTitle().equals("Women - My Store"),"Not Navigated properly");
	}
	
	@Test(priority = 4)
	public void verifyDressesPageNavigation() {
		homePage.clickDresses();
		Assert.assertTrue(homePage.getDressesTitle().equals("Dresses - My Store"),"Not Navigated properly");
	}
	
	@Test(priority = 5)
	public void verifyTshirtPageNavigation() {
		homePage.clickTshirts();
		Assert.assertTrue(homePage.getTshirtsTitle().equals("T-shirts - My Store"),"Not Navigated properly");
	}
	
	@Test(priority = 6)
	public void verifyNewsletterSubscription() {
		homePage.setNewsLetterEmailId();
		homePage.clickNewsLetterSubmit();
		Assert.assertEquals(homePage.getNewsLetterSubscriptionMessage(), "Newsletter : You have successfully subscribed to this newsletter.");
	}

}
