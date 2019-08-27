package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects extends BasePage {

	public HomePageObjects() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[1]")
	WebElement txtWomen;
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]")
	WebElement txtDresses;
	@FindBy(xpath ="//div[@id='block_top_menu']/ul/li[3]")
	WebElement txtTshirts;
	@FindBy(xpath = "//input[@id='newsletter-input']")
	WebElement inputEmailID;
	@FindBy(xpath = "//button[@name='submitNewsletter']")
	WebElement btnSubmitNewsLetter;
	@FindBy(xpath ="//p[@class='alert alert-success']")
	WebElement txtEmailSubscription;
	
	public WebElement getWomenTab() {
		return txtWomen;
	}
	
	public WebElement getDressesTab() {
		return txtDresses;
	}
	
	public WebElement getTshirtsTab() {
		return txtTshirts;
	}
	
	public void clickWomen() {
		txtWomen.click();
	}
	
	public void clickDresses() {
		txtDresses.click();
	}
	
	public void clickTshirts() {
		txtTshirts.click();
	}
	
	public String getWomenTitle( ) {
		return getTitle();
	}
	
	public String getDressesTitle() {
		return getTitle();
	}
	
	public String getTshirtsTitle() {
		return getTitle();			
	}
	
	public void setNewsLetterEmailId() {
		setText(inputEmailID, "arul3@gmail.com");
	}
	
	public void clickNewsLetterSubmit() {
		btnSubmitNewsLetter.click();
	}
	
	public String getNewsLetterSubscriptionMessage() {
		return txtEmailSubscription.getText();
	}

}
