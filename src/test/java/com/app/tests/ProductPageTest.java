package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.DressesPageObject;
import com.app.pages.HomePageObjects;
import com.app.pages.ProductPageObject;

public class ProductPageTest {
	
	BasePage basePage;
	HomePageObjects homePage;
	DressesPageObject dressPage;
	ProductPageObject productPage;

	public ProductPageTest() {
		basePage = new BasePage();
		homePage = new HomePageObjects();
		dressPage = new DressesPageObject();
		productPage = new ProductPageObject();
	}
	
	@Test
	public void verifyProductDetailsPage() {
		homePage.clickDresses();
		productPage.clickFirstProduct();
		Assert.assertTrue(basePage.elementFound(productPage.getTweet()));
		Assert.assertTrue(basePage.elementFound(productPage.getShare()));
		Assert.assertTrue(basePage.elementFound(productPage.getDescription()));
		
	}
}
