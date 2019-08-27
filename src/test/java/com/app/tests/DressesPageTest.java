package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.app.pages.BasePage;
import com.app.pages.DressesPageObject;
import com.app.pages.HomePageObjects;

public class DressesPageTest {

	BasePage basePage;
	HomePageObjects homePage;
	DressesPageObject dressPage;
	
	public DressesPageTest() {
		basePage = new BasePage();
		homePage = new HomePageObjects();
		dressPage = new DressesPageObject();
	}
	

	@Test(priority = 1)
	public void verifyDressesSize() {
		homePage.clickDresses();
		dressPage.checkSize();
		Assert.assertTrue(dressPage.getSizeS().isDisplayed(), "Size S not displayed");
		Assert.assertTrue(dressPage.getSizeM().isDisplayed(), "Size M not displayed");
		Assert.assertTrue(dressPage.getSizeL().isDisplayed(), "Size L not displayed");
	}
		
	@Test(priority = 2)
	public void verifyProductsCount() {
		//homePage.clickDresses();
		Assert.assertTrue(dressPage.getProductCountFromHeading()==dressPage.getProductCount(), "Product count mismatch");
	}
	
	@Test(priority = 3)
	public void verifyProductAddedToCart() {
		//homePage.clickDresses();
		//dressPage.clickAddToCart();
		dressPage.moveAndClickAddToCart();
		String text = dressPage.getTxtCart();
		Assert.assertTrue(dressPage.productAddedToCart().isDisplayed(),"Item not added to cart");
	}
}




