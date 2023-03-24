package Productgroup_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.utilites.Base;

public class Searchcriteria extends Base {

	public WebDriver driver;
	ProductgroupLogin plp;
	AccountLoginPage alp;

	public Searchcriteria() {
		super();
	}

	public Searchcriteria(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() {
		driver = intializeBrowser();
		plp = new ProductgroupLogin(driver);
		alp = new AccountLoginPage(driver);
	}

	@Test(priority = 1)
	public void verifyLoggingIntoApplicationWithValidCredentials() throws InterruptedException {
		Thread.sleep(5000);
		ARMPage armPage = alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"),
				testDataProp.getProperty("validPassword"));
		Thread.sleep(2000);
		armPage.clickOnProductgrouptext();


}
}