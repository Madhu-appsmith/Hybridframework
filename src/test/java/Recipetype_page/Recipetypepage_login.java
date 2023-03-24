package Recipetype_page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.utilites.Base;
import com.tutorialninja.qa.utilites.Utiles;

import Productgroup_page.ProductgroupLogin;

public class Recipetypepage_login extends Base {

	public WebDriver driver;
	AccountLoginPage alp;

	public Recipetypepage_login() {
		super();
	}

	@BeforeTest
	public void setup() {
		driver = intializeBrowser();
		alp = new AccountLoginPage(driver);
		
	}

	@Test(priority = 1)
	public void reciprtypepagelogin() throws InterruptedException {
		Thread.sleep(2000);
		ARMPage armPage=alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"), testDataProp.getProperty("validPassword"));
		Thread.sleep(5000);
		armPage.clickOnRecipetypetext();
		System.out.println();

	}
	@AfterTest
	public void close() {
		driver.close();
	}
}