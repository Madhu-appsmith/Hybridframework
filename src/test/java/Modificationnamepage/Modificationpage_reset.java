package Modificationnamepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.utilites.Base;

public class Modificationpage_reset extends Base {

	public WebDriver driver;
	AccountLoginPage alp;
	ARMPage arm;

	public Modificationpage_reset() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver = intializeBrowser();
		alp= new AccountLoginPage(driver);
		
	}

	
	
	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */

	@Test
	public void Modificationpagereset() throws InterruptedException {
		Thread.sleep(2000);
		arm=alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"),testDataProp.getProperty("validPassword"));
		Thread.sleep(2000);
		arm.enterDataInText(testDataProp.getProperty("mdFirst"));
		Thread.sleep(2000);
		arm.enterDataInText2(testDataProp.getProperty("mdSecond"));
		Thread.sleep(2000);
		arm.enter7daysValueInDropDown();
		Thread.sleep(2000);
		arm.clickOnsearchButton();
		Thread.sleep(5000);
		arm.clickOnresetButton();
		Thread.sleep(5000);
		Boolean isEndText = arm.verufyEndText();

		Assert.assertTrue(isEndText);

	}
	@AfterTest
	public void close() {
		driver.close();
	}
}



