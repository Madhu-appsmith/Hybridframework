package com.tutorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recipesetpage {
public WebDriver driver;
	
	public Recipesetpage(WebDriver driver2) {
		PageFactory.initElements(driver, this);
		this.driver=driver2;
	}
	
	

		//Objects Of WebElements
		@FindBy(xpath="//span[text()='View/Add Recipe Set']")
		private WebElement viewaddrecipesetText;
		@FindBy(xpath="(//div[@style='display: flex; flex: 1 0 auto;'])[1]")
		private WebElement RowFind;
		@FindBy(xpath="//input[@placeholder='End']")
		private WebElement EndText;
//		@FindBy(xpath="(//input[@type='text'])[2]")
//		private WebElement mdFirstField;
//		@FindBy(xpath="(//input[@type='text'])[3]")
//		private WebElement mdSecondField;
		@FindBy(xpath="//button[@class='bp3-button bp3-fill sc-hGEFff llzXwG']")
		private WebElement pgreset;
		//drop-down
		@FindBy(xpath="//span[text()='Recipe Set']")  //span[@class='sc-dkuHdP zmOmH dropdown-icon']
		private WebElement clickOnRecipeset;
		@FindBy(xpath="(//button[@type='button'])[8]")
		private WebElement clickOnDropDown;
		@FindBy(xpath="(//div[@class='bp3-text-overflow-ellipsis bp3-fill'])[4]") 
		private WebElement dropdownfindField;
		@FindBy(xpath="(//div[@class='bp3-text-overflow-ellipsis bp3-fill'])[4]")
		private WebElement RsclickField;
		@FindBy(xpath="(//input[@class='bp3-input'])[2]")
		private WebElement RsFirstField;
		@FindBy(xpath="(//input[@type='text'])[3]")
		private WebElement RssecondField;
		@FindBy(xpath="//span[text()='Valid From']")
		private WebElement validfromtext;
		@FindBy(xpath="//div[@class='sc-iYPUho eZdQqi']")
		private WebElement searchbutton;
		@FindBy(xpath="//div[@class='sc-iYPUho etQfjw']")
		private WebElement resetbutton;
//		
		
		
		//Actions On WebElements
		
		public Boolean verufyviewaddrecipesetText() {
			viewaddrecipesetText.isDisplayed();
			return true;
		}
		public Boolean verufyEndText() {
			EndText.isDisplayed();
			return true;
		}
		
		public void enterDataInText(String mdFirst) {
			pgreset.click();
		}
	
//		public void enterDataInText2(String mdSecond) {
//			mdSecondField.sendKeys(mdSecond);
//		}
		
		public void enterrescipesetValueInDropDown() { 
			//Actions action = new Actions(driver);
			
			clickOnDropDown.click();
			dropdownfindField.click();
			
		}
			public void clickRsclickField() {
				RsclickField.click();
			
		}
//		public void clickOnsearchRtButton() {
//			RtsearchButton.click();
//			
//		}
		public void enterDataInText1(String RsFirst) {
			RsFirstField.sendKeys(RsFirst);
		}
		public void enterDataInText2(String Rssecond) {
			RssecondField.sendKeys(Rssecond);
		}
//		public void findrow() {
//			
//			findrow.click();
//		}
		public void clickOnvalidfromtext() {
			validfromtext.click();
			
		}
		public void clickOnsearchbutton() {
			searchbutton.click();
		}
		public void clickOnresetbutton() {
			resetbutton.click();
		}
//		public void enterselectallValueInDropDown() {
//			// TODO Auto-generated method stub
//			
//		}
//		public void RsclickOnDropDown() {
//			// TODO Auto-generated method stub
//			RsclickOnDropDown.click();
//		}
//		public void enterrescipesetValueInDropDown() {
//			// TODO Auto-generated method stub
			
		}

