package com.tutorialninja.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recipetypepage {
public WebDriver driver;
	
	public Recipetypepage(WebDriver driver2) {
		PageFactory.initElements(driver, this);
		this.driver=driver2;
	}
	
		//Objects Of WebElements
		@FindBy(xpath="//span[text()='Modification Maintenance']")
		private WebElement ModificationText;
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
		@FindBy(xpath="//div[@class='rc-select-selection-overflow']")
		private WebElement RtpclickOnDropDown;
		@FindBy(xpath="//span[@class='bp3-control-indicator']")
		private WebElement RtpdropdownfindField;
		@FindBy(xpath="//span[@class='bp3-control-indicator']")
		private WebElement RtpclickField;
		@FindBy(xpath="//button[@class='bp3-button bp3-disabled bp3-fill sc-hGEFff cZGYpl']")
		private WebElement RtsearchButton;
		@FindBy(xpath="//div[@role='row']//div[@role='gridcell' and @tabindex='0']")
		private WebElement findrow;
		@FindBy(xpath="//span[text()='Products Group']")
		private WebElement Productgrouptext;
		@FindBy(xpath="//span[text()='Recipe Type']")
		private WebElement Recipetypetext;
//		
		
		
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
			pgreset.click();
		}
	
//		public void enterDataInText2(String mdSecond) {
//			mdSecondField.sendKeys(mdSecond);
//		}
		
		public void enterselectallValueInDropDown() {  //label[text()='Select all'] //span[text()='Select option(s)']
			RtpclickOnDropDown.click();
			RtpdropdownfindField.click();
			
		}
			public void clickFiled() {
				RtpclickField.click();
			
		}
		public void clickOnsearchRtButton() {
			RtsearchButton.click();  //act.doubleClick(ele).perform();
//		}
//List<WebElement> RtsearchButton1 = driver.findElements(By.xpath("//button[@class='bp3-button bp3-disabled bp3-fill sc-hGEFff cZGYpl']"));
//		Actions act = new Actions(driver);
//		act.doubleClick(RtsearchButton1).perform();
		}

		public void findrow() {
			
			findrow.click();
		}
		public void clickOnProductgrouptext() {
			Productgrouptext.click();
			
		}
		public void clickOnRecipetypetext() {
			Recipetypetext.click();
		}
//		public void enterselectallValueInDropDown() {
//			// TODO Auto-generated method stub
//			
//		}
		
}

	



