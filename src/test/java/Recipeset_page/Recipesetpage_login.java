package Recipeset_page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.pages.Recipesetpage;
import com.tutorialninja.qa.utilites.Base;

public class Recipesetpage_login extends Base {

	public WebDriver driver;
	AccountLoginPage alp;
	Recipesetpage Rst;

	public Recipesetpage_login() {
		super();
	}

	@BeforeTest
	public void setup() {
		driver = intializeBrowser();
		alp = new AccountLoginPage(driver);
		Rst = new Recipesetpage(driver);
	}

	@Test(priority = 1)
	public void reciprtypepagelogin() throws InterruptedException {
		Thread.sleep(2000);
		ARMPage armPage = alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"),
				testDataProp.getProperty("validPassword"));
		Thread.sleep(2000);
		armPage.clickOnRecipesettext();
//		Boolean isviewaddrecipesetText = Rst.verufyviewaddrecipesetText();
//		Assert.assertTrue(isviewaddrecipesetText);

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}