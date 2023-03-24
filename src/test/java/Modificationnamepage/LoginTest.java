package Modificationnamepage;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.AccountLoginPage;
//import com.artoftesting.base.TestBase;
//import com.artoftesting.pages.SauceDemoLoginPage;
//import com.artoftesting.test.SauceDemoInventoryPage;
//import com.artoftesting.test.SauceDemoLoginTest;
//import com.artoftesting.util.ExcelUtil;
import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.utilites.Base;
import com.tutorialninja.qa.utilites.Utiles;

public class LoginTest extends Base {

	
	public WebDriver driver;
	AccountLoginPage alp;

	public LoginTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		driver = intializeBrowser();
		alp = new AccountLoginPage(driver);
		
	}

	@Test(priority = 1)
	public void verifyLoggingIntoApplicationWithValidCredentials() throws InterruptedException {
		Thread.sleep(2000);
		ARMPage armPage=alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"), testDataProp.getProperty("validPassword"));
		
		//ARMPage armPage = alp.enterCreditialsInLoginPage(driver);
		Boolean isModificationText = armPage.verufyModificationText();

		Assert.assertTrue(isModificationText);

	}
//	public void addProductsToCart() throws InterruptedException {
//	      ProductCanvas pc = new ProductCanvas(driver);
//	      int count = pc.getPrices().size();
//	      System.out.println(count);
//	    }
//	}
//	@Test(priority = 1)
//	public void verifyLoggingIntoApplicationWithInValidCredentials() {
//		alp.enterCreditialsInLoginPage(Utiles.generateRandomMail(),Utiles.generateRandomPassowrd());
//		Boolean confirmationtext = alp.checkWaringTextMsgWhenUserEnterWrongCredentials();
//		Assert.assertTrue(confirmationtext);
//	}
//	@Test(priority =2)
//	public void verifyLoggingIntoApplicationWithOutCredentials() {
//		alp.clickOnloginButton();
//		Boolean confirmationtext = alp.checkWaringTextMsgWhenUserEnterWrongCredentials();
//		Assert.assertTrue(confirmationtext);
//	}
//	

	@DataProvider(name = "setdata")
	public Object[][] setData() {
		Object[][] xlData = Utiles.excelReader("Sheet1");
		return xlData;
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}

