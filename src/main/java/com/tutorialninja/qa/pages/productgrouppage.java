package com.tutorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productgrouppage {
public WebDriver driver;
	
	public productgrouppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	

	//Objects Of WebElements
		@FindBy(xpath="(//span[text()='Products Group'])[1]")
		private WebElement ProductsGroupText;
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement pgFirstFiled;
		@FindBy(xpath="(//input[@type='text'])[1]")
		private WebElement pgSecondField;
//		@FindBy(xpath="//*[@id='kc-login']")
//		private WebElement LoginFiled;
		//drop-down
		@FindBy(xpath="(//span[@class='bp3-button-text'])[7]")
		private WebElement pgclickOnDropDown;
		@FindBy(xpath="//div[text()='BOOK - Mechanical book paper1']")
		private WebElement pgdropdownfindField;
		@FindBy(xpath="//div[text()='BOOK - Mechanical book paper1']")
		private WebElement pgclickField;
		@FindBy(xpath="//div[@class='sc-iYPUho eZdQqi']")
		private WebElement pgsearchButton;
		@FindBy(xpath="//div[@class='sc-iYPUho etQfjw']")
		private WebElement pgresetButton;
		
		
		//Actions On WebElements
		
		public Boolean verufyProductsGroupText() {
			ProductsGroupText.isDisplayed();
			return true;
		}
		
		public void enterDataInText(String pgFirst) {
			pgFirstFiled.sendKeys(pgFirst);
		}
	
		public void enterDataInText2(String pgSecond) {
			pgSecondField.sendKeys(pgSecond);
		}
		
		public void enterBOOKMechanicalbooktextInDropDown() {
			pgclickOnDropDown.click();
			pgdropdownfindField.click();
			
		}
			public void pgclickFiled() {
				pgclickField.click();
			
		}
		public void clickOnpgsearchButton() {
			pgsearchButton.click();
			
		}

		public void clickOnpgresetButton() {
			
			pgresetButton.click();
		}

		}

