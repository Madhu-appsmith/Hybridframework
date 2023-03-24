package com.tutorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {
	
	public WebDriver driver;
	
	
	public AccountLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Objects Of WebElements
	@FindBy(xpath="//input[@id='username']")
	private WebElement usernameField;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordField;
	@FindBy(xpath="//input[@id='kc-login']") //input[@id='kc-login']
	private WebElement loginButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement waringTextWhenWrongCreditials;
	
	//Actions On WebElements
	
	public void enterDatausernameField(String username) {
		usernameField.sendKeys(username);
	}
	
	public void enterDatapasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnloginButton() {
		loginButton.click();
		
	}
	
	public ARMPage enterCreditialsInLoginPage(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		return new ARMPage(driver);
	}
	

	public Boolean checkWaringTextMsgWhenUserEnterWrongCredentials() {
		boolean confirmationFlag = waringTextWhenWrongCreditials.isDisplayed();
		return confirmationFlag;
	}
}


