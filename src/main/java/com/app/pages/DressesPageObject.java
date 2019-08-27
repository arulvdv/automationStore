package com.app.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesPageObject extends BasePage {

	public DressesPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label//a[text()='S']")
	WebElement txtSizeS;

	@FindBy(xpath = "//label//a[text()='M']")
	WebElement txtSizeM;

	@FindBy(xpath = "//label//a[text()='L']")
	WebElement txtSizeL;

	@FindBys(@FindBy(xpath = "//span[text()='Size']/parent::div/following-sibling::ul/li"))
	List<WebElement> sizeCheckBox;

	@FindBy(xpath = "//span[text()='There are 5 products.']")
	WebElement txtProductCountHeading;

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	List<WebElement> productList;
	
	@FindBy(xpath = "//span[text()='(empty)']")
	WebElement txtCartEmpty;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div/div/a/img")
	WebElement productOne;
	
	//@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]//span[text()='Add to cart']")
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]")
	WebElement btnAddToCart;
	
	@FindBy(tagName ="h2")
	WebElement txtAddToCart;
	
	@FindBy(xpath = "//i[@class='icon-ok']")
	WebElement itemAddedTocart;
	
	@FindBy(xpath = "//h2/span/span[text()='1']")
	WebElement cartQuantity;
	
	@FindBy(xpath = "//div[@id='layer_cart']/div[1]/div[1]/span")
	WebElement closeWindow;

	public WebElement getSizeS() {
		return txtSizeS;
	}

	public WebElement getSizeM() {
		return txtSizeM;
	}

	public WebElement getSizeL() {
		return txtSizeL;
	}

	public void checkSize() {
		for (int i = 0; i < sizeCheckBox.size(); i++) {
			sizeCheckBox.get(i).click();
		}
	}

	public int getProductCount() {
		return productList.size();
	}

	public int getProductCountFromHeading() {
		/*
		 * String txt = txtProductCountHeading.getText(); String[] txtSplit =
		 * txt.split(" "); String txtcount = txtSplit[2]; int headingProductCount =
		 * Integer.parseInt(txtcount); return headingProductCount;
		 */

		return Integer.parseInt(txtProductCountHeading.getText().split(" ")[2]); // simple way
	}
	
/*	public void clickAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",btnAddToCart);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
		btnAddToCart.click();
	}*/
	
	public void moveAndClickAddToCart() {
		Actions ac = new Actions(driver);
		ac.moveToElement(productOne).moveToElement(btnAddToCart).click().build().perform();
	}
	
	public WebElement productAddedToCart() {
		return itemAddedTocart;
	}
	
	public WebElement quantityaddedToCart() {
		return cartQuantity;
	}
	
	public String getTxtCart(){
		isElementVisible(txtAddToCart);
		return getTxtCart();
	}
	
	public void closeProductWindow() {
		Actions ac = new Actions(driver);
		ac.moveToElement(closeWindow).click().build().perform();
	}

}