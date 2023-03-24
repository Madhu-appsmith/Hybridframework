package com.tutorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ARMPage {
	
	public WebDriver driver;
	
	public ARMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	

	//Objects Of WebElements
		@FindBy(xpath="//span[text()='Modification Maintenance']")
		private WebElement ModificationText;
		@FindBy(xpath="(//div[@style='display: flex; flex: 1 0 auto;'])[1]")
		private WebElement RowFind;
		@FindBy(xpath="//input[@placeholder='End']")
		private WebElement EndText;
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement mdFirstField;
		@FindBy(xpath="(//input[@type='text'])[3]")
		private WebElement mdSecondField;
//		@FindBy(xpath="//*[@id='kc-login']")
//		private WebElement LoginFiled;
		//drop-down
		@FindBy(xpath="//*[@id='gq86qu8199']/div/div/div/span/span/div/button/span")
		private WebElement clickOnDropDown;
		@FindBy(xpath="//div[text()='Last 1 Year']")
		private WebElement dropdownfindField;
		@FindBy(xpath="//div[text()='Last 1 Year']")
		private WebElement clickField;
		@FindBy(xpath="//div[@class='sc-iYPUho eZdQqi']")
		private WebElement searchButton;
		@FindBy(xpath="(//div[@class='sc-iYPUho eDzAsH'])[2]")
		private WebElement resetButton;
		@FindBy(xpath="//span[text()='Products Group']")
		private WebElement PgButton;
		@FindBy(xpath="(//div[@class='relative flex items-center justify-center flex-grow'])[5]")
		private WebElement RtButton;
		@FindBy(xpath="//span[text()='Products Group']")
		private WebElement Productgrouptext;
		@FindBy(xpath="(//div[@class='relative flex items-center justify-center flex-grow'])[5]")
		private WebElement Recipetypetext;
		@FindBy(xpath="//*[@id='header-root']/div/nav/div[2]/div[2]/div[4]/a/span/span/div/div[1]/span")
		private WebElement Recipesettext;
		
		
		
		//Actions On WebElements
		
		public Boolean verufyModificationText() {
			ModificationText.isDisplayed();
			return true;
		}
		public Boolean verufyEndText() {
			EndText.isDisplayed();
			return true;
		}
		
		public void enterDataInText(String mdFirst) {
			mdFirstField.sendKeys(mdFirst);
		}
	
		public void enterDataInText2(String mdSecond) {
			mdSecondField.sendKeys(mdSecond);
		}
		
		public void enter7daysValueInDropDown() {
			clickOnDropDown.click();
			dropdownfindField.click();
			
		}
			public void clickFiled() {
				clickField.click();
			
		}
		public void clickOnsearchButton() {
			searchButton.click();
			
		}

		public void clickOnresetButton() {
			
			resetButton.click();
		}
		public void clickOnPgButton() {
			PgButton.click();
			
		}
		public void clickOnRtButton() {
			RtButton.click();
		}
		public void clickOnProductgrouptext() {
			Productgrouptext.click();
			
		}
		public void clickOnRecipetypetext() {
			Recipetypetext.click();
		}
		public void clickOnRecipesettext() {
			Recipesettext.click();
	
		
}
		
}	


