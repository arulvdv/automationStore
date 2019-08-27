package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObject extends BasePage{

	public ProductPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]//div//div[@class='product-image-container']")
	WebElement firstProduct;
	
	@FindBy(xpath = "//button//i[@class='icon-twitter']")
	WebElement btnTweet;
	
	@FindBy(xpath ="//button//i[@class='icon-facebook']")
	WebElement btnShare;
	
	@FindBy(xpath = "//div[@id='short_description_content']//p")
	WebElement txtDescription;

	public void clickFirstProduct() {
		firstProduct.click();
	}
	
	public WebElement getTweet() {
		return btnTweet;
	}
	
	public WebElement getShare() {
		return btnShare;
	}
	
	public WebElement getDescription() {
		return txtDescription;
	}
	

}
