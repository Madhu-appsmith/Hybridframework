import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.utilites.Base;

public class login extends Base {

	
	public WebDriver driver;
	AccountLoginPage alp;

	public login() {
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
		alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"), testDataProp.getProperty("validPassword"));
		//alp.clickOnloginButton();
}}